package br.com.thymeleaf.config;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IProcessableElementTag;

public interface PaginationDecorator {

    String getIdentifier();

    String decorate(IProcessableElementTag tag, ITemplateContext context);
}
