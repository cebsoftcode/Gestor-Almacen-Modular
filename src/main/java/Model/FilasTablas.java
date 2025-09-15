/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import jakarta.persistence.*;
import java.util.Map;
import utilidades.JsonConverter;

/**
 *
 * @author bolor
 */
@Entity
@Table(name = "filas_tablas")
public class FilasTablas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fila", nullable = false)
    private Integer id;
    @Column(name = "tabla_id")
    private Integer tabla;
    @Convert(converter = JsonConverter.class)
    @Column(name = "datos", columnDefinition = "JSON")
    private Map<String, Object> datos;

    public FilasTablas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTabla() {
        return tabla;
    }

    public void setTabla(Integer tabla) {
        this.tabla = tabla;
    }

    public Map<String, Object> getDatos() {
        return datos;
    }

    public void setDatos(Map<String, Object> datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "FilasTablas{" + "id=" + id + ", tabla=" + tabla + ", datos=" + datos + '}';
    }
    
}
