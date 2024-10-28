package br.com.context.model.pessoa;

import br.com.context.model.tipodadoclinico.model.TipoDadoClinico;
import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dcl_dado_clinico")
@Inheritance(strategy = InheritanceType.JOINED)
public class DadoClinco extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dcl_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "nmn_id", referencedColumnName = "nmn_id", nullable = false)
    private AnamneseEntity anamneseEntity;

    @ManyToOne
    @JoinColumn(name = "tcl_id", referencedColumnName = "tcl_id", nullable = false)
    private TipoDadoClinico tipoDadoClinico;

    @Column(name = "dcl_observacao", nullable = false)
    private String observacao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnamneseEntity getAnamnese() {
        return anamneseEntity;
    }

    public void setAnamnese(AnamneseEntity anamneseEntity) {
        this.anamneseEntity = anamneseEntity;
    }

    public TipoDadoClinico getTipoDadoClinico() {
        return tipoDadoClinico;
    }

    public void setTipoDadoClinico(TipoDadoClinico tipoDadoClinico) {
        this.tipoDadoClinico = tipoDadoClinico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    

}
