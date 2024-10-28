//package br.com.integration.integration.retryable;
//
//import br.com.integration.integration.exception.RetryableFeiginException;
//import feign.RetryableException;
//import feign.Retryer;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//
//@Component
//public class RetryableFeignInterceptor implements Retryer {
//
//    private final int maxAttempts;
//    private final long maxPeriod;
//    private int attempt = 0;
//
//    private RetryableFeignInterceptor() {
//        this(TimeUnit.SECONDS.toMillis(1L), 5);
//    }
//
//    public RetryableFeignInterceptor(long maxPeriod, int maxAttempts) {
//        this.maxPeriod = maxPeriod;
//        this.maxAttempts = maxAttempts;
//    }
//
//    @Override
//    public void continueOrPropagate(RetryableException exception) {
//        if (attempt++ >= maxAttempts) {
//            RetryableFeiginException retryableFeiginException = (RetryableFeiginException) exception;
//            throw retryableFeiginException.getFeignException();
//        }
//        try {
//            Thread.sleep(nextMaxInterval());
//        } catch (InterruptedException ignored) {
//            Thread.currentThread().interrupt();
//            throw exception;
//        }
//    }
//
//    /**
//     * Calcelates the time interval to a retry attempt
//     * The interval increment exponentially with each attempt with a rate of 1.5
//     * @return time in milliseconds to the next attempt.
//     */
//    long nextMaxInterval() {
//        return (long) (maxPeriod * Math.pow(1.5, attempt - 1));
//    }
//
//    @Override
//    public Retryer clone() {
//        return new RetryableFeignInterceptor(maxPeriod, maxAttempts);
//    }
//
//}
