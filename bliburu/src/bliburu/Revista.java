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
 * @author Julio Sánchez Jiménez
 */
public class Revista extends RecursoLiterario{
    
    private int numero;
    private Date anio;
    private TipoRevista tipo;
    private double costo;

    /**
     * Constructor por defecto de la clase
     */
    public Revista() {
       this.id="R-"+Integer.toString(this.getSiguienteIdRevista());
       this.setSiguienteIdRevista(this.getSiguienteIdRevista()+1);
    }

    /**
     * Constructor sobrecargado de la clase
     * @param numero número de la revista
     * @param anio año de publicación de la revista
     * @param tipo tipo de Revista (PRESTAMO/VENTA)
     * @param costo costo de la Revista
     */
    public Revista(String nombre,int numero, Date anio, TipoRevista tipo, double costo) {
        
        this.id="R-"+Integer.toString(this.getSiguienteIdRevista());
        RecursoLiterario.aumentarContadorRevista();
        this.nombre = nombre;
        this.numero = numero;
        this.anio = anio;
        this.tipo = tipo;
        this.costo = costo;
    }
    
    
    /*
    Setters
    */

    /**
     * 
     * @param numero asigna el número de la revista
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * 
     * @param anio Asigna el año de la revista
     */
    public void setAnio(Date anio) {
        this.anio = anio;
    }

    /**
     * 
     * @param tipo Asigna el tipo de la revista
     */
    public void setTipo(TipoRevista tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     * @param costo Asigan el costo de la revista
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /*
    Getters
    */

    /**
     * 
     * @return retorna el número de la revista
     */
    public int getNumero() {
        return numero;
    }

    /**
     * 
     * @return retorna el año de la revista
     */
    public Date getAnio() {
        return anio;
    }

    /**
     * 
     * @return retorna el tipo de la revista
     */
    public TipoRevista getTipo() {
        return tipo;
    }

    /**
     * 
     * @return retorna el costo de la revista
     */
    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Revista{" + "nombre=" + nombre+ ", id=" + id+ ", numero=" + numero + ", anio=" + anio + ", tipo=" + tipo + ", costo=" + costo + '}';
    }
    
    
    
}
