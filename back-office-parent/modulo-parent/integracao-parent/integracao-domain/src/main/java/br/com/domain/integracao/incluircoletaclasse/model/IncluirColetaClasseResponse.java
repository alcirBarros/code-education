package br.com.domain.integracao.incluircoletaclasse.model;

import br.com.domain.implement.ResponseEntity;
import br.com.domain.prodesp.ProdespResponse;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "icr_incluir_coleta_classe_response")
@PrimaryKeyJoinColumn(name = "icr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_icr_pdr_id"))
public class IncluirColetaClasseResponse extends ProdespResponse implements ResponseEntity, Serializable {

    @Column(name = "icr_codigo_processo")
    private String outProcessoID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rcc_id", referencedColumnName = "rcc_id")
    private ResponseIncluirColetaClasse responseIncluirColetaClasse;

    @Override
    public String getOutProcessoID() {
        return outProcessoID;
    }

    public void setOutProcessoID(String outProcessoID) {
        this.outProcessoID = outProcessoID;
    }

    public ResponseIncluirColetaClasse getResponseIncluirColetaClasse() {
        return responseIncluirColetaClasse;
    }

    public void setResponseIncluirColetaClasse(ResponseIncluirColetaClasse responseIncluirColetaClasse) {
        this.responseIncluirColetaClasse = responseIncluirColetaClasse;
    }

}
