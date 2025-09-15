/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import jakarta.persistence.*;
import java.sql.Date;

/**
 *
 * @author bolor
 */
@Entity
@Table(name = "tablas")
public class Tablas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tabla", nullable = false)
    private Integer id;
    @Column(name = "nombre_tabla", nullable = false, length = 45)
    private String nombre;
    @Column(name = "desc_tabla", nullable = false, length = 255)
    private String descripcion;
    @Column(name = "fec_creacion_tabla", nullable = false)
    private Date fecha;
    @Column(name = "user_creacion_tabla", nullable = false, length = 45)
    private String usuario;

    public Tablas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Tablas{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
}
