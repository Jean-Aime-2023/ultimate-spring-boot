package com.sizer.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "c_fname", length = 20)
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private int age;
    @Column(updatable = false)
    private String some_column;

    public Student() {
    }

    public Student(Integer id, String firstname, String lastname, String email, int age, String some_column) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.some_column = some_column;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSome_column() {
        return some_column;
    }

    public void setSome_column(String some_column) {
        this.some_column = some_column;
    }
}
