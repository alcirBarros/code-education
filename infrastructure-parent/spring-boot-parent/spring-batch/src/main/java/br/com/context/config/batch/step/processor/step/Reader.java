package br.com.context.config.batch.step.processor.step;

import br.com.context.model.Privilege;
import br.com.context.service.AthenaService;
import org.springframework.batch.item.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Reader implements ItemReader<Privilege>, ItemStream {

    @Autowired
    private AthenaService athenaService;

    private Privilege privilege;


    @Override
    public Privilege read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (privilege == null) {
            return privilege = new Privilege();
        }
        return null;
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        Object o = executionContext.get("file.input");
        String list = athenaService.queryEligible();
        System.out.println("");
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        Object o = executionContext.get("file.input");
        System.out.println("");
    }

    @Override
    public void close() throws ItemStreamException {
        System.out.println("");
    }
}
