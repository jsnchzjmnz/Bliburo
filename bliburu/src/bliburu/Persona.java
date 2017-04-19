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

/**
 *
 * @author JOAQUIN
 */
public class Persona {
    protected String nombre;
    protected String email;
    protected String cedula;
    protected String telefono;
    
    /**
     * Constructor por defecto
     */
    public Persona(){
    }
    
    /**
     * Constructor sobrecargado para la Persona
     * @param nombre nombre del Cliente
     * @param email correo electronico del Cliente
     * @param cedula cedula del Cliente
     * @param telefono telefono del Cliente
     */
    public Persona(String nombre,String email,String cedula,String telefono){
        this.nombre = nombre;
        this.email = email;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
    /*
    Getters
    */
    
    /**
     * 
     * @return retorna el nombre de la Persona
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @return retorna el correo electronico de la Persona
     */
    public String getEmail() {
        return email;
    }
    /**
     * 
     * @return retorna la cedula de la Persona
     */
    public String getCedula() {
        return cedula;
    }
    
    /**
     * 
     * @return retorna el telefono de la Persona
     */
    public String getTelefono() {
        return telefono;
    }
    
    /*
    Setters
    */
    
    /**
     * 
     * @param nombre asigna el nombre a la Persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @param email asigna el correo a la Persona
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 
     * @param cedula asigna la cedula a la Persona
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
   
    /**
     * 
     * @param telefono asigna el telefono a la Persona
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", email=" + email + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
 
}
