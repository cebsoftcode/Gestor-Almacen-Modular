/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UsersModel;
import Service.UsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bolor
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    
    @Autowired
    private UsersService usersService;
    
    @GetMapping()
    public ResponseEntity<List<UsersModel>> getUsers(){
        return new ResponseEntity(usersService.getAllUsers(), HttpStatus.OK);
    }
    
    @PostMapping()
    public ResponseEntity<UsersModel> createUser(@RequestBody UsersModel body){
        return new ResponseEntity(usersService.createUser(body.getName(), body.getAge()),HttpStatus.OK);        
    }
    
    @DeleteMapping()
    public ResponseEntity<Void> deleteUser(@RequestBody int userId){
        usersService.deleteUser(userId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
