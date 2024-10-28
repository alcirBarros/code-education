package br.com.context.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  private UUID id;
  private String name;
  private String cpf;

  private SortedSet<Dependent> dependentList = new TreeSet<Dependent>();

  private List<Department> departmentList = new ArrayList<Department>();

}
