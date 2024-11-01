package br.com.context.model.funcao;

import br.com.context.model.AbstractEntidade;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "fnc_funcao")
@Inheritance(strategy = InheritanceType.JOINED)
public class FuncaoEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fnc_id", nullable = false)
    private Integer id;

    @Column(name = "fnc_nome", length = 100)
    private String nome;

    @Column(name = "fnc_descricao", length = 100)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "fnc_fipo_funcao_enum")
    private TipoFuncaoEnum tipoFuncaoEnum;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fnt_id", referencedColumnName = "fnt_id", nullable = false, foreignKey = @ForeignKey(name = "fk_fnc_fnt_id"))
    private FuncaoTelaEntity funcaoTela;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoFuncaoEnum getTipoFuncaoEnum() {
        return tipoFuncaoEnum;
    }

    public void setTipoFuncaoEnum(TipoFuncaoEnum tipoFuncaoEnum) {
        this.tipoFuncaoEnum = tipoFuncaoEnum;
    }

    public FuncaoTelaEntity getFuncaoTela() {
        return funcaoTela;
    }

    public void setFuncaoTela(FuncaoTelaEntity funcaoTela) {
        this.funcaoTela = funcaoTela;
    }

    @Override
    public String getDisplay() {
        return nome;
    }
}
