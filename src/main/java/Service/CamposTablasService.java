/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.CamposTablas;
import Repository.CamposTablasRepository;
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
public class CamposTablasService {
    
    @Autowired
    private CamposTablasRepository camposTablasRepository;
    
    private static final Logger loger = LoggerFactory.getLogger("CamposTablasService");
    
    public List<CamposTablas> getCamposTablasByTabla(int idTabla){
        return camposTablasRepository.findByTabla(idTabla);
    }
}
