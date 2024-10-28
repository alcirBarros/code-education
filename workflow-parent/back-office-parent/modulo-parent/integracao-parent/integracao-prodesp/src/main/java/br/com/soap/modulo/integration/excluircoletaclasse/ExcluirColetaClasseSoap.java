//package br.com.soap.modulo.integration.excluircoletaclasse;
//
//import br.com.domain.integracao.excluircoletaclasse.model.ExcluirColetaClasse;
//import br.com.domain.integracao.excluircoletaclasse.model.ExcluirColetaClasseResponse;
//import br.com.domain.integracao.excluircoletaclasse.model.MsgExcluirColetaClasse;
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
//public class ExcluirColetaClasseSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ExcluirColetaClasseSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(ExcluirColetaClasseResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public ExcluirColetaClasse excluirColetaClasse(ExcluirColetaClasse excluirColetaClasse, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(ExcluirColetaClasse.setNull(excluirColetaClasse));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ExcluirColetaClasseResponse response = gson.fromJson(prodespResponse.getJsonObject(), ExcluirColetaClasseResponse.class);
////        
////        excluirColetaClasse.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        excluirColetaClasse.setExcluirColetaClasseResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return excluirColetaClasse;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ExcluirColetaClasse implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<ExcluirColetaClasseResponse> {
//
//    private Type typeClass = new TypeClass().getType();
//
//    @Override
//    public ExcluirColetaClasseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("MsgExcluirColetaClasse") : null;
//
//        List<MsgExcluirColetaClasse> msgExcluirColetaClasseList = context.deserialize(listaAlunosJsonElement, typeClass);
//
//        ExcluirColetaClasseResponse excluirColetaClasseResponse = new ExcluirColetaClasseResponse();
//        excluirColetaClasseResponse.setOutProcessoID(outProcessoID);
//        excluirColetaClasseResponse.setMsgExcluirColetaClasse(msgExcluirColetaClasseList);
//        return excluirColetaClasseResponse;
//
//    }
//
//    private class TypeClass extends TypeToken<ArrayList<MsgExcluirColetaClasse>> {
//
//    }
//
//}
