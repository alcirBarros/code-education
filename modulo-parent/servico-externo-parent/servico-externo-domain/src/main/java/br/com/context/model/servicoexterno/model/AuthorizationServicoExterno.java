package br.com.context.model.servicoexterno.model;


//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "asx_authorization_servico_externo")
public class AuthorizationServicoExterno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asx_id", nullable = false)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "sxt_id", referencedColumnName = "sxt_id", nullable = false, foreignKey = @ForeignKey(name = "fk_asx_sxt_id"))
    private ServicoExterno servicoExterno;
    
    @Column(name = "asx_url", columnDefinition = "TEXT")
    private String url;

    @Column(name = "asx_username", columnDefinition = "TEXT")
    private String username;

    @Column(name = "asx_password", columnDefinition = "TEXT")
    private String password;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "asx_data_hora")
//    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date dataHora = new Date();

    public static AuthorizationServicoExterno criarInstancia() {
        AuthorizationServicoExterno authorizationServicoExterno = new AuthorizationServicoExterno();
        return criarInstancia(authorizationServicoExterno);
    }

    public static AuthorizationServicoExterno criarInstancia(AuthorizationServicoExterno authorizationServicoExterno) {
        if (authorizationServicoExterno == null) {
            authorizationServicoExterno = criarInstancia();
        }
        return authorizationServicoExterno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ServicoExterno getServicoExterno() {
        return servicoExterno;
    }

    public void setServicoExterno(ServicoExterno servicoExterno) {
        this.servicoExterno = servicoExterno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final AuthorizationServicoExterno other = (AuthorizationServicoExterno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
