package br.com.context.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "est_estabelecimento")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "est_id", referencedColumnName = "ins_id", foreignKey = @ForeignKey(name = "fk_est_ins_id"))})
public class Estabelecimento extends Instituicao implements Serializable {


}
