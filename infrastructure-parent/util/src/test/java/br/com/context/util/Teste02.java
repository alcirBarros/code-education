//package br.com.context.util;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import rx.Observable;
//import rx.Observer;
//import rx.functions.Func1;
//
//
//@SpringBootTest
//public class Teste02 {
//
//
//    @Test
//    public void teste01() {
//
//        Func1<Integer, Integer> func1 = new Func1<Integer, Integer>() {
//            @Override
//            public Integer call(Integer integer) {
//                return integer * 3;
//            }
//        };
//
//        Func1<Integer, Boolean> func11 = new Func1<Integer, Boolean>() {
//            @Override
//            public Boolean call(Integer integer) {
//                return integer % 2 == 0;
//            }
//        };
//
//        Observer<Integer> observer = new Observer<Integer>() {
//            @Override
//            public void onCompleted() {
//                // ...
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                // ...
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//                // ...
//            }
//        };
//
//
//        Observable.just(1, 2, 3, 4, 5).map(func1).filter(func11).subscribe(observer);
//    }
//
//
//
//}
