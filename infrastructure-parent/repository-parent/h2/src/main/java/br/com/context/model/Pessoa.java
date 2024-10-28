package br.com.context.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "pss_pessoa")
public class Pessoa extends Auditable<String> {

    @EmbeddedId
    private PessoaPk pessoaPk;

    @Column(name = "pss_nome", scale = 255, nullable = false)
    private String nome;

    @Comment("I am id")
    @Column(name = "pss_character", length=1)
    private char character;

    @Column(name = "pss_boolean")
    private boolean typeBoolean;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "endereco", column = @Column(name = "pss_endereco"))
    })
    private Endereco endereco;


//    @CreatedBy
//    protected U createdBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date creationDate;

//    @LastModifiedBy
//    protected U lastModifiedBy;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastModifiedDate;

    public PessoaPk getPessoaPk() {
        return pessoaPk;
    }

    public void setPessoaPk(PessoaPk pessoaPk) {
        this.pessoaPk = pessoaPk;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
