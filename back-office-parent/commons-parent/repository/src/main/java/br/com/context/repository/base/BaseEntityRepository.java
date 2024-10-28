package br.com.context.repository.base;

import br.com.context.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BaseEntityRepository extends JpaRepository<BaseEntity, UUID> {



}
