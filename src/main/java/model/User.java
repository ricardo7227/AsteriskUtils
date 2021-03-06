/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import utilidades.UtilsRandom;

/**
 *
 * @author Gato
 */
public class User {

    private long id;
    private String nombre;
    private String password;
    private boolean activo;
    private String codigo_activacion;
    private Date fecha_activacion;
    private String email;

    public User() {
    }

    public User(long id, String nombre, String password, boolean activo, String codigo_activacion, Date fecha_activacion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.activo = activo;
        this.codigo_activacion = codigo_activacion;
        this.fecha_activacion = fecha_activacion;
        this.email = email;
    }

    /**
     * 
     * Construye un objeto usuario validado
     *
     * @param nombre
     * @param password
     * @param email
     */
    public User(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.fecha_activacion = new Date(new java.util.Date().getTime());
        this.activo = true;
        this.codigo_activacion = UtilsRandom.randomAlphaNumeric(15);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCodigo_activacion() {
        return codigo_activacion;
    }

    public void setCodigo_activacion(String codigo_activacion) {
        this.codigo_activacion = codigo_activacion;
    }

    public Date getFecha_activacion() {
        return fecha_activacion;
    }

    public void setFecha_activacion(Date fecha_activacion) {
        this.fecha_activacion = fecha_activacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
//Override para comparar objetos
    @Override
    public boolean equals(Object obj) {
        User user2 = (User) obj;
        if (this.getId() == user2.getId()) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
