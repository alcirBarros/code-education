package br.com.context.model.tipoconsultafichaaluno;

import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tcf_tipo_consulta_ficha_aluno", catalog = "auxiliar")
public class TipoConsultaFichaAluno extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tcf_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tcf_tipo_consultar_ficha_aluno_enum", length = 60)
    private TipoConsultarFichaAlunoEnum consultarFichaAlunoEnum;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoConsultarFichaAlunoEnum getConsultarFichaAlunoEnum() {
        return consultarFichaAlunoEnum;
    }

    public void setConsultarFichaAlunoEnum(TipoConsultarFichaAlunoEnum consultarFichaAlunoEnum) {
        this.consultarFichaAlunoEnum = consultarFichaAlunoEnum;
    }

    @Override
    public Serializable getOrderBy() {
        return consultarFichaAlunoEnum.getOrderBy();
    }

    @Override
    public String getDisplay() {
        return consultarFichaAlunoEnum.getDisplay();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoConsultaFichaAluno other = (TipoConsultaFichaAluno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
