package br.com.webservice.integracao.realizarmatriculasemra;

import br.com.context.model.AbstractEntidade;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "contato")
@Inheritance(strategy = InheritanceType.JOINED)
public class Contato extends AbstractEntidade {

}
