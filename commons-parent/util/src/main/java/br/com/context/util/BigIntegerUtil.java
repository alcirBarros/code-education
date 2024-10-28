
package br.com.context.util;

import java.math.BigInteger;

public class BigIntegerUtil {

    public void contextLoad() {
        BigInteger numberTotalRegistry = BigInteger.TEN;
        BigInteger numberTotalSuccess = BigInteger.ZERO;
        BigInteger numberTotalError = BigInteger.ZERO;
        numberTotalSuccess = numberTotalSuccess.add(BigInteger.TEN);
        String validator = numberTotalRegistry.compareTo(numberTotalSuccess.add(numberTotalError)) > 0 ? "Não" : "SIM";
        System.out.println(validator);
    }

}
