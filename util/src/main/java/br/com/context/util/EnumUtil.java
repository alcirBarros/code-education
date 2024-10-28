package br.com.context.util;


import java.util.Arrays;

enum EsocialBaseEventEntityStatusEnum {

  PENDING(0),
  VALIDATED(1),
  VALIDATED_WITH_WARNING(2),
  PROCESSING(3),
  WAITING_GOV_RESPONSE(4),
  ERROR(5),
  INVALID(6),
  WAITING_VALIDATION_PREVIOUS_EVENTS(7),
  VALIDATED_BY_PREVIOUS_SYSTEM(8);

  private final Integer id;

  EsocialBaseEventEntityStatusEnum(Integer id) {
    this.id = id;
  }

  public static EsocialBaseEventEntityStatusEnum valueOfId(Integer id){
    return Arrays.stream(values()).filter(x->x.id.equals(id)).findAny().orElse(null);
  }
}
public class EnumUtil {

  public static String enumTest(EsocialBaseEventEntityStatusEnum result) {
    switch (result) {
      case VALIDATED:
        return "A";
      case VALIDATED_BY_PREVIOUS_SYSTEM:
        return "B";
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    Integer statusToString = 10;
    EsocialBaseEventEntityStatusEnum result = EsocialBaseEventEntityStatusEnum.valueOfId(statusToString);

    String s = enumTest(result);

    System.out.println(result);
  }
}
