package br.com.service.eventoautomatico;

import br.com.context.model.eventoautomatico.EventoAutomatico;
import br.com.repository.eventoautomatico.EventoAutomaticoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoAutomaticoService {

    @Autowired
    private EventoAutomaticoRepository eventoAutomaticoRepository;

    public EventoAutomatico save(EventoAutomatico eventoAutomatico) {
        return eventoAutomaticoRepository.save(eventoAutomatico);
    }

    public void delete(EventoAutomatico eventoAutomatico) {
        eventoAutomaticoRepository.delete(eventoAutomatico);
    }

    public EventoAutomatico findById(Integer eventoAutomaticoId) {
        return eventoAutomaticoRepository.findById(eventoAutomaticoId).get();
    }

    public List<EventoAutomatico> findAll() {
        return eventoAutomaticoRepository.findAll();
    }

//
//    @Autowired
//    private EventoAutomaticoDAO eventoAutomaticoDAO;
//    @Autowired
//    private EventoAutomaticoFactory eventoAutomaticoFactory;
//    @Autowired
//    private WebServiceClientService webServiceClientService;
//
//    private final static HashMap<Integer, Service> serviceMap = new HashMap<>();
//
//    public String statusServico() {
//        return webServiceClientService.statusServico();
//    }
//
//
//
//    public EventoAutomatico agenarEventoAutomatico(EventoAutomatico eventoAutomatico) {
//        eventoAutomatico = webServiceClientService.agendarEventoAutomatico(eventoAutomatico);
//        return eventoAutomaticoDAO.alterar(eventoAutomatico);
//    }
//
//
//
//    private Boolean validaExecutar(EventoAutomatico eventoAutomatico) {
//        Boolean result = Boolean.TRUE;
//        if (eventoAutomatico == null || eventoAutomatico.getId() == null) {
//            throw new BusinessException("message.evento.info.evento");
//        }
//        return result;
//    }
//
//    public EventoAutomatico executar(EventoAutomatico eventoAutomatico) {
//        if (validaExecutar(eventoAutomatico)) {
//            eventoAutomatico = eventoAutomaticoDAO.localizar(eventoAutomatico.getId());
//            Service service = serviceMap.get(eventoAutomatico.getId());
//            if (service == null) {
//                service = new Service(eventoAutomatico);
//                service.getThread().start();
//                serviceMap.put(eventoAutomatico.getId(), service);
//            } else {
//                throw new BusinessException("message.evento.info.executando", eventoAutomatico.getId());
//            }
//        }
//        return eventoAutomatico;
//    }
//
//    private class Service implements Runnable {
//
//        private EventoAutomatico eventoAutomatico;
//
//        private final Thread thread;
//
//        public Service(EventoAutomatico eventoAutomatico) {
//            this.eventoAutomatico = eventoAutomatico;
//            thread = new Thread(this);
//        }
//
//        @Override
//        public void run() {
//            try {
//                System.out.println("Inicio Thread " + eventoAutomatico.getId());
//
//                Instant dataHoraInicio = Instant.now();
//
//                eventoAutomatico = beforeRun(eventoAutomatico);
//                eventoAutomatico = thread(eventoAutomatico);
//                Duration duration = Duration.between(Instant.now(), dataHoraInicio);
//                eventoAutomatico = afterRun(eventoAutomatico, duration);
//
//                System.out.println("Fim Thread " + eventoAutomatico.getId());
//                System.out.println("Duração " + duration);
//            } catch (Exception ex) {
//                Logger.getLogger(EventoAutomaticoService.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                Service remove = serviceMap.remove(eventoAutomatico.getId());
//                remove.getThread().interrupt();
//            }
//        }
//
//        private EventoAutomatico beforeRun(EventoAutomatico eventoAutomatico) {
//            eventoAutomatico.setStatusExecucao(StatusExecucao.EXECUTANDO);
//            eventoAutomatico.getEvento().setDataHoraUltimaExecucao(new Date());
//            eventoAutomatico.getEvento().setQuantidadeExecucao(eventoAutomatico.getEvento().getQuantidadeExecucao().add(BigDecimal.ONE));
//
//            EventoHistoricoExecucao eventoHistoricoExecucao = EventoHistoricoExecucao.criaInstancia(eventoAutomatico.getEvento());
//            eventoHistoricoExecucao.setDataHora(new Date());
//            eventoHistoricoExecucao.setStatusExecucao(StatusExecucaoEnum.EXECUTANDO);
//
//            eventoAutomatico.getEvento().setEventoHistoricoExecucao(eventoHistoricoExecucao);
//
//            eventoAutomatico.getEvento().getEventoHistoricoExecucaoList().add(eventoHistoricoExecucao);
//
//            return eventoAutomaticoDAO.alterar(eventoAutomatico);
//        }
//
//        private EventoAutomatico thread(final EventoAutomatico eventoAutomatico) {
//            try {
//                IEventoAutomatico iEventoAutomatico = eventoAutomaticoFactory.eventoAutomatico(eventoAutomatico.getEvento().getTipoEventoAutomaticoEnum());
//                iEventoAutomatico.evento(eventoAutomatico);
//                eventoAutomatico.getEvento().getEventoHistoricoExecucao().setStatusExecucao(StatusExecucaoEnum.EXECUTADO);
//            } catch (Exception ex) {
//                eventoAutomatico.getEvento().getEventoHistoricoExecucao().setStatusExecucao(StatusExecucaoEnum.NAO_EXECUTADO);
//                Logger.getLogger(EventoAutomaticoService.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
//                ex.printStackTrace();
//            } finally {
//                return eventoAutomatico;
//            }
//        }
//
//        private EventoAutomatico afterRun(EventoAutomatico eventoAutomatico, Duration duration ) {
//            Evento evento = (Evento) eventoAutomatico.getEvento();
//            eventoAutomatico.setStatusExecucao(StatusExecucaoEnum.AGENDADO);
//            evento.getEventoHistoricoExecucaoList().stream().filter(x -> x.getId().equals(evento.getEventoHistoricoExecucao().getId())).findAny().ifPresent(x-> x.setDuracaoExecucao(duration));
//            return eventoAutomaticoDAO.alterar(eventoAutomatico);
//        }
//
//        public Thread getThread() {
//            return thread;
//        }
//
//        public EventoAutomatico getEventoAutomatico() {
//            return eventoAutomatico;
//        }
//    }
}
