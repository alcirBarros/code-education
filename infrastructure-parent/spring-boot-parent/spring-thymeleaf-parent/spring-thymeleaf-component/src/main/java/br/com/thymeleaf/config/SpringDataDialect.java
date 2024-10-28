package br.com.thymeleaf.config;

import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class SpringDataDialect implements IProcessorDialect {
    public static final String PREFIX = "sd";
    public static final String NAME = "SpringDataDialect";
    public static final int PRECEDENCE = 1000;

    public String getName() {
        return NAME;
    }

    public String getPrefix() {
        return PREFIX;
    }

    public int getDialectProcessorPrecedence() {
        return PRECEDENCE;
    }

    @Override
    public Set<IProcessor> getProcessors(String s) {
        Set<IProcessor> processors = new HashSet();
        processors.add(new PaginationAttrProcessor("sd"));
        return processors;
    }
}
