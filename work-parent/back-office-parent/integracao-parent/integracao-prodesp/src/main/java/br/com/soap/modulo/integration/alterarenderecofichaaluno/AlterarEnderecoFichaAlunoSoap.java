//package br.com.soap.modulo.integration.alterarenderecofichaaluno;
//
//import br.com.domain.integracao.alterarenderecofichaaluno.model.AlterarEnderecoFichaAluno;
//import br.com.domain.integracao.alterarenderecofichaaluno.model.AlterarEnderecoFichaAlunoResponse;
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
//public class AlterarEnderecoFichaAlunoSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public AlterarEnderecoFichaAlunoSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gson = gsonBuilder.create();
//    }
//
//    public AlterarEnderecoFichaAluno alterarEnderecoFichaAluno(AlterarEnderecoFichaAluno alterarEnderecoFichaAluno, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(AlterarEnderecoFichaAluno.setNull(alterarEnderecoFichaAluno));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        AlterarEnderecoFichaAlunoResponse response = gson.fromJson(prodespResponse.getJsonObject(), AlterarEnderecoFichaAlunoResponse.class);
////        
////        alterarEnderecoFichaAluno.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        alterarEnderecoFichaAluno.setAlterarEnderecoFichaAlunoResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return alterarEnderecoFichaAluno;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.AlterarEnderecoFichaAluno implements ProdespUsuarioSenha {
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
