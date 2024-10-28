//package br.com.repository.integracao.consultarfichaaluno;
//
//import br.com.domain.auxiliar.statusresponse.StatusResponseEnum;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultaRA;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
//import br.com.projeto.exception.BusinessException;
////import br.com.repository.db.mysql.repository.GenericRepository;
//import javax.persistence.NoResultException;
//import javax.persistence.TypedQuery;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class ConsultarFichaAlunoGenericRepository //        extends GenericRepository
//{
//
//    public ConsultarFichaAluno consultarFichaAluno(ConsultaRA consultaRA) {
////        try {
////
////            String numeroRegistroAluno = consultaRA.getInRA();
////            String digitoRegistroAluno = consultaRA.getInDigitoRA();
////            String uf = consultaRA.getInUF();
////
////            StringBuilder query = new StringBuilder();
////            query.append("SELECT ");
////            query.append("    cfl ");
////            query.append("FROM ");
////            query.append("    ConsultarFichaAluno cfl ");
////            query.append("WHERE ");
////            query.append("    cfl.statusResponseEnum = :statusResponseEnum");
////            query.append("    AND cfl.consultaRA.inRA = :numeroRegistroAluno ");
////            query.append("    AND cfl.consultaRA.inDigitoRA = :digitoRegistroAluno ");
////            query.append("    AND cfl.consultaRA.inUF = :uf ");
////            query.append("ORDER BY cfl.dataHoraAlteracao DESC ");
////            TypedQuery<ConsultarFichaAluno> createQuery = em.createQuery(query.toString(), ConsultarFichaAluno.class);
////            createQuery.setParameter("statusResponseEnum", StatusResponseEnum.OK);
////            createQuery.setParameter("numeroRegistroAluno", numeroRegistroAluno);
////            createQuery.setParameter("digitoRegistroAluno", digitoRegistroAluno);
////            createQuery.setParameter("uf", uf);
////            createQuery.setMaxResults(1);
////            ConsultarFichaAluno consultarFichaAluno = createQuery.getSingleResult();
////            return consultarFichaAluno;
////        } catch (NoResultException e) {
////            throw new BusinessException();
////        }
//        return null;
//    }
//}
