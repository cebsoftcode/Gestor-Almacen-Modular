/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.FilasTablas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bolor
 */
public interface FilasTablasRepository extends JpaRepository<FilasTablas, Object>{
    
    List<FilasTablas> findByTabla (Integer tabla);
    
}
