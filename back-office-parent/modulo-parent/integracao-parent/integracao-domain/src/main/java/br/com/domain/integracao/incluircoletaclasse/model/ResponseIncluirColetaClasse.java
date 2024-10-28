package br.com.domain.integracao.incluircoletaclasse.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rcc_response_incluir_coleta_classe")
public class ResponseIncluirColetaClasse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rcc_id", nullable = false)
    private Integer id;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "mir_mensagem_incluir_coleta_classe_response",
            joinColumns = {
                @JoinColumn(name = "rcc_id", referencedColumnName = "rcc_id", foreignKey = @ForeignKey(name = "fk_mir_rcc_id"))},
            inverseJoinColumns = {
                @JoinColumn(name = "mic_id", referencedColumnName = "mic_id", foreignKey = @ForeignKey(name = "fk_mir_mic_id"))})
    private Set<MsgIncluirColetaClasse> msgIncluirColetaClasse = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<MsgIncluirColetaClasse> getMsgIncluirColetaClasse() {
        return msgIncluirColetaClasse;
    }

    public void setMsgIncluirColetaClasse(Set<MsgIncluirColetaClasse> msgIncluirColetaClasse) {
        this.msgIncluirColetaClasse = msgIncluirColetaClasse;
    }
}
