package br.com.domain.integracao.incluircoletaclasse.model;

import br.com.projeto.model.EntidadeSerialVersion;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mic_mensagem_incluir_coleta_classe")
public class MsgIncluirColetaClasse extends EntidadeSerialVersion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mic_id", nullable = false)
    private Integer id;

    @Column(name = "mic_erro", columnDefinition = "TEXT")
    private String outErro;

    @Column(name = "mic_mensagem", columnDefinition = "TEXT")
    private String outMensagem;

    @Column(name = "mic_numero_classe", columnDefinition = "TEXT")
    private String outNumClasse;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutErro() {
        return outErro;
    }

    public void setOutErro(String outErro) {
        this.outErro = outErro;
    }

    public String getOutMensagem() {
        return outMensagem;
    }

    public void setOutMensagem(String outMensagem) {
        this.outMensagem = outMensagem;
    }

    public String getOutNumClasse() {
        return outNumClasse;
    }

    public void setOutNumClasse(String outNumClasse) {
        this.outNumClasse = outNumClasse;
    }
}
