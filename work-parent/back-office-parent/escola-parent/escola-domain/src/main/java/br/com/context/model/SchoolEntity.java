package br.com.context.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "scl_escola")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "ins_id", referencedColumnName = "ins_id", foreignKey = @ForeignKey(name = "fk_scl_ins_id"))})
public class SchoolEntity extends InstituicaoEntity implements Serializable {

    @Column(name = "scl_codigo_escola", scale = 255, nullable = false)
    private String codigoEscola;

    @ManyToOne
    @JoinColumn(name = "mnc_id")
    private MunicipioEntity municipio;

    public String getCodigoEscola() {
        return codigoEscola;
    }

    public void setCodigoEscola(String codigoEscola) {
        this.codigoEscola = codigoEscola;
    }

    public MunicipioEntity getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioEntity municipio) {
        this.municipio = municipio;
    }
}
