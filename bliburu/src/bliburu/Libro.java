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

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Julio Sánchez Jiménez (jsnchzjmnz)
 * @version 0.1
 */
public class Libro extends RecursoLiterario{
    
    private Estado estado;
    private TipoLibro tipo;
    private String autor;
    private String editorial;

    /**
     * Constructor por defecto
     */
    public Libro() {
        this.id="L-"+Integer.toString(this.getSiguienteIdLibro());
        RecursoLiterario.aumentarContadorLibro();
    }

    /**
     * Constructor sobrecargado para el Libro
     * @param nombre nombre del libro
     * @param autor nombre del autor del libro
     * @param anio año de publicación del libro
     * @param editorial editorial que publicó el libro
     * @param tipo tipo de libro
     */
    public Libro(String nombre, String autor,Date anio,String editorial,TipoLibro tipo) {
        
        this.id="L-"+Integer.toString(this.getSiguienteIdLibro());
        this.aumentarContadorLibro();
        this.tipo = tipo;
        this.autor = autor;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = Estado.DISPONIBLE;
        this.editorial = editorial;
    }
    
    
    /*
    Getters
    */
    
    /**
     * 
     * @return retorna la editorial que publicó el libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * 
     * @return retorna el estado del libro
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * 
     * @return retorna el tipo de libro
     */
    public TipoLibro getTipo() {
        return tipo;
    }

    /**
     * 
     * @return retorna el nombre del autor del libro 
     */
    public String getAutor() {
        return autor;
    }

    /*
    Setters
    */

    /**
     * 
     * @param editorial asigna la editorial del libro
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
    
    /**
     * 
     * @param estado asigna el estado en que se encuentra el libro
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * 
     * @param tipo asigna el tipo de libro
     */
    public void setTipo(TipoLibro tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     * @param autor asigna el autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre +", id="+id+ ", autor=" + autor+ ", editorial=" + editorial+ ", tipo=" + tipo+ ", año=" + anio + ", estado=" + estado  + '}';
    }

    
    
    
    
    
    
}
