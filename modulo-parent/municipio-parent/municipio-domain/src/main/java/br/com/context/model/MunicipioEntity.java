package br.com.context.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "mnc_municipio")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "mnc_id", referencedColumnName = "ins_id", foreignKey = @ForeignKey(name = "fk_mnc_ins_id"))})
public class MunicipioEntity extends InstituicaoEntity implements Serializable {

}
