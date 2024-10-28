package br.com.relatorio.configuracao.domain.alunolocalizacao.model;

import br.com.relatorio.configuracao.domain.aluno.model.Aluno;
import br.com.relatorio.configuracao.domain.turma.model.Turma;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbalunos_localizacao")
public class AlunosLocalizacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tbalunos_localizacao_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tbcadastro_alunos_id", referencedColumnName = "tbcadastro_alunos_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "tbturmas_id", referencedColumnName = "tbturmas_id")
    private Turma turma;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final AlunosLocalizacao other = (AlunosLocalizacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
