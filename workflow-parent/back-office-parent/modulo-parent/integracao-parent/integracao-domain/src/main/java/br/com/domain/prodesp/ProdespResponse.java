package br.com.domain.prodesp;

//import br.com.domain.configuracao.servicoexterno.model.CustomDateDeserializer;
import br.com.context.model.AbstractEntidade;
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "pdr_prodesp_response")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "pdr_tipo_classe", length = 45, discriminatorType = DiscriminatorType.STRING)
public abstract class ProdespResponse extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pdr_id", nullable = false)
    private Integer id;

    @Column(name = "pdr_tipo_classe", insertable = false, updatable = false)
    private String tipoClasse;

    @Column(name = "pdr_mensagem", columnDefinition = "TEXT")
    private String mensagem;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pdr_data_hora")
//    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date dataHora = new Date();

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(String tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataHora() {
        return dataHora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdespResponse other = (ProdespResponse) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
