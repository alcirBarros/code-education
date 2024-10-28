//package br.com.util.json;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonSyntaxException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class JsonUtil {
//
//    public static JsonElement converter(JsonElement jsonElementt, String key) throws JsonSyntaxException {
//        Map<String, JsonElement> root = registroJson(jsonElementt);
//        for (Map.Entry<String, JsonElement> entry : root.entrySet()) {
//            JsonElement jsonKey = jsonKey(entry, key);
//
//            if (jsonKey != null) {
//                return jsonKey;
//            } else {
//                if (!entry.getValue().isJsonPrimitive()) {
//                    return converter(entry.getValue(), key);
//                }
//            }
//
//        }
//        return null;
//    }
//
//    private static Map<String, JsonElement> registroJson(JsonElement jsonElementt) {
//        Map<String, JsonElement> map = new HashMap<>();
//        if (!jsonElementt.isJsonNull() && !jsonElementt.isJsonPrimitive()) {
//            if (jsonElementt.isJsonObject()) {
//                JsonObject asJsonObject = jsonElementt.getAsJsonObject();
//                Set<Map.Entry<String, JsonElement>> entrySet = asJsonObject.entrySet();
//                for (Map.Entry<String, JsonElement> entry : entrySet) {
//                    map.put(entry.getKey(), entry.getValue());
//                }
//            }
//
//            if (jsonElementt.isJsonArray()) {
//                JsonArray asJsonArray = jsonElementt.getAsJsonArray();
//                for (JsonElement jsonElement : asJsonArray) {
//                    Map<String, JsonElement> registroJson = registroJson(jsonElement);
//                    map.putAll(registroJson);
//                }
//            }
//
//        }
//        return map;
//    }
//
//    private static JsonElement jsonKey(Map.Entry<String, JsonElement> entry, String key) {
//
//        JsonElement value = entry.getValue();
//        if (entry.getKey().contains(key) && !value.isJsonNull()) {
//            if (value.isJsonPrimitive()) {
//                return value;
//            }
//            if (value.isJsonArray()) {
//                JsonArray asJsonArray = value.getAsJsonArray();
//                JsonElement mensagem = asJsonArray.get(0);
//                if (mensagem.isJsonPrimitive()) {
//                    return value;
//                }
//            }
//        }
//        return null;
//    }
//
//}
