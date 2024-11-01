//package br.com.soap.modulo.integration.consultaclassealunoporescola;
//
//import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
//import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
//import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscolaResponse;
//import br.com.domain.integracao.consultaclassealunoporescola.model.MsgConsultaClasseAlunoPorEscola;
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
//import javax.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ConsultaClasseAlunoPorEscolaSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//    
//    @Autowired
//    private ConsultaClasseAlunoPorEscolaDeserializer consultaClasseAlunoPorEscolaDeserializer;
//
//    private Gson gson = new Gson();
//
//    @PostConstruct
//    public void init() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(EnvelopeSoap.class, new DeserializerRequest());
//        
//        JsonDeserializer<ConsultaClasseAlunoPorEscolaResponse> jsonDeserializer = consultaClasseAlunoPorEscolaDeserializer.teste();
//        
//        gsonBuilder.registerTypeAdapter(ConsultaClasseAlunoPorEscolaResponse.class, jsonDeserializer);
//        gson = gsonBuilder.create();
//    }
//
//    public ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola(ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola, AuthorizationServicoExterno authorizationServicoExterno) {
////
////        EnvelopeSoap prodespUser = gson.fromJson(gson.toJson(consultaClasseAlunoPorEscola), EnvelopeSoap.class);
////
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ConsultaClasseAlunoPorEscolaResponse response = gson.fromJson(prodespResponse.getJsonObject(), ConsultaClasseAlunoPorEscolaResponse.class);
////
////        consultaClasseAlunoPorEscola.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        consultaClasseAlunoPorEscola.setConsultaClasseAlunoPorEscolaResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return consultaClasseAlunoPorEscola;
//    }
//}
//
//class DeserializerResponse implements JsonDeserializer<ConsultaClasseAlunoPorEscolaResponse> {
//
//    private Type typeClass = new TypeClass().getType();
//
//    @Override
//    public ConsultaClasseAlunoPorEscolaResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//
//        JsonObject jsonObject = json.getAsJsonObject();
//
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//        String outErro = (jsonObject.get("OutErro") != null) ? jsonObject.get("OutErro").getAsString() : null;
//        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("MsgConsultaClasseAlunoPorEscola") : null;
//
//        List<MsgConsultaClasseAlunoPorEscola> msgConsultaClasseAlunoPorEscolaList = context.deserialize(listaAlunosJsonElement, typeClass);
//
//        ConsultaClasseAlunoPorEscolaResponse consultaClasseAlunoPorEscolaResponse = new ConsultaClasseAlunoPorEscolaResponse();
//        consultaClasseAlunoPorEscolaResponse.setOutProcessoID(outProcessoID);
//        consultaClasseAlunoPorEscolaResponse.setOutErro(outErro);
//        consultaClasseAlunoPorEscolaResponse.getMsgConsultaClasseAlunoPorEscolaList().addAll(msgConsultaClasseAlunoPorEscolaList);
//        return consultaClasseAlunoPorEscolaResponse;
//    }
//
//    private class TypeClass extends TypeToken<ArrayList<MsgConsultaClasseAlunoPorEscola>> {
//
//    }
//
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ConsultaClasseAlunoPorEscola implements ProdespUsuarioSenha {
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
//class DeserializerRequest implements JsonDeserializer<EnvelopeSoap> {
//
//    private Gson gson = new Gson();
//
//    public DeserializerRequest() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gson = gsonBuilder.create();
//    }
//
//    @Override
//    public EnvelopeSoap deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
//        ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola = gson.fromJson(json, ConsultaClasseAlunoPorEscola.class);
//        EnvelopeSoap envelopeSoap = gson.fromJson(json, EnvelopeSoap.class);
//
//        {
//            TipoTurno tipoTurno = consultaClasseAlunoPorEscola.getTipoTurno();
//            if (tipoTurno != null) {
//                envelopeSoap.setInTurno(tipoTurno.getCodigo());
//            }
//        }
//
//        return envelopeSoap;
//
//    }
//}
