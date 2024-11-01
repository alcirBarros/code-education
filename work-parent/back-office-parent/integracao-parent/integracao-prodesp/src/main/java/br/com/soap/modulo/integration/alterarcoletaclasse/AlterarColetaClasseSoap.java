//package br.com.soap.modulo.integration.alterarcoletaclasse;
//
//import br.com.domain.integracao.alterarcoletaclasse.model.AlterarColetaClasse;
//import br.com.domain.integracao.alterarcoletaclasse.model.AlterarColetaClasseResponse;
//import br.com.domain.integracao.alterarcoletaclasse.model.MsgAlterarColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.configuracao.soap.ProdespObjectResponse;
//import br.com.soap.configuracao.soap.ProdespUsuarioSenha;
//import br.com.soap.configuracao.soap.SoapConfig;
//import com.google.gson.FieldNamingPolicy;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParseException;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AlterarColetaClasseSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public AlterarColetaClasseSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(AlterarColetaClasseResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public AlterarColetaClasse alterarColetaClasse(AlterarColetaClasse consultarColetaClasse, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(AlterarColetaClasse.setNull(consultarColetaClasse));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
//        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        AlterarColetaClasseResponse response = gson.fromJson(prodespResponse.getJsonObject(), AlterarColetaClasseResponse.class);
////        
////        consultarColetaClasse.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        consultarColetaClasse.setAlterarColetaClasseResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return consultarColetaClasse;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.AlterarColetaClasse implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<AlterarColetaClasseResponse> {
//
//    private static String outErro(List<MsgAlterarColetaClasse> msgIncluirColetaClasseList) {
//        List<String> collect = msgIncluirColetaClasseList.stream().map(x -> (x.getOutErro())).collect(Collectors.toList());
//        return converterString(collect);
//    }
//
//    private static String converterString(List<String> collect) {
//        String collect1 = collect.stream().filter(Objects::nonNull).collect(Collectors.joining("|"));
//        return Optional.ofNullable(collect1).filter(x -> (!x.trim().isEmpty())).orElse(null);
//    }
//
//    @Override
//    public AlterarColetaClasseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//        String outSucesso = (jsonObject.get("OutSucesso") != null) ? jsonObject.get("OutSucesso").getAsString() : null;
//
//        JsonArray listaAlunosJsonElement = (jsonObject.get("MensagensErro") != null) ? (JsonArray) ((JsonObject) jsonObject.get("MensagensErro")).get("MensagensErroItem") : null;
//        List<MsgAlterarColetaClasse> msgConsultaColetaClasseList = converterResponse(listaAlunosJsonElement);
//
//        AlterarColetaClasseResponse alterarColetaClasseResponse = new AlterarColetaClasseResponse();
//        alterarColetaClasseResponse.setOutProcessoID(outProcessoID);
//        alterarColetaClasseResponse.setOutSucesso(outSucesso);
//        alterarColetaClasseResponse.setMensagensErroItem(msgConsultaColetaClasseList);
//
//        return alterarColetaClasseResponse;
//
//    }
//
//    private List<MsgAlterarColetaClasse> converterResponse(JsonArray listaAlunosJsonElement) {
//        List<MsgAlterarColetaClasse> list = new ArrayList<>();
//
//        for (JsonElement jsonElement : listaAlunosJsonElement) {
//            if (!jsonElement.isJsonNull()) {
//                String outErro = jsonElement.getAsString();
//                MsgAlterarColetaClasse msgAlterarColetaClasse = new MsgAlterarColetaClasse();
//                msgAlterarColetaClasse.setOutErro(outErro);
//                list.add(msgAlterarColetaClasse);
//            }
//        }
//        return list;
//    }
//
//}
