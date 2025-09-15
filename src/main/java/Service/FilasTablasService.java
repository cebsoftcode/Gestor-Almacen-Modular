/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.FilasTablas;
import Repository.FilasTablasRepository;
import Repository.UsersRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bolor
 */
@Service
public class FilasTablasService {
    
    @Autowired
    private FilasTablasRepository filasTablasRepository;
    
    private static final Logger logger = LoggerFactory.getLogger("FilasTablasService");
    
    public List<FilasTablas> getFilasByTabla(Integer idTabla){
        return filasTablasRepository.findByTabla(idTabla);
    }
}
