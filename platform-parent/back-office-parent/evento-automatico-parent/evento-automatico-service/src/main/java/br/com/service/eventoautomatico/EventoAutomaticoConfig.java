package br.com.service.eventoautomatico;

import br.com.context.model.eventoautomatico.EventoAutomatico;
import br.com.repository.eventoautomatico.EventoAutomaticoRepository;
import br.com.service.quartz.SchedulerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventoAutomaticoConfig implements CommandLineRunner {

    @Autowired
    private EventoAutomaticoRepository eventoAutomaticoRepository;
    @Autowired
    private SchedulerService schedulerService;

    @Override
    public void run(String... args) throws Exception {
        List<EventoAutomatico> findAll = eventoAutomaticoRepository.findAll();

        for (EventoAutomatico eventoAutomatico : findAll) {

   //         SchedulerJobInfo scheduleNewJob = schedulerService.scheduleNewJob(eventoAutomatico);
        }
    }

}
