//package com.oktadeveloper.graphqldemo;
//
//import io.leangen.graphql.annotations.GraphQLQuery;
//
//import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Entity;
//
//@Entity
//public class Pessoa {
//
//    @Id
//    @GeneratedValue
//    @GraphQLQuery(name = "id", description = "O identificador da pessoa")
//    private Long id;
//
//    @GraphQLQuery(name = "name", description = "O nome da pessoa")
//    private String name;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Food{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//}