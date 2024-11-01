package br.com.context.model.pessoa;

import br.com.context.model.AbstractEntidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nmn_anamnese")
@Inheritance(strategy = InheritanceType.JOINED)
public class AnamneseEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nmn_id", nullable = false)
    private Integer id;

    @Column(name = "nmn_data_hora", nullable = false)
    private Date dataHora = new Date();

    @ManyToOne
    @JoinColumn(name = "pss_id", referencedColumnName = "pss_id", nullable = false)
    private PessoaEntity pessoa;

    @OneToMany(mappedBy = "anamnese", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<DadoClinco> dadoClinicoList = new ArrayList<>();
    
    public void adicionarAnamnse(DadoClinco dadoClinco){
        dadoClinco.setAnamnese(this);
        dadoClinicoList.add(dadoClinco);
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    
    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public List<DadoClinco> getDadoClinicoList() {
        return dadoClinicoList;
    }

    public void setDadoClinicoList(List<DadoClinco> dadoClinicoList) {
        this.dadoClinicoList = dadoClinicoList;
    }

    @Override
    public String getDisplay() {
        return null;
    }
}
