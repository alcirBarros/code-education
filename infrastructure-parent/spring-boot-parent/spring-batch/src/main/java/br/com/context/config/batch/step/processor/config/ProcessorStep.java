package br.com.context.config.batch.step.processor.config;

import br.com.context.config.batch.step.processor.step.Processor;
import br.com.context.config.batch.step.processor.step.Reader;
import br.com.context.config.batch.step.processor.step.Writer;
import br.com.context.model.Privilege;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessorStep {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private Reader reader;

    @Autowired
    private Processor processor;

    @Autowired
    private Writer writer;

    public org.springframework.batch.core.Step build() {
        // Remittance (Step)
        return stepBuilderFactory.get("stepRemittance").<Privilege, Privilege>chunk(50)
                .reader(reader)
                .processor(processor)
                .writer(writer)
           //         .faultTolerant()
                //    .skip(Exception.class)
                .throttleLimit(1)
                .build();
    }
}
