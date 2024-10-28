package br.com.relatorio.configuracao.template;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import net.sf.dynamicreports.report.builder.ReportBuilder;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;

public abstract class RelatorioDynamic extends JasperReportBuilder implements IRelatorio {

    @Override
    public Object gerarReport() throws Exception {
        return gerar();
    }

    @Override
    public JasperReportBuilder gerar() throws Exception {
        HeaderDataSource headerDataSource = createColumns(new HeaderDataSource());
        JasperReportBuilder report = report();
        report.setTemplate(Templates.reportTemplate);
        addTitle(report);
        
        report.columns(headerDataSource.columDynamic());
        DataSource dataSource = dataSource(new DataSource(headerDataSource));
        report.setDataSource(dataSource.dRDataSource());
        return report;
    }
    
    protected void addTitle(JasperReportBuilder report){
        String nomeRelatorio = "test";
        byte[] imagem = {12,32};        
        String nomeFantasia = "test";
        String endereco = "test";
        String displayContato = "test";
        
        ComponentBuilder<?, ?> pageTitle = Templates.pageTitle(nomeRelatorio, imagem, nomeFantasia, endereco, displayContato);
        report.addTitle(pageTitle);
    }

    @Override
    public HeaderDataSource createColumns(HeaderDataSource dataSource) throws Exception {
        return dataSource;
    }

    @Override
    public DataSource dataSource(DataSource dataSource) throws Exception {
        return dataSource;
    }

}
