//package br.com.soap.modulo.integration.consultaclassealunoporescola;
//
//import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
//import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
//import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscolaResponse;
//import br.com.domain.integracao.consultaclassealunoporescola.model.MsgConsultaClasseAlunoPorEscola;
////import br.com.service.auxiliar.tipoensino.TipoEnsinoService;
////import br.com.service.auxiliar.turno.TipoTurnoService;
//
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
//class ConsultaClasseAlunoPorEscolaDeserializer {
//
////    @Autowired
////    private TipoEnsinoService tipoEnsinoService;
////    @Autowired
////    private TipoTurnoService tipoTurnoService;
//
//    public JsonDeserializer<ConsultaClasseAlunoPorEscolaResponse> teste() {
//
//        class TypeClass extends TypeToken<ArrayList<br.gov.sp.educacao.ensemble.MsgConsultaClasseAlunoPorEscola>> {
//        };
//
//        Type typeClass = new TypeClass().getType();
//
//        JsonDeserializer<ConsultaClasseAlunoPorEscolaResponse> jsonDeserializer = new JsonDeserializer() {
//            @Override
//            public ConsultaClasseAlunoPorEscolaResponse deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
//
//                JsonObject jsonObject = json.getAsJsonObject();
//
//                String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;
//                String outErro = (jsonObject.get("OutErro") != null) ? jsonObject.get("OutErro").getAsString() : null;
//                JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("MsgConsultaClasseAlunoPorEscola") : null;
//
//                List<br.gov.sp.educacao.ensemble.MsgConsultaClasseAlunoPorEscola> msgConsultaClasseAlunoPorEscolaList = context.deserialize(listaAlunosJsonElement, typeClass);
//
//                List<MsgConsultaClasseAlunoPorEscola> consultaClasseAlunoPorEscolaList = carregarTipoEnsino(msgConsultaClasseAlunoPorEscolaList);
//
//                ConsultaClasseAlunoPorEscolaResponse consultaClasseAlunoPorEscolaResponse = new ConsultaClasseAlunoPorEscolaResponse();
//                consultaClasseAlunoPorEscolaResponse.setOutProcessoID(outProcessoID);
//                consultaClasseAlunoPorEscolaResponse.setOutErro(outErro);
//                consultaClasseAlunoPorEscolaResponse.getMsgConsultaClasseAlunoPorEscolaList().addAll(consultaClasseAlunoPorEscolaList);
//                return consultaClasseAlunoPorEscolaResponse;
//            }
//        };
//        return jsonDeserializer;
//    }
//
//    private List<MsgConsultaClasseAlunoPorEscola> carregarTipoEnsino(List<br.gov.sp.educacao.ensemble.MsgConsultaClasseAlunoPorEscola> msgConsultaClasseAlunoPorEscolaList) {
//
//        List<MsgConsultaClasseAlunoPorEscola> consultaClasseAlunoPorEscolaList = new ArrayList<>();
//        for (br.gov.sp.educacao.ensemble.MsgConsultaClasseAlunoPorEscola msgConsultaClasseAlunoPorEscolaSoap : msgConsultaClasseAlunoPorEscolaList) {
//
//            MsgConsultaClasseAlunoPorEscola msgConsultaClasseAlunoPorEscola = new MsgConsultaClasseAlunoPorEscola();
//
//            {
//                String outCodEscola = msgConsultaClasseAlunoPorEscolaSoap.getOutCodEscola();
//                msgConsultaClasseAlunoPorEscola.setOutCodEscola(outCodEscola);
//            }
//            {
//                String outCodHabilit = msgConsultaClasseAlunoPorEscolaSoap.getOutCodHabilit();
//                msgConsultaClasseAlunoPorEscola.setOutCodHabilit(outCodHabilit);
//            }
//            {
//                String outErro = msgConsultaClasseAlunoPorEscolaSoap.getOutErro();
//                msgConsultaClasseAlunoPorEscola.setOutErro(outErro);
//            }
//            {
//                String outNomeEscola = msgConsultaClasseAlunoPorEscolaSoap.getOutNomeEscola();
//                msgConsultaClasseAlunoPorEscola.setOutNomeEscola(outNomeEscola);
//            }
//            {
//                String outNrClasse = msgConsultaClasseAlunoPorEscolaSoap.getOutNrClasse();
//                msgConsultaClasseAlunoPorEscola.setOutNrClasse(outNrClasse);
//            }
//            {
//                String outQtdeAban = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeAban();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeAban(outQtdeAban);
//            }
//            {
//                String outQtdeAtual = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeAtual();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeAtual(outQtdeAtual);
//            }
//            {
//                String outQtdeCad = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeCad();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeCad(outQtdeCad);
//            }
//            {
//                String outQtdeCes = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeCes();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeCes(outQtdeCes);
//            }
//            {
//                String outQtdeOutros = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeOutros();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeOutros(outQtdeOutros);
//            }
//            {
//                String outQtdeRecla = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeRecla();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeRecla(outQtdeRecla);
//            }
//            {
//                String outQtdeReman = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeReman();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeReman(outQtdeReman);
//            }
//            {
//                String outQtdeTransf = msgConsultaClasseAlunoPorEscolaSoap.getOutQtdeTransf();
//                msgConsultaClasseAlunoPorEscola.setOutQtdeTransf(outQtdeTransf);
//            }
//            {
//                String outSemestre = msgConsultaClasseAlunoPorEscolaSoap.getOutSemestre();
//                msgConsultaClasseAlunoPorEscola.setOutSemestre(outSemestre);
//            }
//            {
//                String outSerieAno = msgConsultaClasseAlunoPorEscolaSoap.getOutSerieAno();
//                msgConsultaClasseAlunoPorEscola.setOutSerieAno(outSerieAno);
//            }
//            {
//                String outTipoClasse = msgConsultaClasseAlunoPorEscolaSoap.getOutTipoClasse();
//                msgConsultaClasseAlunoPorEscola.setOutTipoClasse(outTipoClasse);
//            }
////            {
////                String outTipoEnsino = msgConsultaClasseAlunoPorEscolaSoap.getOutTipoEnsino();
////                TipoEnsino tipoEnsino = tipoEnsinoService.findByCodigo(outTipoEnsino);
////                msgConsultaClasseAlunoPorEscola.setTipoEnsino(tipoEnsino);
////            }
//            {
//                String outTurma = msgConsultaClasseAlunoPorEscolaSoap.getOutTurma();
//                msgConsultaClasseAlunoPorEscola.setOutTurma(outTurma);
//            }
////            {
////                String outTurno = msgConsultaClasseAlunoPorEscolaSoap.getOutTurno();
////                TipoTurno tipoTurno = tipoTurnoService.findByCodigo(outTurno);
////                msgConsultaClasseAlunoPorEscola.setTipoTurno(tipoTurno);
////            }
//            consultaClasseAlunoPorEscolaList.add(msgConsultaClasseAlunoPorEscola);
//        }
//        return consultaClasseAlunoPorEscolaList;
//    }
//
//}
