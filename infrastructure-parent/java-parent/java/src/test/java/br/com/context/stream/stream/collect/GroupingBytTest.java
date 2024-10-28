package br.com.context.stream.stream.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.context.entity.Event;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class GroupingBytTest {


  @Test
  void test08() {

    Event event01 = Event.builder().id(UUID.randomUUID()).eventCode(2210).periodEffect(LocalDate.parse("2023-01-01")).build();
    Event event02 = Event.builder().id(UUID.randomUUID()).eventCode(2210).periodEffect(LocalDate.parse("2023-01-01")).build();
    Event event03 = Event.builder().id(UUID.randomUUID()).eventCode(2210).periodEffect(LocalDate.parse("2023-02-01")).build();
    Event event04 = Event.builder().id(UUID.randomUUID()).eventCode(2210).periodEffect(LocalDate.parse("2023-02-01")).build();
    List<Event> list = Arrays.asList(event01, event02, event03, event04);
    Stream<Event> stream = list.stream();
    Map<LocalDate, List<Event>> collect = stream.collect(Collectors.groupingBy(Event::getPeriodEffect));
    assertEquals(2, collect.size());
  }




}
