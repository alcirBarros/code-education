package br.com.ireport.util;

import java.io.InputStream;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class ReportUtils {

    /**
     * Abre um relatório usando um datasource genérico.
     *
     * @param inputStream InputStream que contém o relatório.
     * @param parametros Parâmetros utilizados pelo relatório.
     * @param dataSource Datasource a ser utilizado pelo relatório.
     * @throws JRException Caso ocorra algum problema na execução do relatório
     */
    public static byte[] openReport(InputStream inputStream, Map<String, Object> parametros, JRDataSource dataSource) throws JRException {
        /*
         * Cria um JasperPrint, que é a versão preenchida do relatório,
         * usando um datasource genérico.
         */
        JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, parametros, dataSource);
//        JasperExportManager.exportReportToPdfFile(jasperPrint, "simple_report.pdf");
        byte[] pdfBytes = JasperExportManager.exportReportToPdf(jasperPrint);
        return pdfBytes;
    }
}
