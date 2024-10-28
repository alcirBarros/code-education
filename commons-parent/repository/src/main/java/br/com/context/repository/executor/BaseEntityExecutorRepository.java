package br.com.context.repository.executor;

import br.com.context.enumerator.TypeEnum;
import br.com.context.model.BaseEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static org.springframework.data.jpa.domain.Specification.where;

@Repository
public interface BaseEntityExecutorRepository extends JpaRepository<BaseEntity, UUID>, JpaSpecificationExecutor<BaseEntity> {


    static Specification<BaseEntity> has(String stringType) {
        return (baseEntityType, cq, cb) -> cb.equal(baseEntityType.get("stringType"), stringType);
    }

    static Specification<BaseEntity> hasAnyStatus(TypeEnum... status) {
        return (simulation, cq, cb) -> simulation.join("status").get("description").in((Object[]) status);
    }

    static Specification<BaseEntity> find(String stringType, TypeEnum ... typeEnum) {
        //.and(hasAnyStatus(typeEnum));
        return where(has(stringType));
    }

}
