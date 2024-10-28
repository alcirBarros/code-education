package br.com.context.model.tipologradouro;

import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tlg_tipo_logradouro", catalog = "logradouro")
public class TipoLogradouroEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tlg_id")
    private Integer id;

    @Column(name = "tlg_nome", length = 255)
    private String nome;

    public static TipoLogradouroEntity criarInstancia() {
        return new TipoLogradouroEntity();
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDisplay() {
        return nome;
    }
}
