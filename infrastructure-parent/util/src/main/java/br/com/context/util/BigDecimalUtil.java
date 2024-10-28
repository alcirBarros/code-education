package br.com.context.util;

import java.math.BigDecimal;

public class BigDecimalUtil {
    private static final BigDecimal CEM_POR_CENTO = new BigDecimal("100");

    /**
     * Tenho um valor X e quero AUMENTAR Y%
     *
     * @author Alci Barros
     * @since 10/09/2015
     * @param valor
     * @param percentage
     * @return BigDecimal
     */
    public static BigDecimal percentageIncrease(BigDecimal valor, BigDecimal percentage) {
        try {
            BigDecimal result = percentage.divide(CEM_POR_CENTO);
            return valor.multiply(BigDecimal.ONE.add(result));
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Tenho um valor X e quero DIMINUIR Y%
     *
     * @author Alci Barros
     * @since 10/09/2015
     * @param valor
     * @param porcentagem
     * @return BigDecimal
     */
    public static BigDecimal diminuir(BigDecimal valor, BigDecimal porcentagem) {
        try {
            BigDecimal valor_ = porcentagem.divide(CEM_POR_CENTO);
            BigDecimal result = valor.multiply(BigDecimal.ONE.subtract(valor_));
            return result;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Quanto é X% de Y
     *
     * @author Alci Barros
     * @since 10/09/2015
     * @param valor
     * @param porcentagem
     * @return BigDecimal
     */
    public static BigDecimal porcentoDeX(BigDecimal valor, BigDecimal porcentagem) {
        try {
            BigDecimal resultado = valor.multiply(porcentagem.divide(CEM_POR_CENTO));
            return resultado;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * @author Alci Barros
     * @since 10/09/2015
     * @param valor
     * @param newScale
     * @param roundingMode
     * @return BigDecimal
     */
    public static BigDecimal arredondarValor(BigDecimal valor, int newScale, int roundingMode) {
        try {
            valor.setScale(newScale, roundingMode);
            return valor;
        } catch (Exception e) {
            throw e;
        }
    }
}
