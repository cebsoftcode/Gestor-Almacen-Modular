package com.example.demo;

import Model.UsersModel;
import Repository.UsersRepository;
import Service.UsersService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    
    @Autowired
    private UsersRepository usersRepository;

    private static final Logger logger = LoggerFactory.getLogger("DemoApplicationTest");

    @Test
    void contextLoads() {
    }

    @Test
    void probarConsultasBdPorId() {
        UsersModel user = usersRepository.findById(2).get();
        logger.info("User encontrado: " + user);
    }
    
    @Test
    void probarConsultasBd() {
        List<UsersModel> users = usersRepository.findAll();
        logger.info("Lista de users encontrados: " + users.toString());
    }

}
