package br.com.template.converter;

import br.com.context.model.Entidade;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import org.springframework.stereotype.Controller;

@Controller
public class GenericEntidadeConverter implements Converter {

    private static final String ATTRIBUTE_ENTIDADE_TYPE = "GenericEntidadeConverter.entidadeType";

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null || value.equals("") || ((Entidade) value).getId() == null) {
            return null;
        }
        if (value instanceof Entidade) {
            List<Entidade> entidadeList = (List<Entidade>) component.getAttributes().get(ATTRIBUTE_ENTIDADE_TYPE);
            if (entidadeList == null) {
                entidadeList = new ArrayList<>();
                entidadeList.add((Entidade) value);
            } else {
                entidadeList.add((Entidade) value);
            }
            component.getAttributes().put(ATTRIBUTE_ENTIDADE_TYPE, entidadeList);
            return String.valueOf(((Entidade) value).getId());
        } else {
            throw new ConverterException(new FacesMessage("Value is not an enum: " + value.getClass()));
        }
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            List<Entidade> entidadeList = (List<Entidade>) component.getAttributes().get(ATTRIBUTE_ENTIDADE_TYPE);
            Entidade abstractEntidade = get(entidadeList, value);
            return abstractEntidade;
        } catch (Exception ex) {
            throw new ConverterException(new FacesMessage("Value is not an enum of type: "));
        }
    }

    public static Entidade get(List<Entidade> abstractEntidadeList, String randomId) {
        Entidade abstractEntidade = null;
        if (abstractEntidadeList != null) {
            for (Entidade abstractEntidade_ : abstractEntidadeList) {
                if (abstractEntidade_ != null && String.valueOf(abstractEntidade_.getId()).equals(randomId)) {
                    abstractEntidade = abstractEntidade_;
                }
            }
        }
        return abstractEntidade;
    }
}
