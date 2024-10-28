package br.com.context.model.driver;

import br.com.context.model.AbstractEntidade;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name = "drv_driver", catalog = "driver")
@Inheritance(strategy = InheritanceType.JOINED)
public class DriverEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "drv_uuid", updatable = false, nullable = false)
    private UUID uuid;

    @Column(name = "drv_complemento", scale = 255, nullable = false)
    private String descricao;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }
}
