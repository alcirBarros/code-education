///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.security.login.session;
//
//import com.sun.faces.renderkit.html_basic.FormRenderer;
//import java.io.IOException;
//import javax.el.ELContext;
//import javax.el.ExpressionFactory;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.context.ResponseWriter;
//
//public class FormWithCSRFRenderer extends FormRenderer {
//
//    @Override
//    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
////        log.debug("FormWithCSRFRenderer - Adding CSRF Token to form element");
//        ELContext elContext = context.getELContext();
//        ExpressionFactory expFactory = context.getApplication().getExpressionFactory();
//
//        ResponseWriter writer = context.getResponseWriter();
//        writer.startElement("input", component);
//        writer.writeAttribute("type", "hidden", null);
//        writer.writeAttribute("name", expFactory.createValueExpression(elContext, "${_csrf.parameterName}", String.class).getValue(elContext), null);
//        writer.writeAttribute("value", expFactory.createValueExpression(elContext, "${_csrf.token}", String.class).getValue(elContext), null);
//        writer.endElement("input");
//        writer.write("\n");
//        super.encodeEnd(context, component);
//    }
//}
