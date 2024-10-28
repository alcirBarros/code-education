package br.com.context.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class AbstractEntidade extends EntidadeSerialVersion implements Entidade, Serializable {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.getRandomId());
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
        final AbstractEntidade other = (AbstractEntidade) obj;
        if (!Objects.equals(this.getRandomId(), other.getRandomId())) {
            return false;
        }
        return true;
    }

}
