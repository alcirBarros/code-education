package br.com.context.model.tipodocumento;

import br.com.context.model.AbstractEntidade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "tdc_tipo_documento")
public class TipoDocumentoEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tdc_id")
    private Integer id;

    @Column(name = "tdc_descricao")
    private String descricao;

    @Column(name = "tdc_tipo_movimento", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoMovimentacaoEnum tipoMovimentacaoEnum;

    @Column(name = "tdc_tipo_documento_enum", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDocumentoEnum tipoDocumentoEnum;

    @Column(name = "tdc_ativo")
    private Boolean ativo = Boolean.TRUE;

    @ManyToMany()
    @JoinTable(name = "dep_documento_exige_preenchimento",
            joinColumns = {
                @JoinColumn(name = "tdc_id", referencedColumnName = "tdc_id", foreignKey = @ForeignKey(name = "fk_dep_tdc_id"))},
            inverseJoinColumns = {
                @JoinColumn(name = "txp_id", referencedColumnName = "txp_id", foreignKey = @ForeignKey(name = "fk_dep_txp_id"))})
    private List<TipoExigePreenchimentoEntity> exigePreenchimentoList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "dep_documento_exige_preenchimento_origem",
            joinColumns = {
                @JoinColumn(name = "tdc_id", referencedColumnName = "tdc_id", foreignKey = @ForeignKey(name = "fk_dep_tdc_id"))},
            inverseJoinColumns = {
                @JoinColumn(name = "tto_id", referencedColumnName = "tto_id", foreignKey = @ForeignKey(name = "fk_dep_tto_id"))})
    private List<TipoTramitacaoOrigemEntity> tipoTramitacaoOrigemList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "dep_documento_exige_preenchimento_destino",
            joinColumns = {
                @JoinColumn(name = "tdc_id", referencedColumnName = "tdc_id", foreignKey = @ForeignKey(name = "fk_dep_tdc_id"))},
            inverseJoinColumns = {
                @JoinColumn(name = "ttd_id", referencedColumnName = "ttd_id", foreignKey = @ForeignKey(name = "fk_dep_ttd_id"))})
    private List<TipoTramitacaoDestinoEntity> tipoTramitacaoDestinoList = new ArrayList<>();

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoMovimentacaoEnum getTipoMovimentacaoEnum() {
        return tipoMovimentacaoEnum;
    }

    public void setTipoMovimentacaoEnum(TipoMovimentacaoEnum tipoMovimentacaoEnum) {
        this.tipoMovimentacaoEnum = tipoMovimentacaoEnum;
    }

    public TipoDocumentoEnum getTipoDocumentoEnum() {
        return tipoDocumentoEnum;
    }

    public void setTipoDocumentoEnum(TipoDocumentoEnum tipoDocumentoEnum) {
        this.tipoDocumentoEnum = tipoDocumentoEnum;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<TipoExigePreenchimentoEntity> getExigePreenchimentoList() {
        return exigePreenchimentoList;
    }

    public void setExigePreenchimentoList(List<TipoExigePreenchimentoEntity> exigePreenchimentoList) {
        this.exigePreenchimentoList = exigePreenchimentoList;
    }

    public TipoExigePreenchimentoEntity[] getExigePreenchimentoArray() {
        return exigePreenchimentoList.stream().toArray(TipoExigePreenchimentoEntity[]::new);
    }

    public void setExigePreenchimentoArray(TipoExigePreenchimentoEntity[] tipoExigePreenchimentoArray) {
        this.exigePreenchimentoList = Arrays.stream(tipoExigePreenchimentoArray).collect(Collectors.toList());
    }

    public List<TipoTramitacaoOrigemEntity> getTipoTramitacaoOrigemList() {
        return tipoTramitacaoOrigemList;
    }

    public void setTipoTramitacaoOrigemList(List<TipoTramitacaoOrigemEntity> tipoTramitacaoOrigemList) {
        this.tipoTramitacaoOrigemList = tipoTramitacaoOrigemList;
    }

    public List<TipoTramitacaoDestinoEntity> getTipoTramitacaoDestinoList() {
        return tipoTramitacaoDestinoList;
    }

    public void setTipoTramitacaoDestinoList(List<TipoTramitacaoDestinoEntity> tipoTramitacaoDestinoList) {
        this.tipoTramitacaoDestinoList = tipoTramitacaoDestinoList;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }
}
