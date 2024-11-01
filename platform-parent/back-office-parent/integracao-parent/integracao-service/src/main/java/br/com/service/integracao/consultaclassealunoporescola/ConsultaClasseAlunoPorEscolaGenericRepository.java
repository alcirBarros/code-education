//package br.com.service.integracao.consultaclassealunoporescola;
//
//import br.com.domain.auxiliar.statusresponse.StatusResponseEnum;
//import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
//import br.com.projeto.exception.BusinessException;
//import br.com.repository.db.mysql.repository.GenericRepository;
//import javax.persistence.NoResultException;
//import javax.persistence.TypedQuery;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class ConsultaClasseAlunoPorEscolaGenericRepository extends GenericRepository {
//
//    public ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola(ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola) {
//        try {
//
//            String anoLetivo = consultaClasseAlunoPorEscola.getInAnoLetivo();
//            String codEscola = consultaClasseAlunoPorEscola.getInCodEscola();
//
//            StringBuilder query = new StringBuilder();
//            query.append("SELECT ");
//            query.append("    cae ");
//            query.append("FROM ");
//            query.append("    ConsultaClasseAlunoPorEscola cae ");
//            query.append("WHERE ");
//            query.append("    cae.statusResponseEnum = :statusResponseEnum");
//            query.append("    AND cae.inAnoLetivo = :anoLetivo ");
//            query.append("    AND cae.inCodEscola = :codEscola ");
//            query.append("ORDER BY cae.dataHoraAlteracao DESC ");
//            TypedQuery<ConsultaClasseAlunoPorEscola> createQuery = em.createQuery(query.toString(), ConsultaClasseAlunoPorEscola.class);
//            createQuery.setParameter("statusResponseEnum", StatusResponseEnum.OK);
//            createQuery.setParameter("anoLetivo", anoLetivo);
//            createQuery.setParameter("codEscola", codEscola);
//            createQuery.setMaxResults(1);
//            ConsultaClasseAlunoPorEscola consultarFichaAluno = createQuery.getSingleResult();
//            return consultarFichaAluno;
//        } catch (NoResultException e) {
//            throw new BusinessException();
//        }
//    }
//}
