//package br.com.soap.modulo.integration.alterardocumentosfichaaluno;
//
//import br.com.domain.integracao.alterardocumentosfichaaluno.model.AlterarDocumentosFichaAluno;
//import br.com.domain.integracao.alterardocumentosfichaaluno.model.AlterarDocumentosFichaAlunoResponse;
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
//public class AlterarDocumentosFichaAlunoSoap {
//
////    @Autowired
////    private SoapConfig soapConfig;
////
////    private Gson gson = new Gson();
////
////    public AlterarDocumentosFichaAlunoSoap() {
////        GsonBuilder gsonBuilder = new GsonBuilder();
////        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
////        gson = gsonBuilder.create();
////    }
////
////    public AlterarDocumentosFichaAluno alterarDocumentosFichaAluno(AlterarDocumentosFichaAluno alterarDocumentosFichaAluno, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(AlterarDocumentosFichaAluno.setNull(alterarDocumentosFichaAluno));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = soapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        AlterarDocumentosFichaAlunoResponse response = gson.fromJson(prodespResponse.getJsonObject(), AlterarDocumentosFichaAlunoResponse.class);
////        
////        alterarDocumentosFichaAluno.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        alterarDocumentosFichaAluno.setAlterarDocumentosFichaAlunoResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
////        return alterarDocumentosFichaAluno;
////    }
////}
////
////class EnvelopeSoap extends br.gov.sp.educacao.ensemble.AlterarDocumentosFichaAluno implements ProdespUsuarioSenha {
////
////    @Override
////    public void setUsuario(String value) {
////        super.setUsuario(value);
////    }
////
////    @Override
////    public void setSenha(String value) {
////        super.setSenha(value);
////    }
//}
