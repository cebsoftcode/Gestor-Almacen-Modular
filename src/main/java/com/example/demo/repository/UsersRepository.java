/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.model.UsersModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author bolor
 */
public interface UsersRepository extends JpaRepository<UsersModel, Integer> {

    List<UsersModel> findByAge(int age);

    @Query(value = "SELECT * FROM `USERS`", nativeQuery = true)
    List<UsersModel> findAllNative();

}
