//package br.com.web.configuracao.sistema.model;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import br.com.projeto.configuracao.Configuracao;
//import br.com.projeto.configuracao.TipoProjetoEnum;
//import java.util.Objects;
//
//@Entity
//@Table(name = "cnf_configuracao")
//public class ConfiguracaoWeb implements Configuracao, Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cnf_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "cnf_projeto_enum")
//    private TipoProjetoEnum tipoProjetoEnum;
//
//    @Column(name = "cnf_logo")
//    private String logo;
//
//    @Column(name = "cnf_titulo")
//    private String titulo;
//
//    @Column(name = "cnf_versao")
//    private String versao;
//
//    @Column(name = "cnf_sigla")
//    private String sigla;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getLogo() {
//        return logo;
//    }
//
//    public void setLogo(String logo) {
//        this.logo = logo;
//    }
//
//    @Override
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    @Override
//    public TipoProjetoEnum getTipoProjetoEnum() {
//        return tipoProjetoEnum;
//    }
//
//    @Override
//    public String getVersao() {
//        return versao;
//    }
//
//    public void setVersao(String versao) {
//        this.versao = versao;
//    }
//
//    public String getSigla() {
//        return sigla;
//    }
//
//    public void setSigla(String sigla) {
//        this.sigla = sigla;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 79 * hash + Objects.hashCode(this.id);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final ConfiguracaoWeb other = (ConfiguracaoWeb) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//
//}
