package br.com.context.model;

import java.io.Serializable;
import java.util.Random;

public abstract class EntidadeSerialVersion implements Entidade, Serializable {

    private static final long serialVersionUID = 4963221767794543431L;

    private int randomId = new Random().nextInt(Integer.MAX_VALUE);

    @Override
    public int getRandomId() {
        return randomId;
    }

    @Override
    public Serializable getId() {
        return null;
    }

    @Override
    public Serializable getOrderBy() {
        return null;
    }

    @Override
    public String getDisplay() {
        return null;
    }
}
