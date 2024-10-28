package br.com.context.model.bairro;

import br.com.context.model.cidade.CidadeEntity;
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
@Table(name = "brr_bairro", catalog = "logradouro")
public class BairroEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brr_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cdd_id", referencedColumnName = "cdd_id")
    private CidadeEntity cidade;

    @Column(name = "brr_nome")
    private String nome;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    public static BairroEntity criarInstancia() {
        BairroEntity bairro = new BairroEntity();
        bairro.setCidade(CidadeEntity.criarInstancia());
        return bairro;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public CidadeEntity getCidade() {
        return cidade;
    }

    public void setCidade(CidadeEntity cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        stringBuilder.append(cidade.getDisplay());
        stringBuilder.append(", ");
        stringBuilder.append(nome);
        return stringBuilder.toString();
    }
}
