//package br.com.soap.modulo.integration.consultarquadroresumo;
//
//import br.com.domain.integracao.consultarquadroresumo.ConsultarQuadroResumo;
//import br.com.domain.integracao.consultarquadroresumo.ConsultarQuadroResumoResponse;
//import br.com.domain.integracao.consultarquadroresumo.MsgConsultarQuadroResumo;
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
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ConsultarQuadroResumoSoap {
//
////    @Autowired
////    private SoapConfig prodespSoapConfig;
//
//    private Gson gson = new Gson();
//
//    public ConsultarQuadroResumoSoap() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//        gsonBuilder.registerTypeAdapter(ConsultarQuadroResumoResponse.class, new DeserializerResponse());
//        gson = gsonBuilder.create();
//    }
//
//    public ConsultarQuadroResumo consultarQuadroResumo(ConsultarQuadroResumo consultarQuadroResumo, AuthorizationServicoExterno authorizationServicoExterno) {
////        String jsonPost = gson.toJson(ConsultarQuadroResumo.setNull(consultarQuadroResumo));
////        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
////        
////        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
////        ConsultarQuadroResumoResponse response = gson.fromJson(prodespResponse.getJsonObject(), ConsultarQuadroResumoResponse.class);
////        
////        consultarQuadroResumo.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
////        consultarQuadroResumo.setConsultarMatriculasRaResponse(response);
////        response.setMensagem(prodespResponse.getMensagem());
//        return consultarQuadroResumo;
//    }
//}
//
//class EnvelopeSoap extends br.gov.sp.educacao.ensemble.ConsultarQuadroResumo implements ProdespUsuarioSenha {
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
//class DeserializerResponse implements JsonDeserializer<ConsultarQuadroResumoResponse> {
//
//    @Override
//    public ConsultarQuadroResumoResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
//
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//        String outErro = (jsonObject.get("OutErro") != null) ? jsonObject.get("OutErro").getAsString() : null;
//        String outSucesso = (jsonObject.get("OutSucesso") != null) ? jsonObject.get("OutSucesso").getAsString() : null;
//
//        JsonArray listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? (JsonArray) ((JsonObject) jsonObject.get("Mensagens")).get("MsgConsultarQuadroResumo") : null;
//
//        List<MsgConsultarQuadroResumo> msgConsultarQuadroResumoList = converterResponse(listaAlunosJsonElement);
//
//        ConsultarQuadroResumoResponse consultarQuadroResumoResponse = new ConsultarQuadroResumoResponse();
//        consultarQuadroResumoResponse.setOutProcessoID(outProcessoID);
//        consultarQuadroResumoResponse.setOutErro(outErro);
//        consultarQuadroResumoResponse.setOutSucesso(outSucesso);
//        
//        consultarQuadroResumoResponse.setMsgConsultarQuadroResumoList(msgConsultarQuadroResumoList);
//        return consultarQuadroResumoResponse;
//
//    }
//
//    private List<MsgConsultarQuadroResumo> converterResponse(JsonArray listaAlunosJsonElement) {
//        List<MsgConsultarQuadroResumo> list = new ArrayList<>();
//        for (JsonElement jsonElement : listaAlunosJsonElement) {
//            if (!jsonElement.isJsonNull()) {
//                JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//                String outAtividadeCompl1 = (jsonObject.get("OutAtividadeCompl1") != null) ? jsonObject.get("OutAtividadeCompl1").getAsString() : null;
//                String outAtividadeCompl2 = (jsonObject.get("OutAtividadeCompl2") != null) ? jsonObject.get("OutAtividadeCompl2").getAsString() : null;
//                String outAtividadeCompl3 = (jsonObject.get("OutAtividadeCompl3") != null) ? jsonObject.get("OutAtividadeCompl3").getAsString() : null;
//                String outAtividadeCompl4 = (jsonObject.get("OutAtividadeCompl4") != null) ? jsonObject.get("OutAtividadeCompl4").getAsString() : null;
//                String outAuditiva = (jsonObject.get("OutAuditiva") != null) ? jsonObject.get("OutAuditiva").getAsString() : null;
//                String outCursoNormal1 = (jsonObject.get("OutCursoNormal1") != null) ? jsonObject.get("OutCursoNormal1").getAsString() : null;
//                String outCursoNormal2 = (jsonObject.get("OutCursoNormal2") != null) ? jsonObject.get("OutCursoNormal2").getAsString() : null;
//                String outCursoNormal3 = (jsonObject.get("OutCursoNormal3") != null) ? jsonObject.get("OutCursoNormal3").getAsString() : null;
//                String outCursoNormal4 = (jsonObject.get("OutCursoNormal4") != null) ? jsonObject.get("OutCursoNormal4").getAsString() : null;
//                String outEducEspecializado = (jsonObject.get("OutEducEspecializado") != null) ? jsonObject.get("OutEducEspecializado").getAsString() : null;
//                String outEducEspExclusiva = (jsonObject.get("OutEducEspExclusiva") != null) ? jsonObject.get("OutEducEspExclusiva").getAsString() : null;
//                String outEjaEnsMedio = (jsonObject.get("OutEjaEnsMedio") != null) ? jsonObject.get("OutEjaEnsMedio").getAsString() : null;
//                String outEnsinoLinguas = (jsonObject.get("OutEnsinoLinguas") != null) ? jsonObject.get("OutEnsinoLinguas").getAsString() : null;
//                String outEnsMedio1 = (jsonObject.get("OutEnsMedio1") != null) ? jsonObject.get("OutEnsMedio1").getAsString() : null;
//                String outEnsMedio2 = (jsonObject.get("OutEnsMedio2") != null) ? jsonObject.get("OutEnsMedio2").getAsString() : null;
//                String outEnsMedio3 = (jsonObject.get("OutEnsMedio3") != null) ? jsonObject.get("OutEnsMedio3").getAsString() : null;
//                String outEnsMedio4 = (jsonObject.get("OutEnsMedio4") != null) ? jsonObject.get("OutEnsMedio4").getAsString() : null;
//                String outEnsMedioIntEdProf = (jsonObject.get("OutEnsMedioIntEdProf") != null) ? jsonObject.get("OutEnsMedioIntEdProf").getAsString() : null;
//                String outEspecializacao = (jsonObject.get("OutEspecializacao") != null) ? jsonObject.get("OutEspecializacao").getAsString() : null;
//                String outFisica = (jsonObject.get("OutFisica") != null) ? jsonObject.get("OutFisica").getAsString() : null;
//                String outFund8anos5 = (jsonObject.get("OutFund8anos5") != null) ? jsonObject.get("OutFund8anos5").getAsString() : null;
//                String outFund8anos6 = (jsonObject.get("OutFund8anos6") != null) ? jsonObject.get("OutFund8anos6").getAsString() : null;
//                String outFund8anos7 = (jsonObject.get("OutFund8anos7") != null) ? jsonObject.get("OutFund8anos7").getAsString() : null;
//                String outFund9anos1 = (jsonObject.get("OutFund9anos1") != null) ? jsonObject.get("OutFund9anos1").getAsString() : null;
//                String outFund9anos2 = (jsonObject.get("OutFund9anos2") != null) ? jsonObject.get("OutFund9anos2").getAsString() : null;
//                String outFund9anos3 = (jsonObject.get("OutFund9anos3") != null) ? jsonObject.get("OutFund9anos3").getAsString() : null;
//                String outFund9anos4 = (jsonObject.get("OutFund9anos4") != null) ? jsonObject.get("OutFund9anos4").getAsString() : null;
//                String outFund9anos5 = (jsonObject.get("OutFund9anos5") != null) ? jsonObject.get("OutFund9anos5").getAsString() : null;
//                String outFund9anos6 = (jsonObject.get("OutFund9anos6") != null) ? jsonObject.get("OutFund9anos6").getAsString() : null;
//                String outFund9anos7 = (jsonObject.get("OutFund9anos7") != null) ? jsonObject.get("OutFund9anos7").getAsString() : null;
//                String outFund9anos8 = (jsonObject.get("OutFund9anos8") != null) ? jsonObject.get("OutFund9anos8").getAsString() : null;
//                String outFund9anos9 = (jsonObject.get("OutFund9anos9") != null) ? jsonObject.get("OutFund9anos9").getAsString() : null;
//                String outInfantil1 = (jsonObject.get("OutInfantil1") != null) ? jsonObject.get("OutInfantil1").getAsString() : null;
//                String outInfantil2 = (jsonObject.get("OutInfantil2") != null) ? jsonObject.get("OutInfantil2").getAsString() : null;
//                String outInfantil4 = (jsonObject.get("OutInfantil4") != null) ? jsonObject.get("OutInfantil4").getAsString() : null;
//                String outInfantil5 = (jsonObject.get("OutInfantil5") != null) ? jsonObject.get("OutInfantil5").getAsString() : null;
//                String outInfantil6 = (jsonObject.get("OutInfantil6") != null) ? jsonObject.get("OutInfantil6").getAsString() : null;
//                String outInfantil7 = (jsonObject.get("OutInfantil7") != null) ? jsonObject.get("OutInfantil7").getAsString() : null;
//                String outInfantilMultisseriadas = (jsonObject.get("OutInfantilMultisseriadas") != null) ? jsonObject.get("OutInfantilMultisseriadas").getAsString() : null;
//                String outMultipla = (jsonObject.get("OutMultipla") != null) ? jsonObject.get("OutMultipla").getAsString() : null;
//                String outQualificacaoBasica = (jsonObject.get("OutQualificacaoBasica") != null) ? jsonObject.get("OutQualificacaoBasica").getAsString() : null;
//                String OutErro = (jsonObject.get("OutErro") != null) ? jsonObject.get("OutErro").getAsString() : null;
//                String outProejaEnsFundamental = (jsonObject.get("OutProejaEnsFundamental") != null) ? jsonObject.get("OutProejaEnsFundamental").getAsString() : null;
//                String outProejaEnsMedio = (jsonObject.get("OutProejaEnsMedio") != null) ? jsonObject.get("OutProejaEnsMedio").getAsString() : null;
//                String outFund8anos8 = (jsonObject.get("OutFund8anos8") != null) ? jsonObject.get("OutFund8anos8").getAsString() : null;
//                String outConcomSubs = (jsonObject.get("OutConcomSubs") != null) ? jsonObject.get("OutConcomSubs").getAsString() : null;
//                String outEjaEnsFundAF = (jsonObject.get("OutEjaEnsFundAF") != null) ? jsonObject.get("OutEjaEnsFundAF").getAsString() : null;
//                String outEjaEnsFundAI = (jsonObject.get("OutEjaEnsFundAI") != null) ? jsonObject.get("OutEjaEnsFundAI").getAsString() : null;
//                String outIntelectual = (jsonObject.get("OutIntelectual") != null) ? jsonObject.get("OutIntelectual").getAsString() : null;
//                String outFund9anosMultisseriadas = (jsonObject.get("OutFund9anosMultisseriadas") != null) ? jsonObject.get("OutFund9anosMultisseriadas").getAsString() : null;
//                String outProJovemUrb = (jsonObject.get("OutProJovemUrb") != null) ? jsonObject.get("OutProJovemUrb").getAsString() : null;
//                String outTranstEspAutismo = (jsonObject.get("OutTranstEspAutismo") != null) ? jsonObject.get("OutTranstEspAutismo").getAsString() : null;
//                String outNaoSeriado = (jsonObject.get("OutNaoSeriado") != null) ? jsonObject.get("OutNaoSeriado").getAsString() : null;
//                String outAtividadeCompl1Cltd = (jsonObject.get("OutAtividadeCompl1Cltd") != null) ? jsonObject.get("OutAtividadeCompl1Cltd").getAsString() : null;
//                String outAtividadeCompl2Cltd = (jsonObject.get("OutAtividadeCompl2Cltd") != null) ? jsonObject.get("OutAtividadeCompl2Cltd").getAsString() : null;
//                String outAtividadeCompl3Cltd = (jsonObject.get("OutAtividadeCompl3Cltd") != null) ? jsonObject.get("OutAtividadeCompl3Cltd").getAsString() : null;
//                String outAtividadeCompl4Cltd = (jsonObject.get("OutAtividadeCompl4Cltd") != null) ? jsonObject.get("OutAtividadeCompl4Cltd").getAsString() : null;
//                String outAuditivacltd = (jsonObject.get("OutAuditivacltd") != null) ? jsonObject.get("OutAuditivacltd").getAsString() : null;
//                String outConcomSubscltd = (jsonObject.get("OutConcomSubscltd") != null) ? jsonObject.get("OutConcomSubscltd").getAsString() : null;
//                String outCursoNormal1cltd = (jsonObject.get("OutCursoNormal1cltd") != null) ? jsonObject.get("OutCursoNormal1cltd").getAsString() : null;
//                String outCursoNormal2cltd = (jsonObject.get("OutCursoNormal2cltd") != null) ? jsonObject.get("OutCursoNormal2cltd").getAsString() : null;
//                String outCursoNormal3cltd = (jsonObject.get("OutCursoNormal3cltd") != null) ? jsonObject.get("OutCursoNormal3cltd").getAsString() : null;
//                String outCursoNormal4cltd = (jsonObject.get("OutCursoNormal4cltd") != null) ? jsonObject.get("OutCursoNormal4cltd").getAsString() : null;
//                String outEducEspecializadocltd = (jsonObject.get("OutEducEspecializadocltd") != null) ? jsonObject.get("OutEducEspecializadocltd").getAsString() : null;
//                String outEducEspExclusivacltd = (jsonObject.get("OutEducEspExclusivacltd") != null) ? jsonObject.get("OutEducEspExclusivacltd").getAsString() : null;
//                String outEjaEnsFundAFcltd = (jsonObject.get("OutEjaEnsFundAFcltd") != null) ? jsonObject.get("OutEjaEnsFundAFcltd").getAsString() : null;
//                String outEjaEnsFundAIcltd = (jsonObject.get("OutEjaEnsFundAIcltd") != null) ? jsonObject.get("OutEjaEnsFundAIcltd").getAsString() : null;
//                String outEjaEnsMediocltd = (jsonObject.get("OutEjaEnsMediocltd") != null) ? jsonObject.get("OutEjaEnsMediocltd").getAsString() : null;
//                String outEnsMedio1cltd = (jsonObject.get("OutEnsMedio1cltd") != null) ? jsonObject.get("OutEnsMedio1cltd").getAsString() : null;
//                String outEnsMedio2cltd = (jsonObject.get("OutEnsMedio2cltd") != null) ? jsonObject.get("OutEnsMedio2cltd").getAsString() : null;
//                String outEnsMedio3cltd = (jsonObject.get("OutEnsMedio3cltd") != null) ? jsonObject.get("OutEnsMedio3cltd").getAsString() : null;
//                String outEnsMedio4cltd = (jsonObject.get("OutEnsMedio4cltd") != null) ? jsonObject.get("OutEnsMedio4cltd").getAsString() : null;
//                String outEnsMedioIntEdProfcltd = (jsonObject.get("OutEnsMedioIntEdProfcltd") != null) ? jsonObject.get("OutEnsMedioIntEdProfcltd").getAsString() : null;
//                String outEspecializacaocltd = (jsonObject.get("OutEspecializacaocltd") != null) ? jsonObject.get("OutEspecializacaocltd").getAsString() : null;
//                String outFisicacltd = (jsonObject.get("OutFisicacltd") != null) ? jsonObject.get("OutFisicacltd").getAsString() : null;
//                String outFund8anos5cltd = (jsonObject.get("OutFund8anos5cltd") != null) ? jsonObject.get("OutFund8anos5cltd").getAsString() : null;
//                String outFund8anos6cltd = (jsonObject.get("OutFund8anos6cltd") != null) ? jsonObject.get("OutFund8anos6cltd").getAsString() : null;
//                String outFund8anos7cltd = (jsonObject.get("OutFund8anos7cltd") != null) ? jsonObject.get("OutFund8anos7cltd").getAsString() : null;
//                String outFund8anos8cltd = (jsonObject.get("OutFund8anos8cltd") != null) ? jsonObject.get("OutFund8anos8cltd").getAsString() : null;
//                String outFund9anos1cltd = (jsonObject.get("OutFund9anos1cltd") != null) ? jsonObject.get("OutFund9anos1cltd").getAsString() : null;
//                String outFund9anos2cltd = (jsonObject.get("OutFund9anos2cltd") != null) ? jsonObject.get("OutFund9anos2cltd").getAsString() : null;
//                String outFund9anos3cltd = (jsonObject.get("OutFund9anos3cltd") != null) ? jsonObject.get("OutFund9anos3cltd").getAsString() : null;
//                String outFund9anos4cltd = (jsonObject.get("OutFund9anos4cltd") != null) ? jsonObject.get("OutFund9anos4cltd").getAsString() : null;
//                String outFund9anos5cltd = (jsonObject.get("OutFund9anos5cltd") != null) ? jsonObject.get("OutFund9anos5cltd").getAsString() : null;
//                String outFund9anos6cltd = (jsonObject.get("OutFund9anos6cltd") != null) ? jsonObject.get("OutFund9anos6cltd").getAsString() : null;
//                String outFund9anos7cltd = (jsonObject.get("OutFund9anos7cltd") != null) ? jsonObject.get("OutFund9anos7cltd").getAsString() : null;
//                String outFund9anos8cltd = (jsonObject.get("OutFund9anos8cltd") != null) ? jsonObject.get("OutFund9anos8cltd").getAsString() : null;
//                String outFund9anos9cltd = (jsonObject.get("OutFund9anos9cltd") != null) ? jsonObject.get("OutFund9anos9cltd").getAsString() : null;
//                String outFund9anosMultisseriadascltd = (jsonObject.get("OutFund9anosMultisseriadascltd") != null) ? jsonObject.get("OutFund9anosMultisseriadascltd").getAsString() : null;
//                String outInfantil1cltd = (jsonObject.get("OutInfantil1cltd") != null) ? jsonObject.get("OutInfantil1cltd").getAsString() : null;
//                String outInfantil2cltd = (jsonObject.get("OutInfantil2cltd") != null) ? jsonObject.get("OutInfantil2cltd").getAsString() : null;
//                String outInfantil5cltd = (jsonObject.get("OutInfantil5cltd") != null) ? jsonObject.get("OutInfantil5cltd").getAsString() : null;
//                String outInfantil6cltd = (jsonObject.get("OutInfantil6cltd") != null) ? jsonObject.get("OutInfantil6cltd").getAsString() : null;
//                String outInfantil7cltd = (jsonObject.get("OutInfantil7cltd") != null) ? jsonObject.get("OutInfantil7cltd").getAsString() : null;
//                String outInfantilMultisseriadascltd = (jsonObject.get("OutInfantilMultisseriadascltd") != null) ? jsonObject.get("OutInfantilMultisseriadascltd").getAsString() : null;
//                String outIntelectualcltd = (jsonObject.get("OutIntelectualcltd") != null) ? jsonObject.get("OutIntelectualcltd").getAsString() : null;
//                String outMultiplacltd = (jsonObject.get("OutMultiplacltd") != null) ? jsonObject.get("OutMultiplacltd").getAsString() : null;
//                String outNaoSeriadocltd = (jsonObject.get("OutNaoSeriadocltd") != null) ? jsonObject.get("OutNaoSeriadocltd").getAsString() : null;
//                String outProejaEnsFundamentalcltd = (jsonObject.get("OutProejaEnsFundamentalcltd") != null) ? jsonObject.get("OutProejaEnsFundamentalcltd").getAsString() : null;
//                String outProejaEnsMediocltd = (jsonObject.get("OutProejaEnsMediocltd") != null) ? jsonObject.get("OutProejaEnsMediocltd").getAsString() : null;
//                String outProJovemUrbcltd = (jsonObject.get("OutProJovemUrbcltd") != null) ? jsonObject.get("OutProJovemUrbcltd").getAsString() : null;
//                String outQualificacaoBasicacltd = (jsonObject.get("OutQualificacaoBasicacltd") != null) ? jsonObject.get("OutQualificacaoBasicacltd").getAsString() : null;
//                String outTranstEspAutismocltd = (jsonObject.get("OutTranstEspAutismocltd") != null) ? jsonObject.get("OutTranstEspAutismocltd").getAsString() : null;
//                String outVisualcltd = (jsonObject.get("OutVisualcltd") != null) ? jsonObject.get("OutVisualcltd").getAsString() : null;
//                String outClassesColetadas = (jsonObject.get("OutClassesColetadas") != null) ? jsonObject.get("OutClassesColetadas").getAsString() : null;
//                String outClassesDigitadas = (jsonObject.get("OutClassesDigitadas") != null) ? jsonObject.get("OutClassesDigitadas").getAsString() : null;
//                String outInfantil4cltd = (jsonObject.get("OutInfantil4cltd") != null) ? jsonObject.get("OutInfantil4cltd").getAsString() : null;
//
//                MsgConsultarQuadroResumo msgAlterarColetaClasse = new MsgConsultarQuadroResumo();
//                msgAlterarColetaClasse.setOutAtividadeCompl1(outAtividadeCompl1);
//                msgAlterarColetaClasse.setOutAtividadeCompl2(outAtividadeCompl2);
//                msgAlterarColetaClasse.setOutAtividadeCompl3(outAtividadeCompl3);
//                msgAlterarColetaClasse.setOutAtividadeCompl4(outAtividadeCompl4);
//                msgAlterarColetaClasse.setOutAuditiva(outAuditiva);
//                msgAlterarColetaClasse.setOutCursoNormal1(outCursoNormal1);
//                msgAlterarColetaClasse.setOutCursoNormal2(outCursoNormal2);
//                msgAlterarColetaClasse.setOutCursoNormal3(outCursoNormal3);
//                msgAlterarColetaClasse.setOutCursoNormal4(outCursoNormal4);
//                msgAlterarColetaClasse.setOutEducEspecializado(outEducEspecializado);
//                msgAlterarColetaClasse.setOutEducEspExclusiva(outEducEspExclusiva);
//                msgAlterarColetaClasse.setOutEjaEnsMedio(outEjaEnsMedio);
//                msgAlterarColetaClasse.setOutEnsinoLinguas(outEnsinoLinguas);
//                msgAlterarColetaClasse.setOutEnsMedio1(outEnsMedio1);
//                msgAlterarColetaClasse.setOutEnsMedio2(outEnsMedio2);
//                msgAlterarColetaClasse.setOutEnsMedio3(outEnsMedio3);
//                msgAlterarColetaClasse.setOutEnsMedio4(outEnsMedio4);
//                msgAlterarColetaClasse.setOutEnsMedioIntEdProf(outEnsMedioIntEdProf);
//                msgAlterarColetaClasse.setOutEspecializacao(outEspecializacao);
//                msgAlterarColetaClasse.setOutFisica(outFisica);
//                msgAlterarColetaClasse.setOutFund8Anos5(outFund8anos5);
//                msgAlterarColetaClasse.setOutFund8Anos6(outFund8anos6);
//                msgAlterarColetaClasse.setOutFund8Anos7(outFund8anos7);
//                msgAlterarColetaClasse.setOutFund9Anos1(outFund9anos1);
//                msgAlterarColetaClasse.setOutFund9Anos2(outFund9anos2);
//                msgAlterarColetaClasse.setOutFund9Anos3(outFund9anos3);
//                msgAlterarColetaClasse.setOutFund9Anos4(outFund9anos4);
//                msgAlterarColetaClasse.setOutFund9Anos5(outFund9anos5);
//                msgAlterarColetaClasse.setOutFund9Anos6(outFund9anos6);
//                msgAlterarColetaClasse.setOutFund9Anos7(outFund9anos7);
//                msgAlterarColetaClasse.setOutFund9Anos8(outFund9anos8);
//                msgAlterarColetaClasse.setOutFund9Anos9(outFund9anos9);
//                msgAlterarColetaClasse.setOutInfantil1(outInfantil1);
//                msgAlterarColetaClasse.setOutInfantil2(outInfantil2);
//                msgAlterarColetaClasse.setOutInfantil4(outInfantil4);
//                msgAlterarColetaClasse.setOutInfantil5(outInfantil5);
//                msgAlterarColetaClasse.setOutInfantil6(outInfantil6);
//                msgAlterarColetaClasse.setOutInfantil7(outInfantil7);
//                msgAlterarColetaClasse.setOutInfantilMultisseriadas(outInfantilMultisseriadas);
//                msgAlterarColetaClasse.setOutMultipla(outMultipla);
//                msgAlterarColetaClasse.setOutQualificacaoBasica(outQualificacaoBasica);
//                msgAlterarColetaClasse.setOutErro(OutErro);
//                msgAlterarColetaClasse.setOutProejaEnsFundamental(outProejaEnsFundamental);
//                msgAlterarColetaClasse.setOutProejaEnsMedio(outProejaEnsMedio);
//                msgAlterarColetaClasse.setOutFund8Anos8(outFund8anos8);
//                msgAlterarColetaClasse.setOutConcomSubs(outConcomSubs);
//                msgAlterarColetaClasse.setOutEjaEnsFundAF(outEjaEnsFundAF);
//                msgAlterarColetaClasse.setOutEjaEnsFundAI(outEjaEnsFundAI);
//                msgAlterarColetaClasse.setOutIntelectual(outIntelectual);
//                msgAlterarColetaClasse.setOutFund9AnosMultisseriadas(outFund9anosMultisseriadas);
//                msgAlterarColetaClasse.setOutProJovemUrb(outProJovemUrb);
//                msgAlterarColetaClasse.setOutTranstEspAutismo(outTranstEspAutismo);
//                msgAlterarColetaClasse.setOutNaoSeriado(outNaoSeriado);
//                msgAlterarColetaClasse.setOutAtividadeCompl1Cltd(outAtividadeCompl1Cltd);
//                msgAlterarColetaClasse.setOutAtividadeCompl2Cltd(outAtividadeCompl2Cltd);
//                msgAlterarColetaClasse.setOutAtividadeCompl3Cltd(outAtividadeCompl3Cltd);
//                msgAlterarColetaClasse.setOutAtividadeCompl4Cltd(outAtividadeCompl4Cltd);
//                msgAlterarColetaClasse.setOutAuditivacltd(outAuditivacltd);
//                msgAlterarColetaClasse.setOutConcomSubscltd(outConcomSubscltd);
//                msgAlterarColetaClasse.setOutCursoNormal1Cltd(outCursoNormal1cltd);
//                msgAlterarColetaClasse.setOutCursoNormal2Cltd(outCursoNormal2cltd);
//                msgAlterarColetaClasse.setOutCursoNormal3Cltd(outCursoNormal3cltd);
//                msgAlterarColetaClasse.setOutCursoNormal4Cltd(outCursoNormal4cltd);
//                msgAlterarColetaClasse.setOutEducEspecializadocltd(outEducEspecializadocltd);
//                msgAlterarColetaClasse.setOutEducEspExclusivacltd(outEducEspExclusivacltd);
//                msgAlterarColetaClasse.setOutEjaEnsFundAFcltd(outEjaEnsFundAFcltd);
//                msgAlterarColetaClasse.setOutEjaEnsFundAIcltd(outEjaEnsFundAIcltd);
//                msgAlterarColetaClasse.setOutEjaEnsMediocltd(outEjaEnsMediocltd);
//                msgAlterarColetaClasse.setOutEnsMedio1Cltd(outEnsMedio1cltd);
//                msgAlterarColetaClasse.setOutEnsMedio2Cltd(outEnsMedio2cltd);
//                msgAlterarColetaClasse.setOutEnsMedio3Cltd(outEnsMedio3cltd);
//                msgAlterarColetaClasse.setOutEnsMedio4Cltd(outEnsMedio4cltd);
//                msgAlterarColetaClasse.setOutEnsMedioIntEdProfcltd(outEnsMedioIntEdProfcltd);
//                msgAlterarColetaClasse.setOutEspecializacaocltd(outEspecializacaocltd);
//                msgAlterarColetaClasse.setOutFisicacltd(outFisicacltd);
//                msgAlterarColetaClasse.setOutFund8Anos5Cltd(outFund8anos5cltd);
//                msgAlterarColetaClasse.setOutFund8Anos6Cltd(outFund8anos6cltd);
//                msgAlterarColetaClasse.setOutFund8Anos7Cltd(outFund8anos7cltd);
//                msgAlterarColetaClasse.setOutFund8Anos8Cltd(outFund8anos8cltd);
//                msgAlterarColetaClasse.setOutFund9Anos1Cltd(outFund9anos1cltd);
//                msgAlterarColetaClasse.setOutFund9Anos2Cltd(outFund9anos2cltd);
//                msgAlterarColetaClasse.setOutFund9Anos3Cltd(outFund9anos3cltd);
//                msgAlterarColetaClasse.setOutFund9Anos4Cltd(outFund9anos4cltd);
//                msgAlterarColetaClasse.setOutFund9Anos5Cltd(outFund9anos5cltd);
//                msgAlterarColetaClasse.setOutFund9Anos6Cltd(outFund9anos6cltd);
//                msgAlterarColetaClasse.setOutFund9Anos7Cltd(outFund9anos7cltd);
//                msgAlterarColetaClasse.setOutFund9Anos8Cltd(outFund9anos8cltd);
//                msgAlterarColetaClasse.setOutFund9Anos9Cltd(outFund9anos9cltd);
//                msgAlterarColetaClasse.setOutFund9AnosMultisseriadascltd(outFund9anosMultisseriadascltd);
//                msgAlterarColetaClasse.setOutInfantil1Cltd(outInfantil1cltd);
//                msgAlterarColetaClasse.setOutInfantil2Cltd(outInfantil2cltd);
//                msgAlterarColetaClasse.setOutInfantil5Cltd(outInfantil5cltd);
//                msgAlterarColetaClasse.setOutInfantil6Cltd(outInfantil6cltd);
//                msgAlterarColetaClasse.setOutInfantil7Cltd(outInfantil7cltd);
//                msgAlterarColetaClasse.setOutInfantilMultisseriadascltd(outInfantilMultisseriadascltd);
//                msgAlterarColetaClasse.setOutIntelectualcltd(outIntelectualcltd);
//                msgAlterarColetaClasse.setOutMultiplacltd(outMultiplacltd);
//                msgAlterarColetaClasse.setOutNaoSeriadocltd(outNaoSeriadocltd);
//                msgAlterarColetaClasse.setOutProejaEnsFundamentalcltd(outProejaEnsFundamentalcltd);
//                msgAlterarColetaClasse.setOutProejaEnsMediocltd(outProejaEnsMediocltd);
//                msgAlterarColetaClasse.setOutProJovemUrbcltd(outProJovemUrbcltd);
//                msgAlterarColetaClasse.setOutQualificacaoBasicacltd(outQualificacaoBasicacltd);
//                msgAlterarColetaClasse.setOutTranstEspAutismocltd(outTranstEspAutismocltd);
//                msgAlterarColetaClasse.setOutVisualcltd(outVisualcltd);
//                msgAlterarColetaClasse.setOutClassesColetadas(outClassesColetadas);
//                msgAlterarColetaClasse.setOutClassesDigitadas(outClassesDigitadas);
//                msgAlterarColetaClasse.setOutInfantil4Cltd(outInfantil4cltd);
//
//                list.add(msgAlterarColetaClasse);
//            }
//        }
//        return list;
//    }
//
//}
