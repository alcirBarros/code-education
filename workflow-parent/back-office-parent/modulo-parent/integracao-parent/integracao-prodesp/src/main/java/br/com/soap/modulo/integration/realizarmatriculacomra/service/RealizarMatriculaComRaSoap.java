//package br.com.soap.modulo.integration.realizarmatriculacomra.service;
//
//import br.com.domain.integracao.realizarmatriculacomra.model.RealizarMatriculaInfoComRA;
//import br.com.domain.integracao.realizarmatriculacomra.model.RealizarMatriculaInfoComRAResponse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.configuracao.soap.ProdespObjectResponse;
//import br.com.soap.configuracao.soap.ProdespUsuarioSenha;
//import br.com.soap.configuracao.soap.SoapConfig;
//import com.google.gson.FieldNamingPolicy;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RealizarMatriculaComRaSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public RealizarMatriculaComRaSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gson = gsonBuilder.create();
//    }
//
//    public RealizarMatriculaInfoComRA realizarMatriculaInfoComRA(RealizarMatriculaInfoComRA realizarMatriculaInfoComRA, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(realizarMatriculaInfoComRA);
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        RealizarMatriculaInfoComRAResponse response = gson.fromJson(prodespResponse.getJsonObject(), RealizarMatriculaInfoComRAResponse.class);
////        
////        response.setMensagem(prodespResponse.getMensagem());
////        realizarMatriculaInfoComRA.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        realizarMatriculaInfoComRA.setRealizarMatriculaInfoComRAResponse(response);
//        return realizarMatriculaInfoComRA;
//    }
//
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.RealizarMatriculaInfoComRA implements ProdespUsuarioSenha {
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
