package br.com.context.config.batch.config;

import br.com.context.config.batch.step.processor.config.ProcessorStep;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
@EnableBatchProcessing
public class BatchConfiguration extends DefaultBatchConfigurer {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private ProcessorStep stepFile;

    @Bean
    public Job job() {
        JobBuilder processAttemptJob = jobBuilderFactory.get("processAttemptJob");
        Step build = stepFile.build();
        return processAttemptJob.start(build).build();
    }

}
