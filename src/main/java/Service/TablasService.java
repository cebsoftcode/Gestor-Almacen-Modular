/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Tablas;
import Repository.TablasRepository;
import Repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bolor
 */

@Service
public class TablasService {

    @Autowired
    private TablasRepository tablasRepository;

    private static final Logger logger = LoggerFactory.getLogger("TablasService");

    public Tablas getTablaByNombre(String nombre) {
        return tablasRepository.findByNombre(nombre);
    }
}
