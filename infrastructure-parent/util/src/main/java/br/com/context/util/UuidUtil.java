package br.com.context.util;

import java.util.UUID;
import java.util.regex.Pattern;

public class UuidUtil {

  public static final UUID EMPTY_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
  private static final Pattern PATTERN = Pattern.compile("^(.{8})(.{4})(.{4})(.{4})(.{12})$");

}
