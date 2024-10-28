package br.com.context.util;

public interface Constants {

    String DEFAULT_INDEX_PAGE = "index.xhtml";
    String DEFAULT_LOGIN_PAGE = "login.xhtml";
    String DEFAULT_ERROR_PAGE = "500.xhtml";
    String DEFAULT_ACCESS_DENIED_PAGE = "403.xhtml";
    String DEFAULT_EXPIRED_PAGE = "expired.xhtml";
    String DEFAULT_OPTIMISTIC_PAGE = "optimistic.xhtml";
    String DEFAULT_DATE_FORMAT = "MM/dd/yyyy HH:mm:ss";
    String DEFAULT_PAGE_FORMAT = "xhtml";

    interface InitialParams {

        String DISABLE_FILTER = "br.com.template.DISABLE_FILTER";
        String LOGIN_PAGE = "br.com.template.LOGIN_PAGE";
        String ERROR_PAGE = "br.com.template.ERROR_PAGE";
        String INDEX_PAGE = "br.com.template.INDEX_PAGE";
    }

}
