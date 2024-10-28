package br.com.context.model.pessoa;

import br.com.context.model.escolaridade.model.TipoEscolaridade;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qup_questionario_pessoa", catalog = "pessoa")
public class QuestionarioEstadoCivilEntity extends QuestionarioEntity {

    @ManyToOne
    @JoinColumn(name = "tsl_id", referencedColumnName = "tsl_id")
    private TipoEscolaridade tipoEscolaridade;

}
