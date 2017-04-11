/*
 * Copyright (C) 2017 JOAQUIN
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bliburu;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JOAQUIN
 */
public class Cliente {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String cedula;
    private String telefono;
    
    /**
     * Constructor por defecto
     */
    Cliente(){
    }
    
    /**
     * Constructor sobrecargado para el Cliente
     * @param nombre nombre del Cliente
     * @param correo correo electronico del Cliente
     * @param cedula cedula del Cliente
     * @param telefono telefono del Cliente
     */
    Cliente(String nombre,String primerApellido,String segundoApellido,
            String correo,String cedula,String telefono){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
    /*
    Getters
    */
    
    /**
     * 
     * @return retorna el nombre del Cliente
     */
    public String getNombre() {
        return nombre;
    }
    
         /**
     * 
     * @return retorna el correo electronico del Cliente
     */
    public String getCorreo() {
        return correo;
    }
    
        /**
     * 
     * @return retorna la cedula del cliente
     */
    public String getCedula() {
        return cedula;
    }
    
        /**
     * 
     * @return retorna el telefono del Cliente
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * 
     * @return retorna el primer apellido del Cliente
     */
    public String getPrimerApellido() {
        return primerApellido;
    }
    /**
     * 
     * @return retorna el segundo apellido del Cliente
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }
    
    /*
    Setters
    */
    
    
    
     /**
     * 
     * @param nombre asigna el nombre al Cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     /**
     * 
     * @param correo asigna el correo al Cliente
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * 
     * @param cedula asigna la cedula al Cliente
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
     /**
     * 
     * @param telefono asigna el telefono al Cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @param primerApellido asigna el primerApellido del Cliente
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
    /**
     * 
     * @param segundoApellido asigna el primerApellido del Cliente
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    
    
    
}