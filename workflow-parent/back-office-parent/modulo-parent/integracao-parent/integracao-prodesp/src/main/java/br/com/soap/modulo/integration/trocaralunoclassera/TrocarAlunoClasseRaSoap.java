//package br.com.soap.modulo.integration.trocaralunoclassera;
//
//import br.com.domain.integracao.trocaralunoclassera.TrocaEntreClasses;
//import br.com.domain.integracao.trocaralunoclassera.TrocarAlunoClasseRA;
//import br.com.domain.integracao.trocaralunoclassera.TrocarAlunoClasseRAResponse;
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
//public class TrocarAlunoClasseRaSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public TrocarAlunoClasseRaSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(TrocarAlunoClasseRAResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public TrocarAlunoClasseRA trocarAlunoClasseRA(TrocarAlunoClasseRA trocarAlunoClasseRA, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(trocarAlunoClasseRA);
////
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        TrocarAlunoClasseRAResponse response = gson.fromJson(prodespResponse.getJsonObject(), TrocarAlunoClasseRAResponse.class);
////        
////        response.setMensagem(prodespResponse.getMensagem());
////        trocarAlunoClasseRA.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        trocarAlunoClasseRA.setTrocarAlunoClasseRAResponse(response);
//        return trocarAlunoClasseRA;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.TrocarAlunoClasseRA implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<TrocarAlunoClasseRAResponse> {
//
//    private Type typeClass = new TypeClass().getType();
//
//    @Override
//    public TrocarAlunoClasseRAResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//
//        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("TrocaEntreClasses") : null;
//
//        List<TrocaEntreClasses> trocaEntreClasseList = context.deserialize(listaAlunosJsonElement, typeClass);
//
//        TrocarAlunoClasseRAResponse realizarMatriculaInfoSemRAResponse = new TrocarAlunoClasseRAResponse();
//
//        realizarMatriculaInfoSemRAResponse.setOutProcessoID(outProcessoID);
//        realizarMatriculaInfoSemRAResponse.setTrocaEntreClassesList(trocaEntreClasseList);
//
//        return realizarMatriculaInfoSemRAResponse;
//    }
//
//    private class TypeClass extends TypeToken<ArrayList<TrocaEntreClasses>> {
//
//    }
//
//}
