/*
 * Copyright (C) 2017 Bliburu
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

/**
 *
 * @author Julio Sánchez Jiménez (jsnchzjmnz)
 * @version 0.1
 * 
 */
public class Biblioteca {
    
    private String nombre;
    private String ubicacion;
    private String telefono;
    private String website;
    
    private Inventario inventario;
    private Administrador administrador;

    /**
     * 
     *Constructor por defecto.
     * <p>
     * Constructor que no recibe parámetros y asigna valores por defecto a las variables
     * <p>
     */
    public Biblioteca() {
        this.nombre = "Sin Definir";
        this.ubicacion = "Sin Definir";
        this.telefono = "Sin Definir";
        this.website = "Sin Definir";
        this.inventario = new Inventario();
        this.administrador = new Administrador();
    }

    /**
     * 
     *Constructor cargado con los parametros de inicialización de la clase.
     * <p>
     * Constructor que recibe parámetros y asigna estos a los atributos requeridos por la clase
     * <p>
     * 
     * @param nombre se refiere al nombre correspondiente de la biblioteca en cuestión
     * @param ubicacion hace referencia a la ubicación física de la biblioteca
     * @param telefono número telefónico de la biblioteca
     * @param website dirección del sitio web de la biblioteca
     */
    public Biblioteca(String nombre, String ubicacion, String telefono, String website) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.website = website;
        this.inventario = new Inventario();
        this.administrador = new Administrador();
    }
    
    /*
    Setters
    */

    /**
     * 
     * @param nombre Asigna el nombre de la biblioteca
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @param ubicacion Asigna la ubicación de la biblioteca
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * 
     * @param telefono Asigna el teléfono de la biblioteca
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @param website Asigna la dirección del sitio web de la biblioteca
     */
    public void setWebsite(String website) {
        this.website = website;
    }
    
    
    
    /*
    Getters
    */

    /**
     * 
     * @return retorna el nombre de la biblioteca
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return retorna la ubicación de la biblioteca
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * 
     * @return retorna el teléfono de la biblioteca
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @return retorna la dirección del sitio web de la biblioteca
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @return retorna la instancia de la clase Inventario de la biblioteca 
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * 
     * @return retorna la instancia de la clase Administrador de la biblioteca 
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    
    
    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", telefono=" + telefono + ", website=" + website + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.ubicacion);
        hash = 17 * hash + Objects.hashCode(this.telefono);
        hash = 17 * hash + Objects.hashCode(this.website);
        hash = 17 * hash + Objects.hashCode(this.inventario);
        hash = 17 * hash + Objects.hashCode(this.administrador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biblioteca other = (Biblioteca) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.ubicacion, other.ubicacion)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.website, other.website)) {
            return false;
        }
        if (!Objects.equals(this.inventario, other.inventario)) {
            return false;
        }
        if (!Objects.equals(this.administrador, other.administrador)) {
            return false;
        }
        return true;
    }
    
    
}
