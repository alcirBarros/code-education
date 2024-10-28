package br.com.context.config.batch.step.processor.step;

import br.com.context.model.Privilege;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Privilege, Privilege> {

    @Override
    public Privilege process(Privilege privilege) throws Exception {
        return null;
    }
}
