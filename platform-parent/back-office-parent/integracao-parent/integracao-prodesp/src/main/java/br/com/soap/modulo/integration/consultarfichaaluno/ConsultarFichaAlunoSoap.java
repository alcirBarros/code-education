//package br.com.soap.modulo.integration.consultarfichaaluno;
//
//import br.com.domain.integracao.consultafichaaluno.model.ConsultaRA;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAlunoResponse;
//import br.com.domain.integracao.consultafichaaluno.model.FichaAluno;
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
//public class ConsultarFichaAlunoSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ConsultarFichaAlunoSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(ConsultarFichaAlunoResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public ConsultarFichaAluno consultarFichaAluno(ConsultarFichaAluno consultarFichaAluno, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(ConsultarFichaAluno.setNull(consultarFichaAluno));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ConsultarFichaAlunoResponse response = gson.fromJson(prodespResponse.getJsonObject(), ConsultarFichaAlunoResponse.class);
////
////        response.setMensagem(prodespResponse.getMensagem());
////        consultarFichaAluno.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        consultarFichaAluno.setConsultarFichaAlunoResponse(response);
//        return consultarFichaAluno;
//    }
//
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ConsultarFichaAluno implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<ConsultarFichaAlunoResponse> {
//
//    @Override
//    public ConsultarFichaAlunoResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        String outSucesso = (jsonObject.get("OutSucesso") != null) ? jsonObject.get("OutSucesso").getAsString() : null;
//        String outErro = (jsonObject.get("OutErro") != null) ? jsonObject.get("OutErro").getAsString() : null;
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//
//        JsonElement listaAlunosJsonElement = (jsonObject.get("ListaAlunos") != null) ? ((JsonObject) jsonObject.get("ListaAlunos")).get("ListaAlunos") : null;
//        JsonElement fichaAlunoJsonElement = (jsonObject.get("FichasAluno") != null) ? ((JsonObject) jsonObject.get("FichasAluno")).get("FichaAluno") : null;
//
//        List<FichaAluno> fichaAlunoList = (List<FichaAluno>) context.deserialize(fichaAlunoJsonElement != null ? fichaAlunoJsonElement : listaAlunosJsonElement, new TypeToken<ArrayList<FichaAluno>>() {
//        }.getType());
//        FichaAluno fichaAluno = (fichaAlunoList != null && !fichaAlunoList.isEmpty()) ? fichaAlunoList.get(0) : null;
//
//        ConsultarFichaAlunoResponse response = new ConsultarFichaAlunoResponse();
//        response.setOutProcessoID(outProcessoID);
//        response.setOutSucesso(outSucesso);
//        response.setOutErro(outErro);
//        response.getFichaAlunoList().addAll(fichaAlunoList);
//        response.setFichaAluno(fichaAluno);
//        return response;
//    }
//
//}
