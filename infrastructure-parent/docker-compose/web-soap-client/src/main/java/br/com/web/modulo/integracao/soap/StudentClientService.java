package br.com.web.modulo.integracao.soap;

import com.concretepage.wsdl.GetArticleByIdRequest;
import com.concretepage.wsdl.GetArticleByIdResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.destination.DestinationProvider;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class StudentClientService extends WebServiceGatewaySupport {

    private SoapActionCallback soapActionCallback = new SoapActionCallback("http://homologacao.multfacilcomercial.com.br/web/soapws/articles.wsdl");
    
    StudentClientService(){
        setDefaultUri("http://homologacao.multfacilcomercial.com.br/web/soapws/articles.wsdl");
    }
    

    public GetArticleByIdResponse getStudentById(int studentId) {
        GetArticleByIdRequest request = new GetArticleByIdRequest();
        request.setArticleId(studentId);
        GetArticleByIdResponse response = (GetArticleByIdResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        return response;
    }
}
