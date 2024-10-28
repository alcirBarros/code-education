package br.com.relatorio.webservice;

import br.com.relatorio.webservice.dynaminc.mapasondagem.report.MapaSondagemDynamic;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.jasper.builder.export.JasperPdfExporterBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import org.springframework.stereotype.Component;

@Component
@Path("/download/v2")
public class Teste02 {

    @GET
    @Path("/pdf")
    public Response getReportPdf() throws Exception {
        JasperReportBuilder jasperReportBuilder = (JasperReportBuilder) new MapaSondagemDynamic().gerarReport();

        StreamingOutput output = (out) -> {
            try {
                JasperPdfExporterBuilder exporter = DynamicReports.export.pdfExporter(out);
                jasperReportBuilder.toPdf(exporter);
            } catch (Exception ex) {
                throw new WebApplicationException(ex, Response.Status.INTERNAL_SERVER_ERROR);
            }
        };

        Response response = Response.ok(output).type("application/pdf").header("Content-disposition", "inline; filename=reportList.pdf").build();

        return response;
    }

}
