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
public class RecursoLiterario {
    
    private static int siguienteIdLibro=0;
    private static int siguienteIdRevista=0;
    
    protected String id;
    protected String nombre;
    protected Date anio;
    protected Estado estado;

    
    /**
     * Constructor por defecto
     */
    public RecursoLiterario() {
        this.estado = Estado.DISPONIBLE;
    }
    
    /**
     * Constructor sobrecargado
     * @param nombre nombre del recurso literario
     * @param anio año de publicación del recurso literario
     */
    public RecursoLiterario(String nombre, Date anio) {
        this.nombre = nombre;
        this.anio = anio;
    }
    
    /*
    Setters
    */
    
    /**
     * 
     * @param siguienteIdLibro asigna el valor al identificador que se asignará al siguiente libro registrado
     */
    public void setSiguienteIdLibro(int siguienteIdLibro) {
        RecursoLiterario.siguienteIdLibro = siguienteIdLibro;
    }

    /**
     * 
     * @param siguienteIdRevista asigna el valor al identificador que se asignará a la siguiente Revista registrada
     */
    public void setSiguienteIdRevista(int siguienteIdRevista) {
        RecursoLiterario.siguienteIdRevista = siguienteIdRevista;
    }

    /**
     * 
     * @param id asigna el id al recurso literario
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @param nombre asigna el nombre del recurso literario 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @param anio asigna el año de publicación del recurso literario
     */
    public void setAnio(Date anio) {
        this.anio = anio;
    }
    
    /*
    Getters
    */

    /**
     * 
     * @return retorna el siguiente valor que se asignará al libro 
     */
    public int getSiguienteIdLibro() {
        return RecursoLiterario.siguienteIdLibro;
    }

    /**
     * 
     * @return retorna el siguiente valor que se asignará a la revista
     */
    public int getSiguienteIdRevista() {
        return RecursoLiterario.siguienteIdRevista;
    }

    /**
     * 
     * @return retorna el identificador del recurso impreso 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @return retorna el nombre del recurso literario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return retorna el año de publicación del recurso literario 
     */
    public Date getAnio() {
        return anio;
    }
    
    public static void aumentarContadorLibro(){
        siguienteIdLibro=siguienteIdLibro+1;
    }
    
    public static void aumentarContadorRevista(){
        siguienteIdRevista=siguienteIdRevista+1;
    }

    public Estado getEstado() {
        return estado;
    }

    
    
    @Override
    public String toString() {
        return "RecursoLiterario{" + "id=" + id + ", nombre=" + nombre + ", anio=" + anio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.anio);
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
        final RecursoLiterario other = (RecursoLiterario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.anio, other.anio)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
