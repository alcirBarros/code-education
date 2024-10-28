
import br.com.relatorio.SpringApplicationRelatorio;
import br.com.relatorio.webservice.dynaminc.mapasondagem.report.MapaSondagemDynamic;
import java.io.FileOutputStream;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.exception.DRException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

//@ActiveProfiles({"test"})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringApplicationRelatorio.class)
public class MapaSondagemDynamicTest {

    @Autowired
    private MapaSondagemDynamic relatorio;

    @Test
    public void test01() throws Exception {

        JasperReportBuilder jasperReportBuilder = (JasperReportBuilder) relatorio.gerarReport();
        jasperReportBuilder.toPdf(new FileOutputStream("//tmp//report.pdf"));

    }
}
