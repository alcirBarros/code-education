//package br.com.soap.modulo.integration.realizarmatriculasemra.service;
//
//import br.com.domain.auxiliar.tiponacionalidade.model.TipoNacionalidade;
//import br.com.domain.auxiliar.tiporacacor.model.TipoRacaCor;
//import br.com.domain.auxiliar.tiposexo.model.TipoSexo;
//import br.com.domain.integracao.realizarmatricula.model.CertidaoAntiga;
//import br.com.domain.integracao.realizarmatricula.model.CertidaoNova;
//import br.com.domain.integracao.realizarmatricula.model.EndIndicativo;
//import br.com.domain.integracao.realizarmatricula.model.RealizarMatriculaInfoSemRA;
//import br.com.domain.integracao.realizarmatricula.model.RealizarMatriculaInfoSemRAResponse;
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
//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.util.Date;
//import org.apache.commons.lang.StringUtils;
//
//@Component
//public class RealizarMatriculaSemRaSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public RealizarMatriculaSemRaSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(EnvelopeSoap.class, new DeserializerRequest());
//        gson = gsonBuilder.create();
//    }
//
//    public RealizarMatriculaInfoSemRA realizarMatriculaSemRA(RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA, AuthorizationServicoExterno authorizationServicoExterno) {
//
////        String realizarMatriculaInfoSemRaJson = gson.toJson(realizarMatriculaInfoSemRA);
////        EnvelopeSoap envelopeSoap = gson.fromJson(realizarMatriculaInfoSemRaJson, EnvelopeSoap.class);
////
////        ProdespObjectResponse prodespResponse = (ProdespObjectResponse) prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, envelopeSoap);
////        RealizarMatriculaInfoSemRAResponse response = gson.fromJson(prodespResponse.getJsonObject(), RealizarMatriculaInfoSemRAResponse.class);
////
////        realizarMatriculaInfoSemRA.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        realizarMatriculaInfoSemRA.setResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//
//        return realizarMatriculaInfoSemRA;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.RealizarMatriculaInfoSemRA implements ProdespUsuarioSenha {
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
//    public EnvelopeSoap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//        RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA = gson.fromJson(json, RealizarMatriculaInfoSemRA.class);
//        EnvelopeSoap envelopeSoap = gson.fromJson(json, EnvelopeSoap.class);
//
//        {
//            TipoSexo tipoSexo = realizarMatriculaInfoSemRA.getTipoSexo();
//            if (tipoSexo != null) {
//                envelopeSoap.setInSexo(tipoSexo.getCodigo());
//            }
//        }
//
//        {
//            TipoRacaCor tipoRacaCor = realizarMatriculaInfoSemRA.getTipoRacaCor();
//            if (tipoRacaCor != null) {
//                envelopeSoap.setInCorRaca(tipoRacaCor.getCodigo());
//            }
//        }
//
//        {
//            TipoNacionalidade nacionalidade = realizarMatriculaInfoSemRA.getTipoNacionalidade();
//            if (nacionalidade != null) {
//                envelopeSoap.setInNacionalidade(nacionalidade.getCodigo());
//            }
//        }
//
//        {
//            Date dataNascimento = realizarMatriculaInfoSemRA.getDataNascimento();
//            if (dataNascimento != null) {
//                Instant instant = Instant.ofEpochMilli(dataNascimento.getTime());
//                LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
//                envelopeSoap.setInDiaNascimento(StringUtils.leftPad(String.valueOf(localDate.getDayOfMonth()), 2, "0"));
//                envelopeSoap.setInMesNascimento(StringUtils.leftPad(String.valueOf(localDate.getMonthValue()), 2, "0"));
//                envelopeSoap.setInAnoNascimento(String.valueOf(localDate.getYear()));
//            }
//        }
//
//        {
//            Date dataEntradaBrasil = realizarMatriculaInfoSemRA.getDataEntradaBrasil();
//            if (dataEntradaBrasil != null) {
//                Instant instant = Instant.ofEpochMilli(dataEntradaBrasil.getTime());
//                LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
//                envelopeSoap.setInDiaEntBrasil(StringUtils.leftPad(String.valueOf(localDate.getDayOfMonth()), 2, "0"));
//                envelopeSoap.setInMesEntBrasil(StringUtils.leftPad(String.valueOf(localDate.getMonthValue()), 2, "0"));
//                envelopeSoap.setInAnoEntBrasil(String.valueOf(localDate.getYear()));
//            }
//        }
//
//        {
//            EndIndicativo endIndicativo = realizarMatriculaInfoSemRA.getEndIndicativo();
//            if (endIndicativo != null) {
//                envelopeSoap.setInLogradouro(endIndicativo.getInLogradouro());
//                envelopeSoap.setInNumero(endIndicativo.getInNumero());
//                envelopeSoap.setInBairro(endIndicativo.getInBairro());
//                envelopeSoap.setInCep(endIndicativo.getInCep());
//                envelopeSoap.setInCidade(endIndicativo.getInCidade());
//                envelopeSoap.setInUF(endIndicativo.getInUF());
//                envelopeSoap.setInLatitude(endIndicativo.getInLatitude());
//                envelopeSoap.setInLongitude(endIndicativo.getInLongitude());
//            }
//        }
//
//        {
//            CertidaoAntiga certidaoAntiga = realizarMatriculaInfoSemRA.getCertidaoAntiga();
//            if (certidaoAntiga != null) {
//                Date dataEmissaoCertidao = certidaoAntiga.getDataEmissaoCertidao();
//
//                if (dataEmissaoCertidao != null) {
//                    Instant instant = Instant.ofEpochMilli(dataEmissaoCertidao.getTime());
//                    LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
//                    envelopeSoap.getCertidaoAntiga().setInDiaEmisCertidao(StringUtils.leftPad(String.valueOf(localDate.getDayOfMonth()), 2, "0"));
//                    envelopeSoap.getCertidaoAntiga().setInMesEmisCertidao(StringUtils.leftPad(String.valueOf(localDate.getMonthValue()), 2, "0"));
//                    envelopeSoap.getCertidaoAntiga().setInAnoEmisCertidao(String.valueOf(localDate.getYear()));
//                }
//            }
//        }
//
//        {
//            CertidaoNova certidaoNova = realizarMatriculaInfoSemRA.getCertidaoNova();
//            if (certidaoNova != null) {
//                Date dataEmissaoCertidao = certidaoNova.getDataEmissaoCertidao();
//
//                if (dataEmissaoCertidao != null) {
//                    Instant instant = Instant.ofEpochMilli(dataEmissaoCertidao.getTime());
//                    LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
//                    envelopeSoap.getCertidaoNova().setInDiaEmisCertMatr(StringUtils.leftPad(String.valueOf(localDate.getDayOfMonth()), 2, "0"));
//                    envelopeSoap.getCertidaoNova().setInMesEmisCertMatr(StringUtils.leftPad(String.valueOf(localDate.getMonthValue()), 2, "0"));
//                    envelopeSoap.getCertidaoNova().setInAnoEmisCertMatr(String.valueOf(localDate.getYear()));
//                }
//            }
//        }
//
//        return envelopeSoap;
//    }
//
//}
