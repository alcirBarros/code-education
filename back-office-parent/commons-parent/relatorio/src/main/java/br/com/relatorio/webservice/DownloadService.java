package br.com.relatorio.webservice;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import org.springframework.stereotype.Component;

//http://localhost:8080/webservice/download/pdf
@Component
@Path("/download")
public class DownloadService {

    private static final String FILE_PATH = "//tmp//test.pdf";

    @GET
    @Path("/pdf")
    public Response downloadPdfFile() {
        StreamingOutput fileStream = new Download();
        

        
        return Response.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM)
                .header("Content-Disposition", "attachment; filename=somefile.pdf")
                .build();
    }

    class Download implements StreamingOutput {

        @Override
        public void write(OutputStream output) throws IOException, WebApplicationException {
            try {
                java.nio.file.Path path = Paths.get(FILE_PATH);
                byte[] data = Files.readAllBytes(path);
                output.write(data);
                output.flush();
            } catch (Exception e) {
                throw new WebApplicationException("File Not Found !!");
            }
        }

    }

}
