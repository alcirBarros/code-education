//package br.com.repository.integracao.consultaformacaoclasse;
//
//import br.com.domain.auxiliar.statusresponse.StatusResponseEnum;
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasse;
//import br.com.projeto.exception.BusinessException;
////import br.com.repository.db.mysql.repository.GenericRepository;
//import javax.persistence.NoResultException;
//import javax.persistence.TypedQuery;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class ConsultaFormacaoClasseGenericRepository
////        extends GenericRepository 
//{
//
//    public ConsultaFormacaoClasse consultaFormacaoClasse(ConsultaFormacaoClasse consultaFormacaoClasse) {
////        try {
////            String numClasse = consultaFormacaoClasse.getInNumClasse();
////            StringBuilder query = new StringBuilder();
////            query.append("SELECT ");
////            query.append("    cfc ");
////            query.append("FROM ");
////            query.append("    ConsultaFormacaoClasse cfc ");
////            query.append("WHERE ");
////            query.append("    cfc.statusResponseEnum = :statusResponseEnum");
////            query.append("    and cfc.inNumClasse = :numClasse ");
////            query.append("ORDER BY cfc.dataHoraAlteracao DESC ");
////            TypedQuery<ConsultaFormacaoClasse> createQuery = em.createQuery(query.toString(), ConsultaFormacaoClasse.class);
////            createQuery.setParameter("statusResponseEnum", StatusResponseEnum.OK);
////            createQuery.setParameter("numClasse", numClasse);
////            createQuery.setMaxResults(1);
////            ConsultaFormacaoClasse consultarFichaAluno = createQuery.getSingleResult();
////            return consultarFichaAluno;
////        } catch (NoResultException e) {
////            throw new BusinessException();
////        }
//        return null;
//    }
//
//}
