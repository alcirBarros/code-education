//package br.com.soap.modulo.integration.alterardadospessoaisfichaaluno;
//
//import br.com.domain.integracao.alterardadospessoaisfichaaluno.model.AlterarDadosPessoaisFichaAluno;
//import br.com.domain.integracao.alterardadospessoaisfichaaluno.model.AlterarDadosPessoaisFichaAlunoResponse;
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
//public class AlterarDadosPessoaisFichaAlunoSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public AlterarDadosPessoaisFichaAlunoSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gson = gsonBuilder.create();
//    }
//
//    public AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno(AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(AlterarDadosPessoaisFichaAluno.setNull(alterarDadosPessoaisFichaAluno));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        AlterarDadosPessoaisFichaAlunoResponse response = gson.fromJson(prodespResponse.getJsonObject(), AlterarDadosPessoaisFichaAlunoResponse.class);
////        
////        alterarDadosPessoaisFichaAluno.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        alterarDadosPessoaisFichaAluno.setAlterarDadosPessoaisFichaAlunoResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return alterarDadosPessoaisFichaAluno;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.AlterarDadosPessoaisFichaAluno implements ProdespUsuarioSenha {
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
