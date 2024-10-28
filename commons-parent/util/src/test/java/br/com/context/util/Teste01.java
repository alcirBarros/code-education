//package br.com.context.util;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import rx.Observable;
//import rx.Observer;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@SpringBootTest
//@DisplayName("ObservableTest JUnit 5 😀 Kotlin")
//public class Teste01 {
//
//    @Test
//    public void contextLoads() {
//        String result = null;
//        Observable.just("Hello RX").subscribe(
//                x -> {
//                    System.out.println(x);
//                }
//        );
//
//
//
//
//        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
//        Observable<String> observable = Observable.from(letters);
//        observable.subscribe(myObserver);
//
////        observable.subscribe(x -> {
////                    System.out.println(x);
////                },  //OnNext
////                Throwable::printStackTrace, //OnError
////                () -> {
////                    System.out.println("Completed");
////                }
////        );
//
//
//
//    }
//
//
//    Observer<String> myObserver = new Observer<String>() {
//        @Override
//        public void onNext(String s) {
//            System.out.println("MyObserver onNext(): " + s);
//        }
//
//        @Override
//        public void onCompleted() {
//            System.out.println("Observer complete");
//        }
//
//        @Override
//        public void onError(Throwable e) {
//        }
//    };
//
//}
