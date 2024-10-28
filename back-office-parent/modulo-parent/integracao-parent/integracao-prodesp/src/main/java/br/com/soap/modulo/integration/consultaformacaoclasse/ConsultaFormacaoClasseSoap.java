//package br.com.soap.modulo.integration.consultaformacaoclasse;
//
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaClasse;
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasse;
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasseResponse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.configuracao.soap.ProdespObjectResponse;
//import br.com.soap.configuracao.soap.ProdespUsuarioSenha;
//import br.com.soap.configuracao.soap.SoapConfig;
//
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
//public class ConsultaFormacaoClasseSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ConsultaFormacaoClasseSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(ConsultaFormacaoClasseResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public ConsultaFormacaoClasse consultaFormacaoClasse(ConsultaFormacaoClasse consultaFormacaoClasse, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(ConsultaFormacaoClasse.setNull(consultaFormacaoClasse));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ConsultaFormacaoClasseResponse response = gson.fromJson(prodespResponse.getJsonObject(), ConsultaFormacaoClasseResponse.class);
////        
////        consultaFormacaoClasse.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        consultaFormacaoClasse.setConsultaFormacaoClasseResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return consultaFormacaoClasse;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ConsultaFormacaoClasse implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<ConsultaFormacaoClasseResponse> {
//
//    private Type typeClass = new TypeClass().getType();
//
//    @Override
//    public ConsultaFormacaoClasseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("ConsultaClasse") : null;
//
//        List<ConsultaClasse> consultaClasseList = context.deserialize(listaAlunosJsonElement, typeClass);
//
//        ConsultaFormacaoClasseResponse consultaClasseAlunoPorEscolaResponse = new ConsultaFormacaoClasseResponse();
//        consultaClasseAlunoPorEscolaResponse.setOutProcessoID(outProcessoID);
//        consultaClasseAlunoPorEscolaResponse.getConsultaClasseList().addAll(consultaClasseList);
//        return consultaClasseAlunoPorEscolaResponse;
//
//    }
//
//    private class TypeClass extends TypeToken<ArrayList<ConsultaClasse>> {
//
//    }
//
//}
