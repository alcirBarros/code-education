package br.com.context.model;

import java.io.Serializable;

public interface Entidade extends Serializable{
    
    int getRandomId();
    Serializable getId();
    String getDisplay();
    Serializable getOrderBy();
}
