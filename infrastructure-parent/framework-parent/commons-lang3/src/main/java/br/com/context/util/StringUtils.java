package br.com.context.util;

public class StringUtils {

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

}
