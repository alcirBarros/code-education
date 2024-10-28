package br.com.amazon.services.impl;

import com.amazonaws.services.athena.AmazonAthena;
import com.amazonaws.services.athena.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthenaService {

    @Autowired
    private AmazonAthena amazonAthena;


    public void queryEligible() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT ");
        query.append("     cnpj, ");
        query.append("     dt_afiliacao_alelo, ");
        query.append("     anomes, ");
        query.append("     vlr_faturado, ");
        query.append("     dt_arq ");
        query.append("FROM tb_base_elgvl_dsv ");
        query.append("WHERE ");
        query.append("     dt_arq = date('2021-12-27') ");
        query.append("ORDER BY ");
        query.append("     cnpj, ");
        query.append("     anomes ");
        query.append("desc;");

        QueryExecutionContext queryExecutionContext = new QueryExecutionContext().withDatabase("db_hub_bddidev2_analytics_dev");
        ResultConfiguration resultConfiguration = new ResultConfiguration().withOutputLocation("s3://alelo-datalake-athena-query-dev");

        StartQueryExecutionRequest startQueryExecutionRequest = new StartQueryExecutionRequest();
        startQueryExecutionRequest.withQueryString(query.toString());
        startQueryExecutionRequest.withQueryExecutionContext(queryExecutionContext);
        startQueryExecutionRequest.withResultConfiguration(resultConfiguration);

        StartQueryExecutionResult startQueryExecutionResult = this.amazonAthena.startQueryExecution(startQueryExecutionRequest);

        String queryExecutionId = startQueryExecutionResult.getQueryExecutionId();

        GetQueryExecutionRequest getQueryExecutionRequest = new GetQueryExecutionRequest().withQueryExecutionId(queryExecutionId);

        GetQueryExecutionResult getQueryExecutionResult = amazonAthena.getQueryExecution(getQueryExecutionRequest);

        String queryState = getQueryExecutionResult.getQueryExecution().getStatus().getState();

        GetQueryResultsRequest getQueryResultsRequest = new GetQueryResultsRequest().withQueryExecutionId(queryExecutionId);

        GetQueryResultsResult getQueryResultsResult = amazonAthena.getQueryResults(getQueryResultsRequest);
        List<ColumnInfo> columnInfoList = getQueryResultsResult.getResultSet().getResultSetMetadata().getColumnInfo();

        System.out.println(columnInfoList);
    }
}
