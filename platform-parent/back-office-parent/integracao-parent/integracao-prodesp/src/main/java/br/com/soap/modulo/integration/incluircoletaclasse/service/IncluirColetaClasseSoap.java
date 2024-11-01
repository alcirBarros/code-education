package br.com.soap.modulo.integration.incluircoletaclasse.service;

import br.com.domain.auxiliar.diasemana.enumerator.TipoDiaSemanaEnum;
import br.com.domain.auxiliar.tipoclasse.model.TipoClasse;
import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
import br.com.domain.auxiliar.tipoperidoletivo.enumerator.TipoPeriodoLetivoEnum;
import br.com.domain.auxiliar.tipoperidoletivo.model.TipoPeriodoLetivo;
import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
import br.com.domain.integracao.incluircoletaclasse.model.DiasSemana;
import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasseResponse;
import br.com.domain.integracao.incluircoletaclasse.model.MsgIncluirColetaClasse;
import br.com.domain.integracao.incluircoletaclasse.model.ResponseIncluirColetaClasse;
import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
import br.com.soap.configuracao.soap.ProdespObjectResponse;
import br.com.soap.configuracao.soap.ProdespUsuarioSenha;
import br.com.soap.configuracao.soap.SoapConfig;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IncluirColetaClasseSoap {

    @Autowired
    private SoapConfig prodespSoapConfig;

    private Gson gson = new Gson();

    public IncluirColetaClasseSoap() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        gsonBuilder.registerTypeAdapter(EnvelopeSoap.class, new DeserializerRequest());
        gsonBuilder.registerTypeAdapter(IncluirColetaClasseResponse.class, new DeserializerResponse());

        gson = gsonBuilder.create();
    }

    public IncluirColetaClasse incluirColetaClasse(IncluirColetaClasse realizarMatriculaInfoSemRA, AuthorizationServicoExterno authorizationServicoExterno) {
        String jsonPost = gson.toJson(IncluirColetaClasse.setNull(realizarMatriculaInfoSemRA));

        ProdespUsuarioSenha prodespUser = gson.fromJson(jsonPost, EnvelopeSoap.class);
        ProdespObjectResponse prodespResponse = prodespSoapConfig.sendMessage(authorizationServicoExterno.getUrl(), authorizationServicoExterno, prodespUser);
        IncluirColetaClasseResponse response = gson.fromJson(prodespResponse.getJsonObject(), IncluirColetaClasseResponse.class);

        realizarMatriculaInfoSemRA.setStatusResponseEnum(prodespResponse.getStatusResponseEnum());
        realizarMatriculaInfoSemRA.setIncluirColetaClasseResponse(response);
        response.setMensagem(prodespResponse.getMensagem());
        return realizarMatriculaInfoSemRA;
    }
}

class EnvelopeSoap extends br.gov.sp.educacao.ensemble.IncluirColetaClasse
        implements ProdespUsuarioSenha {

    @Override
    public void setUsuario(String value) {
        super.setUsuario(value);
    }

    @Override
    public void setSenha(String value) {
        super.setSenha(value);
    }
}

class DeserializerResponse implements JsonDeserializer<IncluirColetaClasseResponse> {

    private Type typeClass = new TypeClass().getType();

    @Override
    public IncluirColetaClasseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {

        JsonObject jsonObject = jsonElement.getAsJsonObject();

        String outProcessoID = (jsonObject.get("OutProcessoID") != null) ? jsonObject.get("OutProcessoID").getAsString() : null;

        JsonElement listaAlunosJsonElement = (jsonObject.get("Mensagens") != null) ? ((JsonObject) jsonObject.get("Mensagens")).get("MsgIncluirColetaClasse") : null;

        List<MsgIncluirColetaClasse> msgIncluirColetaClasseList = context.deserialize(listaAlunosJsonElement, typeClass);

        IncluirColetaClasseResponse incluirColetaClasseResponse = new IncluirColetaClasseResponse();
        {
            ResponseIncluirColetaClasse responseIncluirColetaClasse = new ResponseIncluirColetaClasse();
            responseIncluirColetaClasse.getMsgIncluirColetaClasse().addAll(msgIncluirColetaClasseList);

            incluirColetaClasseResponse.setOutProcessoID(outProcessoID);
            incluirColetaClasseResponse.setResponseIncluirColetaClasse(responseIncluirColetaClasse);
        }

        return incluirColetaClasseResponse;

    }

    private class TypeClass extends TypeToken<ArrayList<MsgIncluirColetaClasse>> {

    }

}

class DeserializerRequest implements JsonDeserializer<EnvelopeSoap> {

    private Gson gson = new Gson();

    public DeserializerRequest() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        gson = gsonBuilder.create();
    }

    @Override
    public EnvelopeSoap deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        IncluirColetaClasse incluirColetaClasse = gson.fromJson(json, IncluirColetaClasse.class);
        EnvelopeSoap envelopeSoap = gson.fromJson(json, EnvelopeSoap.class);

        {
            TipoPeriodoLetivo tipoPeriodoLetivo = incluirColetaClasse.getTipoPeriodoLetivo();
            if (tipoPeriodoLetivo != null) {

                TipoPeriodoLetivoEnum tipoPeriodoLetivoEnum = tipoPeriodoLetivo.getTipoPeriodoLetivoEnum();
                switch (tipoPeriodoLetivoEnum) {
                    case PRIMEIRO_SEMESTRE: {
                        envelopeSoap.setInCursoSemestral1("X");
                        envelopeSoap.setInCursoSemestral2(null);
                        break;
                    }
                    case SEGUNDO_SEMESTRE: {
                        envelopeSoap.setInCursoSemestral1(null);
                        envelopeSoap.setInCursoSemestral2("X");
                        break;
                    }
                }

            }
        }

        {
            TipoClasse tipoClasse = incluirColetaClasse.getTipoClasse();
            if (tipoClasse != null) {
                envelopeSoap.setInTipoClasse(tipoClasse.getCodigo());
            }
        }

        {
            TipoEnsino tipoEnsino = incluirColetaClasse.getTipoEnsino();
            if (envelopeSoap.getInSerieAno() == null && tipoEnsino != null) {
                envelopeSoap.setInSerieAno(tipoEnsino.getCodigo());
            }
        }

        {
            TipoEnsino tipoEnsino = incluirColetaClasse.getTipoEnsino();
            if (tipoEnsino != null) {
                envelopeSoap.setInTipoEnsino(StringUtils.leftPad(tipoEnsino.getCodigo(), 2, "0"));
            }
        }

        {
            TipoTurno tipoTurno = incluirColetaClasse.getTipoTurno();
            if (tipoTurno != null) {
                envelopeSoap.setInTurno(tipoTurno.getCodigo());
            }
        }

        {
            Date inicioAula = incluirColetaClasse.getDataInicioAula();
            if (inicioAula != null) {
                Instant instant = Instant.ofEpochMilli(inicioAula.getTime());
                LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
                envelopeSoap.setInAno(String.valueOf(localDate.getYear()));
            }
        }

        {
            Date inicioAula = incluirColetaClasse.getDataInicioAula();
            if (inicioAula != null) {
                Instant instant = Instant.ofEpochMilli(inicioAula.getTime());
                LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
                envelopeSoap.setInDiaInicioAula(StringUtils.leftPad(String.valueOf(localDate.getDayOfMonth()), 2, "0"));
                envelopeSoap.setInMesInicioAula(StringUtils.leftPad(String.valueOf(localDate.getMonthValue()), 2, "0"));
            }
        }

        {
            Date terminoAula = incluirColetaClasse.getDataTerminoAula();
            if (terminoAula != null) {
                Instant instant = Instant.ofEpochMilli(terminoAula.getTime());
                LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
                envelopeSoap.setInDiaTerminoAula(StringUtils.leftPad(String.valueOf(localDate.getDayOfMonth()), 2, "0"));
                envelopeSoap.setInMesTerminoAula(StringUtils.leftPad(String.valueOf(localDate.getMonthValue()), 2, "0"));
            }
        }

        {
            Date horaInicioAula = incluirColetaClasse.getHoraInicioAula();
            if (horaInicioAula != null) {
                Instant instant = Instant.ofEpochMilli(horaInicioAula.getTime());
                LocalTime localTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();

                StringBuilder horaInicio = new StringBuilder();
                horaInicio.append(StringUtils.leftPad(String.valueOf(localTime.getHour()), 2, "0"));
                horaInicio.append(StringUtils.leftPad(String.valueOf(localTime.getMinute()), 2, "0"));
                envelopeSoap.setInHoraInicial(horaInicio.toString());
            }
        }

        {
            Date horaTerminoAula = incluirColetaClasse.getHoraTerminoAula();
            if (horaTerminoAula != null) {
                Instant instant = Instant.ofEpochMilli(horaTerminoAula.getTime());
                LocalTime localTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();

                StringBuilder horaTermino = new StringBuilder();
                horaTermino.append(StringUtils.leftPad(String.valueOf(localTime.getHour()), 2, "0"));
                horaTermino.append(StringUtils.leftPad(String.valueOf(localTime.getMinute()), 2, "0"));
                envelopeSoap.setInHoraFinal(horaTermino.toString());
            }
        }

        {
            DiasSemana diasSemana = incluirColetaClasse.getInDiasSemana();
            if (diasSemana != null) {

                if (diasSemana.isPresent(TipoDiaSemanaEnum.SEGUNDA_FEIRA)) {
                    envelopeSoap.getInDiasSemana().setInSegundaFeira("X");
                }

                if (diasSemana.isPresent(TipoDiaSemanaEnum.TERCA_FEIRA)) {
                    envelopeSoap.getInDiasSemana().setInTercaFeira("X");
                }

                if (diasSemana.isPresent(TipoDiaSemanaEnum.QUARTA_FEIRA)) {
                    envelopeSoap.getInDiasSemana().setInQuartaFeira("X");
                }

                if (diasSemana.isPresent(TipoDiaSemanaEnum.QUINTA_FEIRA)) {
                    envelopeSoap.getInDiasSemana().setInQuintaFeira("X");
                }

                if (diasSemana.isPresent(TipoDiaSemanaEnum.SEXTA_FEIRA)) {
                    envelopeSoap.getInDiasSemana().setInSextaFeira("X");
                }

                if (diasSemana.isPresent(TipoDiaSemanaEnum.SABADO)) {
                    envelopeSoap.getInDiasSemana().setInSabado("X");
                }

            }
        }

        return envelopeSoap;

    }
}
