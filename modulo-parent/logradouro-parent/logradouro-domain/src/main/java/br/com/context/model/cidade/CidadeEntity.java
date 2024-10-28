package br.com.context.model.cidade;

import br.com.context.model.estado.EstadoEntity;
import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cdd_cidade", catalog = "logradouro")
public class CidadeEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdd_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "std_id", referencedColumnName = "std_id")
    private EstadoEntity estado;

    @Column(name = "cdd_codigo_ibge")
    private String codigoIBGE;

    @Column(name = "cdd_nome")
    private String nome;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    public static CidadeEntity criarInstancia() {
        CidadeEntity cidade = new CidadeEntity();
        cidade.setEstado(EstadoEntity.criarInstancia());
        return cidade;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntity estado) {
        this.estado = estado;
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
        stringBuilder.append(nome);
        stringBuilder.append(" - ");
        stringBuilder.append(estado.getUnidadeFederativa());
        return stringBuilder.toString();
    }
}
