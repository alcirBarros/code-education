package br.com.relatorio.webservice;

import br.com.relatorio.webservice.dynaminc.mapasondagem.report.MapaSondagemDynamic;
import java.io.IOException;
import java.io.OutputStream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.exception.DRException;
import org.springframework.stereotype.Component;

@Component
@Path("/download/v1")
public class Teste01 {

//    http://localhost:8080/webservice/download/v1/pdf?report=4234
    @GET
    @Path("/pdf")
    public Response downloadPdfFile(@QueryParam("report") String report) throws DRException {

        StreamingOutput fileStream = new Download();

        return Response.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM).header("Content-Disposition", "attachment; filename=somefile.pdf").build();
    }

    class Download implements StreamingOutput {

        @Override
        public void write(OutputStream output) throws IOException, WebApplicationException {
            try {

                JasperReportBuilder gerarReport = (JasperReportBuilder) new MapaSondagemDynamic().gerarReport();

                gerarReport.toPdf(output);

                output.flush();
                output.close();
            } catch (Exception e) {
                throw new WebApplicationException("File Not Found !!");
            }
        }

    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/studentpdf", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> studentsReport() {
        @SuppressWarnings("rawtypes")
        List students = (List<Student>) studentService.findAll();
        ByteArrayInputStream bis = GeneratePdf.studentsReport(students);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=studentsreport.pdf");
        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));
    }

    @RequestMapping(value = "/students.xlsx")
    public ResponseEntity<InputStreamResource> excelStudentsReport() throws IOException {
        List<Student> students = (List<Student>) studentService.findAll();

        ByteArrayInputStream in = GenerateExcel.customersToExcel(students);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachament; filename=students.xlsx");
        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
    }

}
