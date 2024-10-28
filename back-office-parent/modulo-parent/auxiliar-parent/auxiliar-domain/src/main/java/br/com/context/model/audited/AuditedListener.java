package br.com.context.model.audited;

import java.io.Serializable;
import org.hibernate.envers.EntityTrackingRevisionListener;
import org.hibernate.envers.RevisionType;

public class AuditedListener implements EntityTrackingRevisionListener {

    @Override
    public void newRevision(Object object) {
        AuditedEnvers auditedEnvers = (AuditedEnvers)object;
        auditedEnvers.setNome("---------");
        
    }

    @Override
    public void entityChanged(Class entityClass, String arg1, Serializable arg2, RevisionType arg3, Object revisionEntity) {
        String type = entityClass.getName();
    }
    
}