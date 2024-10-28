package br.com.context.model.audited;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@Entity
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "REV"))})
@Table(name = "aud_audted", catalog = "hibernate_db_aud")
@RevisionEntity(AuditedListener.class)
public class AuditedEnvers extends DefaultRevisionEntity {

    @Column(name = "aud_nome_operador", nullable = false)
    private String nome;    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   
    
}
