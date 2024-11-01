package br.com.soap.configuracao.soap;

import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
import br.com.util.json.JsonUtil;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SoapConfig.class);

    @Autowired(required = false)
    private WebServiceTemplate webServiceTemplate;

//    private Exclusion exclusion = new Exclusion();
    private Gson gson;

    @PostConstruct
    private void init() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.disableHtmlEscaping();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        gsonBuilder.registerTypeAdapter(EnvelopeSoapResponse.class, new DeserializerResponse());
        gson = gsonBuilder.create();
    }

    public EnvelopeSoapResponse sendMessage(String url, AuthorizationServicoExterno authorizationServicoExterno, ProdespUsuarioSenha prodespUsuarioSenha) {
        prodespUsuarioSenha.setUsuario(authorizationServicoExterno.getUsername());
        prodespUsuarioSenha.setSenha(authorizationServicoExterno.getPassword());
        Object object = webServiceTemplate.marshalSendAndReceive(url, prodespUsuarioSenha);
        EnvelopeSoapResponse response = gson.fromJson(gson.toJson(object), EnvelopeSoapResponse.class);

        {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setPrettyPrinting();
            gsonBuilder.disableHtmlEscaping();
            gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
//            gsonBuilder.addSerializationExclusionStrategy(exclusion).create();
            Gson gson = gsonBuilder.create();

            LOGGER.info("\n\n" + gson.toJson(prodespUsuarioSenha));
            LOGGER.info("\n\n" + gson.toJson(response));

//            
//            LOGGER.trace("trace level log");
//            LOGGER.debug("debug level log");
//            LOGGER.info("info level log");
//            LOGGER.warn("trace level log");
//            LOGGER.error("error level log");
        }
        return response;
    }
}

class DeserializerResponse implements JsonDeserializer<EnvelopeSoapResponse> {

    private final static String MENSAGEM = "OPERAÇÃO REALIZADA COM SUCESSO.";

    private Gson gson;

    private Type typeClass = new TypeClass().getType();

    public DeserializerResponse() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.disableHtmlEscaping();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        gson = gsonBuilder.create();
    }

    private String mensagem(JsonObject jsonObject, String... keys) {
        List<JsonElement> list = new ArrayList<>();
        for (String key : keys) {
            list.add(JsonUtil.converter(jsonObject, key));
        }
        Set<String> collect = list.stream().filter(Objects::nonNull).map(json -> json.getAsString()).collect(Collectors.toSet());
        String result = collect.stream().collect(Collectors.joining("|"));
        return (result != null && !result.trim().equals("")) ? result.trim() : null;
    }

    private String sucesso(String outSucesso, String error) {

        if ((outSucesso == null && error == null) || (outSucesso != null && outSucesso.equalsIgnoreCase("OK"))) {
            return MENSAGEM;
        }

        if (outSucesso != null && !outSucesso.trim().equals("")) {
            return outSucesso;
        }

        return null;
    }

    @Override
    public EnvelopeSoapResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jdc) throws JsonParseException {

        JsonObject jsonObject = jsonElement.getAsJsonObject();

        JsonElement outProcessoID = JsonUtil.converter(jsonObject, "OutProcessoID");

        String outSucesso = mensagem(jsonObject, "OutSucesso", "sucesso");
        String mensagemError = mensagem(jsonObject, "OutErro", "Erro", "MensagensErroItem");

        EnvelopeSoapResponse envelopeSoapResponse = new EnvelopeSoapResponse();
        envelopeSoapResponse.setJsonObject(jsonObject);

        envelopeSoapResponse.setOutProcessoID(outProcessoID != null ? outProcessoID.getAsString() : null);
        envelopeSoapResponse.setOutSucesso(sucesso(outSucesso, mensagemError));
        envelopeSoapResponse.setOutErro(mensagemError);

        return envelopeSoapResponse;
    }

    private class TypeClass extends TypeToken<ArrayList<JsonElement>> {

    }

}
