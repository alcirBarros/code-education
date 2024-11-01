package br.com.domain.paciente;


import javax.persistence.Table;

import br.com.domain.pessoa.Pessoa;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@NamedQueries({ @NamedQuery(name = "Paciente.findAll", query = "SELECT s FROM Paciente s") })
@PrimaryKeyJoinColumn(name = "pss_id")
@Table(name = "pcn_paciente", catalog = "paciente")
public class Paciente extends Pessoa {

    
}
