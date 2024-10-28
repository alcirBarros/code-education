package br.com.context.model.driver;

import br.com.context.model.AbstractEntidade;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "upl_uploaded", catalog = "driver")
public class UploadedEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                @Parameter(
                        name = "uuid_gen_strategy_class",
                        value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                )
            })
    @Column(name = "upl_uuid", updatable = false, nullable = false)
    private UUID uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "upl_data_hora", nullable = false)
    private Date dataHora = new Date();

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(mappedBy = "uploaded", orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<UploadedObjectEntity> uploadedObjetoList = new ArrayList<>();
    
    
    public void adicionar(ObjectEntity objeto){
        UploadedObjectEntity uploadedObjeto = new UploadedObjectEntity();
        uploadedObjeto.setUploaded(this);
        uploadedObjeto.setObjeto(objeto);
        this.uploadedObjetoList.add(uploadedObjeto);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public List<UploadedObjectEntity> getUploadedObjetoList() {
        return uploadedObjetoList;
    }

    public void setUploadedObjetoList(List<UploadedObjectEntity> uploadedObjetoList) {
        this.uploadedObjetoList = uploadedObjetoList;
    }
}
