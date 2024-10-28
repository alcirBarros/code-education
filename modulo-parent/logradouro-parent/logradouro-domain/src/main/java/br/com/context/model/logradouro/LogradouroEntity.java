package br.com.context.model.logradouro;

import br.com.context.model.bairro.BairroEntity;
import br.com.context.model.tipologradouro.TipoLogradouroEntity;
import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lgr_logradouro", catalog = "logradouro")
public class LogradouroEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lgr_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "brr_id", referencedColumnName = "brr_id", foreignKey = @ForeignKey(name = "fk_lgr_brr_id"))
    private BairroEntity bairro;

    @ManyToOne
    @JoinColumn(name = "tlg_id", referencedColumnName = "tlg_id", foreignKey = @ForeignKey(name = "fk_lgr_tlg_id"))
    private TipoLogradouroEntity tipoLogradouro;

    @Column(name = "lgr_tipo_logradou")
    private String nomeTipoLogradouro;

    @Column(name = "lgr_cep")
    private String cep;

    @Column(name = "lgr_nome")
    private String nome;

    @Column(name = "lgr_latitude")
    private String latitude;

    @Column(name = "lgr_longitude")
    private String longitude;

    public static LogradouroEntity criarInstancia() {
        LogradouroEntity logradouro = new LogradouroEntity();
        logradouro.setBairro(BairroEntity.criarInstancia());
        logradouro.setTipoLogradouro(TipoLogradouroEntity.criarInstancia());
        return logradouro;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BairroEntity getBairro() {
        return bairro;
    }

    public void setBairro(BairroEntity bairro) {
        this.bairro = bairro;
    }

    public TipoLogradouroEntity getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouroEntity tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeTipoLogradouro() {
        return nomeTipoLogradouro;
    }

    public void setNomeTipoLogradouro(String nomeTipoLogradouro) {
        this.nomeTipoLogradouro = nomeTipoLogradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bairro.getDisplay());
        stringBuffer.append(", ");
        stringBuffer.append("CEP: ");
        stringBuffer.append(cep);
        stringBuffer.append(", ");
        stringBuffer.append(nome);
        return stringBuffer.toString();
    }
}
