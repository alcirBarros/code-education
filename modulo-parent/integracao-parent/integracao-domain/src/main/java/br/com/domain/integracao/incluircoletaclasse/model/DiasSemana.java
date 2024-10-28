package br.com.domain.integracao.incluircoletaclasse.model;

import br.com.context.model.diasemana.enumerator.TipoDiaSemanaEnum;
import br.com.context.model.diasemana.model.TipoDiaSemana;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "dsm_dia_semana")
public class DiasSemana implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dsm_id", nullable = false)
    private Integer id;

//    @Column(name = "dsm_segunda", length = 1)
//    private String inSegundaFeira;
//
//    @Column(name = "dsm_terca", length = 1)
//    private String inTercaFeira;
//
//    @Column(name = "dsm_quarta", length = 1)
//    private String inQuartaFeira;
//
//    @Column(name = "dsm_quinta", length = 1)
//    private String inQuintaFeira;
//
//    @Column(name = "dsm_sexta", length = 1)
//    private String inSextaFeira;
//
//    @Column(name = "dsm_sabado", length = 1)
//    private String inSabado;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "imt_tipo_dia_semana",
            joinColumns = {
                @JoinColumn(name = "dsm_id", referencedColumnName = "dsm_id", foreignKey = @ForeignKey(name = "fk_imt_dsm_id"))},
            inverseJoinColumns = {
                @JoinColumn(name = "dsn_id", referencedColumnName = "dsn_id", foreignKey = @ForeignKey(name = "fk_imt_dsn_id"))})
    private Set<TipoDiaSemana> tipoDiaSemanaList = new HashSet<>();

    public static DiasSemana setNull(DiasSemana diasSemana) {
        if (isNotEmpty(diasSemana)) {
            return diasSemana;
        }
        return null;
    }

    private static boolean isNotEmpty(DiasSemana diasSemana) {
        if (diasSemana != null) {
            if (!diasSemana.getTipoDiaSemanaList().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isPresent(TipoDiaSemanaEnum tipoDiaSemanaEnum){
        return tipoDiaSemanaList.stream().filter(x->x.getTipoDiaSemanaEnum().equals(tipoDiaSemanaEnum)).findAny().isPresent();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getInSegundaFeira() {
//        return inSegundaFeira;
//    }
//
//    public void setInSegundaFeira(String inSegundaFeira) {
//        this.inSegundaFeira = inSegundaFeira;
//    }
//
//    public String getInTercaFeira() {
//        return inTercaFeira;
//    }
//
//    public void setInTercaFeira(String inTercaFeira) {
//        this.inTercaFeira = inTercaFeira;
//    }
//
//    public String getInQuartaFeira() {
//        return inQuartaFeira;
//    }
//
//    public void setInQuartaFeira(String inQuartaFeira) {
//        this.inQuartaFeira = inQuartaFeira;
//    }
//
//    public String getInQuintaFeira() {
//        return inQuintaFeira;
//    }
//
//    public void setInQuintaFeira(String inQuintaFeira) {
//        this.inQuintaFeira = inQuintaFeira;
//    }
//
//    public String getInSextaFeira() {
//        return inSextaFeira;
//    }
//
//    public void setInSextaFeira(String inSextaFeira) {
//        this.inSextaFeira = inSextaFeira;
//    }
//
//    public String getInSabado() {
//        return inSabado;
//    }
//
//    public void setInSabado(String inSabado) {
//        this.inSabado = inSabado;
//    }
    public Set<TipoDiaSemana> getTipoDiaSemanaList() {
        return tipoDiaSemanaList;
    }

    public void setTipoDiaSemanaList(Set<TipoDiaSemana> tipoDiaSemanaList) {
        this.tipoDiaSemanaList = tipoDiaSemanaList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final DiasSemana other = (DiasSemana) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
