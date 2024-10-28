package br.com.repository.initialize;

import br.com.domain.paciente.Paciente;
import br.com.domain.pessoa.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import br.com.repository.paciente.PacienteRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Order(1)
@Configuration
public class InitializePessoa implements CommandLineRunner {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PersistenceContext
    private EntityManager em;

    @Override
    public void run(String... args) throws Exception {

//        {
//            TypedQuery<Pessoa> query = em.createQuery("select p from Pessoa p", Pessoa.class);
//            List<Pessoa> results = query.getResultList();
//
//            for (Pessoa pessoa : results) {
//
//                pacienteRepository.converter(pessoa.getId());
//                System.out.print(pessoa);
//            }
//
//        }

//        {
//            TypedQuery<Paciente> query = em.createNamedQuery("findAll", Paciente.class);
//            List<Paciente> results = query.getResultList();
//
//            List<Paciente> findByNome = pacienteRepository.findAll();
//            for (Paciente paciente : findByNome) {
//                pacienteRepository.save(paciente);
//                System.out.println(paciente.getNome());
//
//            }
//            System.out.println(findByNome);
//        }

    }
}
