package br.com.context.util;

public class SystemUtil {

    public static void println(Object message) {
        System.out.println(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static String getProperty(String key, String defaultValue) {
        return System.getProperty(key, defaultValue);
    }
}
