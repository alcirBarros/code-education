//package br.com.soap.modulo.integration.consultarmatriculasra;
//
//import br.com.domain.integracao.consultarmatriculasra.ConsultarMatricRA;
//import br.com.domain.integracao.consultarmatriculasra.ConsultarMatriculasRa;
//import br.com.domain.integracao.consultarmatriculasra.ConsultarMatriculasRaResponse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.configuracao.soap.ProdespObjectResponse;
//import br.com.soap.configuracao.soap.ProdespUsuarioSenha;
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
//
//@Component
//public class ConsultarMatriculasRaSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ConsultarMatriculasRaSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(ConsultarMatriculasRaResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public ConsultarMatriculasRa consultarMatriculasRa(ConsultarMatriculasRa consultarMatriculasRa, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(ConsultarMatriculasRa.setNull(consultarMatriculasRa));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ConsultarMatriculasRaResponse response = gson.fromJson(prodespResponse.getJsonObject(), ConsultarMatriculasRaResponse.class);
////        
////        response.setMensagem(prodespResponse.getMensagem());
////        consultarMatriculasRa.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        consultarMatriculasRa.setConsultarMatriculasRaResponse(response);
//        return consultarMatriculasRa;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ConsultarMatriculasRA implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<ConsultarMatriculasRaResponse> {
//
//    private Type typeClass = new TypeClass().getType();
//
//    @Override
//    public ConsultarMatriculasRaResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("ConsultarMatricRA") : null;
//        List<ConsultarMatricRA> consultarMatriculaRaList = context.deserialize(listaAlunosJsonElement, typeClass);
//        ConsultarMatriculasRaResponse consultarMatriculasRaResponse = new ConsultarMatriculasRaResponse();
//        consultarMatriculasRaResponse.setOutProcessoID(outProcessoID);
//        consultarMatriculasRaResponse.setConsultarMatricRAList(consultarMatriculaRaList);
//        return consultarMatriculasRaResponse;
//    }
//
//    private class TypeClass extends TypeToken<ArrayList<ConsultarMatricRA>> {
//
//    }
//
//}
