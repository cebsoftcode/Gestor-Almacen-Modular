/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.UsersModel;
import Repository.UsersRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bolor
 */
@Service
public class UsersService {

    @Autowired
    private UsersRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger("UsersService");

    public List<UsersModel> getAllUsers() {
        return userRepository.findAll();
    }

    public List<UsersModel> getUserByAge(int age) {
        return userRepository.findByAge(age);
    }

    public UsersModel getUserById(int id) {
        Optional<UsersModel> user = userRepository.findById(id);
        logger.info("Resultado de la consulta: " + user);
        return user.get();
    }

    public UsersModel createUser(String name, int age) {
        UsersModel user = new UsersModel(name, age);
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

}
