package br.com.context;


import br.com.context.service.AthenaService;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.listener.CompositeStepExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@Import(BatchConfigurationTest.class)
public class SpringBatchIntegrationTest {


    @MockBean
    private AthenaService athenaService;

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @Test
    public void defaultJobParameters() throws Exception {
        when(athenaService.queryEligible()).thenReturn("TESTE MOCK");
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString("file.input", "TEST_INPUT");
        jobParametersBuilder.addString("file.output", "TEST_OUTPUT");
        jobParametersBuilder.addString("customersFile", "classpath:customersFile.csv");
        JobExecution execution = jobLauncher.run(job, jobParametersBuilder.toJobParameters());
        assertEquals(BatchStatus.FAILED, execution.getStatus());
        System.out.println("");
    }
}
