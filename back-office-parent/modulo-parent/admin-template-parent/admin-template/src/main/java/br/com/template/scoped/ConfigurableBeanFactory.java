package br.com.template.scoped;

import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.beans.factory.config.SingletonBeanRegistry;

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    public static final String SCOPE_VIEW = "view";
    public static final String SCOPE_SINGLETON = "singleton";
    public static final String SCOPE_PROTOTYPE = "prototype";
    public static final String SCOPE_REQUEST = "request";
    public static final String SCOPE_SESSION = "session";
    public static final String SCOPE_APPLICATION = "application";

    void registerScope(String scopeName, Scope scope);

}
