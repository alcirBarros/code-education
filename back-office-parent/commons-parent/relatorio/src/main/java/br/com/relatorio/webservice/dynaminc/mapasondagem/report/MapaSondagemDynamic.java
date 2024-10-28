package br.com.relatorio.webservice.dynaminc.mapasondagem.report;

import br.com.relatorio.configuracao.domain.aluno.model.Aluno;
import br.com.relatorio.configuracao.template.DataSource;
import br.com.relatorio.configuracao.template.HeaderDataSource;
import br.com.relatorio.configuracao.template.RelatorioDynamic;
import br.com.relatorio.configuracao.domain.mapasondagem.model.MapaSondagem;
import br.com.relatorio.webservice.dynaminc.mapasondagem.service.MapaSondagemService;
import static net.sf.dynamicreports.report.builder.DynamicReports.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapaSondagemDynamic extends RelatorioDynamic {

//    @Autowired
//    private MapaSondagemService mapaSondagemService;
    @Override
    public HeaderDataSource createColumns(HeaderDataSource dataSource) throws Exception {
        dataSource.addHeader(col.column("Número Aluno", "numeroAluno", type.integerType()));
        dataSource.addHeader(col.column("Nome Aluno", "nomeAluno", type.stringType()));

        dataSource.addHeader(col.column("Data Nascimento", "dataNascimento", type.stringType()));

        dataSource.addHeader(col.column("Sondagem inicial", "sondagemInicial", type.dateType()));
        dataSource.addHeader(col.column("Data 1º Sondagem", "dataPrimeiraSondagem", type.dateType()));
        dataSource.addHeader(col.column("Data 2º Sondagem", "dataSegundaSondagem", type.dateType()));
        dataSource.addHeader(col.column("Data 3º Sondagem", "dataTerceiraSondagem", type.dateType()));
        dataSource.addHeader(col.column("Data 4º Sondagem", "dataQuartaSondagem", type.dateType()));

        dataSource.addHeader(col.column("Observação", "observacao", type.stringType()));

        return dataSource;
    }

    @Override
    public DataSource dataSource(DataSource dataSource) throws Exception {

        dataSource.add(1, null, null, null, null, null, null, null);

//        for (MapaSondagem mapaSondagem : list) {
//
//            Integer id = mapaSondagem.getAlunosLocalizacao().getAluno().getId();
//            String nomeAluno = mapaSondagem.getAlunosLocalizacao().getAluno().getPessoa().getNome();
//            String dataNascimento = mapaSondagem.getAlunosLocalizacao().getAluno().getPessoa().getDataNascimento();
//            String observacao = mapaSondagem.getObservacao();
//            Date dataSondagem = mapaSondagem.getDataFimPeriodo();
//
//            dataSource.add(id, nomeAluno, dataNascimento, dataSondagem, null, null, null, null, observacao);
//        }
        return dataSource;
    }

}
