package br.com.context.model.driver;


import br.com.context.model.AbstractEntidade;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "upb_uploaded_objeto", catalog = "driver")
public class UploadedObjectEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                @Parameter(
                        name = "uuid_gen_strategy_class",
                        value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                )
            })
    @Column(name = "upb_uuid", updatable = false, nullable = false)
    private UUID uuid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "obj_uuid", referencedColumnName = "obj_uuid")
    private ObjectEntity objeto;

    @OneToOne
    @JoinColumn(name = "upl_uuid", referencedColumnName = "upl_uuid")
    private UploadedEntity uploaded;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public ObjectEntity getObjeto() {
        return objeto;
    }

    public void setObjeto(ObjectEntity objeto) {
        this.objeto = objeto;
    }

    public UploadedEntity getUploaded() {
        return uploaded;
    }

    public void setUploaded(UploadedEntity uploaded) {
        this.uploaded = uploaded;
    }
}
