package br.com.relatorio.configuracao.template;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.jasperreports.engine.JRDataSource;

public interface IRelatorio {

    public Object gerarReport() throws Exception;

    public JasperReportBuilder gerar() throws Exception;

    public HeaderDataSource createColumns(HeaderDataSource dataSource) throws Exception;

    public DataSource dataSource(DataSource report) throws Exception;

}
