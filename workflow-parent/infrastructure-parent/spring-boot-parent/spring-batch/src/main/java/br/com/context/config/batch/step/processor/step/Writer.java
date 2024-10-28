package br.com.context.config.batch.step.processor.step;

import br.com.context.model.Privilege;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<Privilege> {

    @Override
    public void write(List<? extends Privilege> list) throws Exception {
        throw new Exception();
    }
}
