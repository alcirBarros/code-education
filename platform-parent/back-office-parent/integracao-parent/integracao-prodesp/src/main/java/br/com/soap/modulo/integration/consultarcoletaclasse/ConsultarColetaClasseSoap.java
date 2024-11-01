//package br.com.soap.modulo.integration.consultarcoletaclasse;
//
//import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasse;
//import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasseResponse;
//import br.com.domain.integracao.consultarcoletaclasse.model.MsgConsultaColetaClasse;
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
//public class ConsultarColetaClasseSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ConsultarColetaClasseSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(ConsultarColetaClasseResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public ConsultarColetaClasse consultarColetaClasse(ConsultarColetaClasse consultarColetaClasse, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(ConsultarColetaClasse.setNull(consultarColetaClasse));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ConsultarColetaClasseResponse response = gson.fromJson(prodespResponse.getJsonObject(), ConsultarColetaClasseResponse.class);
////        
////        response.setMensagem(prodespResponse.getMensagem());
////        consultarColetaClasse.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        consultarColetaClasse.setConsultarColetaClasseResponse(response);
//        return consultarColetaClasse;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ConsultarColetaClasse implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<ConsultarColetaClasseResponse> {
//
//    private Type typeClass = new TypeClass().getType();
//
//    @Override
//    public ConsultarColetaClasseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//
//        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("MsgConsultaColetaClasse") : null;
//
//        List<MsgConsultaColetaClasse> msgConsultaColetaClasseList = context.deserialize(listaAlunosJsonElement, typeClass);
//
//        ConsultarColetaClasseResponse incluirColetaClasseResponse = new ConsultarColetaClasseResponse();
//        incluirColetaClasseResponse.setOutProcessoID(outProcessoID);
//        incluirColetaClasseResponse.setMsgConsultaColetaClasses(msgConsultaColetaClasseList);
//        return incluirColetaClasseResponse;
//
//    }
//
//    private class TypeClass extends TypeToken<ArrayList<MsgConsultaColetaClasse>> {
//
//    }
//
//}
