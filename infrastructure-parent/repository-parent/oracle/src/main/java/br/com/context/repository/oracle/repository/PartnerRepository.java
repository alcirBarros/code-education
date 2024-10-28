package br.com.context.repository.oracle.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PartnerRepository {

    @PersistenceContext
    protected EntityManager em;
    @Query(value = "SELECT new br.com.alelo.desenvolve.contracting.dto.response.DashboardContractResponse(" +
            " COUNT(contractId), NVL(SUM(totalValue),0), p.name) FROM Partner p" +
            " LEFT JOIN " +
            " (SELECT c.partner.id as partnerId, c.id as contractId, s.creditValue as totalValue FROM Contract c" +
            "   INNER JOIN Simulation s ON c.simulationId = s.id" +
            "   WHERE c.status.id = 1 " +
            "   AND (s.lastInstallmentDate IS NULL OR s.lastInstallmentDate > :actualDate)) sub " +
            " ON sub.partnerId = p.id"+
            " WHERE p.id IN (1,4) " +
            " GROUP BY p.name")

    public List findAll() {
        try {
            StringBuilder query = new StringBuilder();
            query.append("SELECT ");
            query.append("      p ");
            query.append("FROM ");
            query.append("      Partner p ");
            query.append("INNER JOIN ");
            query.append("      (SELECT id, partner, cnpj FROM Simulation) s on p.id = s.partner");
            return em.createQuery(query.toString()).getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
