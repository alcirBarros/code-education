package br.com.context.model.tipoevento.enumerator;


public enum TipoEventoEnum {

    E_MAIL("E-Mail", IEventoAutomaticoEmail.class);

    private final String descricao;
    private final Class classe;

    private TipoEventoEnum(String descricao, Class classe) {
        this.descricao = descricao;
        this.classe = classe;
    }
    
    public String getValue() {
        return this.name();
    }

    public String getDescricao() {
        return descricao;
    }

    public Class getClasse() {
        return classe;
    }

}
