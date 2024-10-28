//package br.com.soap.modulo.integration.excluirmatricula;
//
//import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
//import br.com.domain.integracao.excluirmatricula.model.ExcluirMatricula;
//import br.com.domain.integracao.excluirmatricula.model.ExcluirMatriculaResponse;
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
//import com.google.gson.JsonParseException;
//import java.lang.reflect.Type;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ExcluirMatriculaSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ExcluirMatriculaSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(EnvelopeSoap.class, new DeserializerRequest());
//        gson = gsonBuilder.create();
//    }
//
//    public ExcluirMatricula excluirMatricula(ExcluirMatricula excluirMatricula, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(excluirMatricula);
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ExcluirMatriculaResponse response = gson.fromJson(prodespResponse.getJsonObject(), ExcluirMatriculaResponse.class);
////        
////        excluirMatricula.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        excluirMatricula.setExcluirMatriculaResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return excluirMatricula;
//    }
//
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ExcluirMatricula implements ProdespUsuarioSenha {
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
//        ExcluirMatricula excluirMatricula = gson.fromJson(json, ExcluirMatricula.class);
//        EnvelopeSoap envelopeSoap = gson.fromJson(json, EnvelopeSoap.class);
//
//        {
//            TipoEnsino tipoEnsino = excluirMatricula.getTipoEnsino();
//            if (tipoEnsino != null) {
//                envelopeSoap.setInTipoEnsino(tipoEnsino.getCodigo());
//            }
//        }
//
//        {
//            TipoEnsino tipoEnsino = excluirMatricula.getTipoEnsino();
//            if (tipoEnsino != null) {
//                envelopeSoap.setInSerieAno(tipoEnsino.getCodigo());
//            }
//        }
//
//        return envelopeSoap;
//
//    }
//}
