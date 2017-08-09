package com.siemens.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private int age;

    public Customer(){

    }

    public Customer(long l,
                    String s,
                    String s1,
                    int i) {
        id = l;
        name = s;
        surname = s1;
        age = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
