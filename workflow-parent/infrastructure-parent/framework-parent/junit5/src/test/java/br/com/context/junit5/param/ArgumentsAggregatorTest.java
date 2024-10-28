package br.com.context.junit5.param;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ArgumentsAggregatorTest {


  static class MyAggregator implements ArgumentsAggregator {

    public MyAggregator() {
      System.out.println("created instance of " + MyAggregator.class);
    }

    @Override
    public DataCsv aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) {
      String string = accessor.getString(0);
      Boolean aBoolean = accessor.getBoolean(1);
      Integer integer = accessor.getInteger(2);
      return new DataCsv(string, aBoolean, integer);
    }
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
  void test(@AggregateWith(MyAggregator.class) DataCsv dataCsv) {
    System.out.println("test(" + ", " + dataCsv + ")");
  }

  static class DataCsv {

    String a;
    Boolean b;
    Integer c;

    public DataCsv(String a, Boolean b, Integer c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
  }
}
