package br.com.context.model.fornecedor;

import br.com.context.model.Instituicao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "frn_fornecedor")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "frn_id", referencedColumnName = "ins_id", foreignKey = @ForeignKey(name = "fk_frn_ins_id"))})
public class Fornecedor extends Instituicao implements Serializable {


}
