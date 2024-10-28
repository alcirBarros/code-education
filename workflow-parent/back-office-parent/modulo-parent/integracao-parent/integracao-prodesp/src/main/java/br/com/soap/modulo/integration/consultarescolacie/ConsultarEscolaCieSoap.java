//package br.com.soap.modulo.integration.consultarescolacie;
//
//import br.com.domain.integracao.consultarescolacie.ConsultEscolaCIE;
//import br.com.domain.integracao.consultarescolacie.ConsultarEscolaCIE;
//import br.com.domain.integracao.consultarescolacie.ConsultarEscolaCIEResponse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.configuracao.soap.ProdespObjectResponse;
//import br.com.soap.configuracao.soap.SoapConfig;
//import com.google.gson.FieldNamingPolicy;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParseException;
//import com.google.gson.reflect.TypeToken;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import br.com.soap.configuracao.soap.ProdespUsuarioSenha;
//
//@Component
//public class ConsultarEscolaCieSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ConsultarEscolaCieSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(ConsultarEscolaCIEResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public ConsultarEscolaCIE consultarEscolaCIE(ConsultarEscolaCIE consultarEscolaCIE, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(ConsultarEscolaCIE.setNull(consultarEscolaCIE));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ConsultarEscolaCIEResponse response = gson.fromJson(prodespResponse.getJsonObject(), ConsultarEscolaCIEResponse.class);
////        
////        response.setMensagem(prodespResponse.getMensagem());
////        consultarEscolaCIE.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        
////        consultarEscolaCIE.setConsultarEscolaCIEResponse(response);
//        return consultarEscolaCIE;
//    }
//
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ConsultarEscolaCIE implements ProdespUsuarioSenha {
//
//    @Override
//    public void setUsuario(String value) {
//        super.setUsuario(value);
//    }
//
//    @Override
//    public void setSenha(String value) {
//        super.setSenha(value);
//    }
//}
//
//
//class DeserializerResponse implements JsonDeserializer<ConsultarEscolaCIEResponse> {
//
//    private Type typeClass = new TypeClass().getType();
//
//    @Override
//    public ConsultarEscolaCIEResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//
//        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("ConsultEscolaCIE") : null;
//
//        List<ConsultEscolaCIE> consultEscolaCIEList = context.deserialize(listaAlunosJsonElement, typeClass);
//
//        ConsultarEscolaCIEResponse consultarEscolaCIEResponse = new ConsultarEscolaCIEResponse();
//        consultarEscolaCIEResponse.setOutProcessoID(outProcessoID);       
//        consultarEscolaCIEResponse.setConsultEscolaCIE(consultEscolaCIEList);
//        return consultarEscolaCIEResponse;
//
//    }
//
//    private class TypeClass extends TypeToken<ArrayList<ConsultEscolaCIE>> {
//
//    }
//}
