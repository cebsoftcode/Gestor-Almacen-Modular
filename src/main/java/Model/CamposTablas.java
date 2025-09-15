/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import jakarta.persistence.*;

/**
 *
 * @author bolor
 */
@Entity
@Table(name = "campos_tablas")
public class CamposTablas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campo", nullable = false)
    private Integer id;
    @Column(name = "tabla_id", nullable = false)
    private Integer tabla;
    @Column(name = "nombre_campo", nullable = false, length = 45)
    private String nombre;
    @Column(name = "tipo_dato", nullable = false, length = 45)
    private String tipoDato;
    @Column(name = "pk", nullable = false)
    private Boolean pk;
    @Column(name = "nn", nullable = false)
    private Boolean nn;
    @Column(name = "uq", nullable = false)
    private Boolean uq;
    @Column(name = "b", nullable = false)
    private Boolean b;
    @Column(name = "un", nullable = false)
    private Boolean un;
    @Column(name = "zf", nullable = false)
    private Boolean zf;
    @Column(name = "ai", nullable = false)
    private Boolean ai;
    @Column(name = "g", nullable = false)
    private Boolean g;
    @Column(name = "fk")
    private Boolean fk;

    public CamposTablas() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Boolean getPk() {
        return pk;
    }

    public void setPk(Boolean pk) {
        this.pk = pk;
    }

    public Boolean getNn() {
        return nn;
    }

    public void setNn(Boolean nn) {
        this.nn = nn;
    }

    public Boolean getUq() {
        return uq;
    }

    public void setUq(Boolean uq) {
        this.uq = uq;
    }

    public Boolean getB() {
        return b;
    }

    public void setB(Boolean b) {
        this.b = b;
    }

    public Boolean getUn() {
        return un;
    }

    public void setUn(Boolean un) {
        this.un = un;
    }

    public Boolean getZf() {
        return zf;
    }

    public void setZf(Boolean zf) {
        this.zf = zf;
    }

    public Boolean getAi() {
        return ai;
    }

    public void setAi(Boolean ai) {
        this.ai = ai;
    }

    public Boolean getG() {
        return g;
    }

    public void setG(Boolean g) {
        this.g = g;
    }

    public Boolean getFk() {
        return fk;
    }

    public void setFk(Boolean fk) {
        this.fk = fk;
    }

    @Override
    public String toString() {
        return "CamposTablas{" + "id=" + id + ", tabla=" + tabla + ", nombre=" + nombre + ", tipoDato=" + tipoDato + ", pk=" + pk + ", nn=" + nn + ", uq=" + uq + ", b=" + b + ", un=" + un + ", zf=" + zf + ", ai=" + ai + ", g=" + g + ", fk=" + fk + '}';
    }
    
}
