package br.com.context.model.endereco;

import br.com.context.model.logradouro.LogradouroEntity;
import br.com.context.model.AbstractEntidade;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "end_endereco", catalog = "endereco")
@Inheritance(strategy = InheritanceType.JOINED)
public class EnderecoEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                @Parameter(
                        name = "uuid_gen_strategy_class",
                        value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                )
            })
    @Column(name = "end_uuid", updatable = false, nullable = false)
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "lgr_id", referencedColumnName = "lgr_id")
    private LogradouroEntity logradouro;

    @Column(name = "end_numero", scale = 255)
    private Integer numero;

    @Column(name = "end_complemento", scale = 255)
    private String complemento;

    @Column(name = "end_condominio", scale = 255)
    private String condominio;

    @Column(name = "end_apartamento_sala", scale = 255)
    private String apartamentoSala;

    @Column(name = "end_latitude", scale = 255)
    private String latitude;

    @Column(name = "end_longitude", scale = 255)
    private String longitude;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LogradouroEntity getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(LogradouroEntity logradouro) {
        this.logradouro = logradouro;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public String getApartamentoSala() {
        return apartamentoSala;
    }

    public void setApartamentoSala(String apartamentoSala) {
        this.apartamentoSala = apartamentoSala;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String getDisplay() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(logradouro.getDisplay());
        stringBuilder.append(", ");
        stringBuilder.append("Número: ").append(numero);
        return stringBuilder.toString();
    }
}
