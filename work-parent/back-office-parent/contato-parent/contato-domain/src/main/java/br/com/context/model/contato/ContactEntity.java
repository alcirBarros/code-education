package br.com.context.model.contato;

import br.com.context.model.tipocontato.model.TipoContato;
import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ctt_contato", catalog = "contato")
@Inheritance(strategy = InheritanceType.JOINED)
public class ContactEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ctt_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tct_id", referencedColumnName = "tct_id", foreignKey = @ForeignKey(name = "fk_ctt_tct_id"))
    private TipoContato tipoContato;

    @Column(name = "ctt_nome", scale = 255)
    private String nome;

    @Column(name = "ctt_contato", scale = 255)
    private String contato;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
