/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import jakarta.persistence.*;

/**
 *
 * @author bolor
 */
@Entity
@Table(name = "users_")
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_age")
    private Integer age;

    // Constructor vacío
    public UsersModel() {
    }

    // Constructor con parámetros
    public UsersModel(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UsersModel{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
    

}
