/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.hibernate;

/**
 *
 * @author Юля
 */
public class Student {
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int age;
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public Student() {
    }

    public Student(String name, int age, int code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }
    
    public String toString(){
        return name + ", " + age + "year old";
    }
}
