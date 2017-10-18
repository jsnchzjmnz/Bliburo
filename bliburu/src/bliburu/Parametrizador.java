/*
 * Copyright (C) 2017 julio
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
import java.util.Calendar;

/**
 *
 * @author Julio Sánchez Jiménez
 */
public class Parametrizador {
    
    private Date fechaDelSistema;
    private int diasPrestamoLibro;
    private int diasPrestamoRevista;
    private Date fechaConDiasAdicionales;
    private double costoMultaDia;

    
    /**
     * Constructor por defecto
     *      inicializa los atributos con los valores default
     */
    public Parametrizador() {
        
        
        Calendar calendar = Calendar.getInstance();
        fechaDelSistema = calendar.getTime();
        diasPrestamoLibro=10;
        diasPrestamoRevista=5;
        costoMultaDia=300;
        
    }
    
    
    /**
     * Constructor sobrecargado
     *      inicializa los atributos con los parámetros asignados
     * 
     * @param fechaDelSistema fecha que se asignará al sistema
     * @param diasPrestamoLibro dias asignados para el préstamo de libros
     * @param diasPrestamoRevista dias asignados para el préstamo de revistas
     */
    public Parametrizador(Date fechaDelSistema, int diasPrestamoLibro, int diasPrestamoRevista,double costoMultaDia) {
        
        this.fechaDelSistema = fechaDelSistema;
        this.diasPrestamoLibro = diasPrestamoLibro;
        this.diasPrestamoRevista = diasPrestamoRevista;
        this.costoMultaDia = costoMultaDia;
    }
    
    /*
    Getters
    */

    /**
     * 
     * @return retorna el costo de la multa por día de retraso
     */
    public double getCostoMultaDia() {
        return costoMultaDia;
    }
    
    
    
    /**
     * 
     * @return retorna la fecha asignada al programa 
     */
    public Date getFechaDelSistema() {
        return fechaDelSistema;
    }

    /**
     * 
     * @return retorna los días asignados para el préstamo de libros 
     */
    public int getDiasPrestamoLibro() {
        return diasPrestamoLibro;
    }

    /**
     * 
     * @return retorna los días asignados para el préstamo de Revistas 
     */
    public int getDiasPrestamoRevista() {
        return diasPrestamoRevista;
    }
    
    
    /*
    Setters
    */
    
    /**
     * 
     * @param costoMultaDia monto de lo que se cobrará por día de retraso
     */
    public void setCostoMultaDia(double costoMultaDia) {
        this.costoMultaDia = costoMultaDia;
        
    }

    
    /**
     * 
     * @param fechaDelSistema asigna una nueva fecha al programa
     */
    public void setFechaDelSistema(Date fechaDelSistema) {
        this.fechaDelSistema = fechaDelSistema;
    }

    /**
     * 
     * @param diasPrestamoLibro Asigna una nueva cantidad de días para el préstamo de libros
     */
    public void setDiasPrestamoLibro(int diasPrestamoLibro) {
        this.diasPrestamoLibro = diasPrestamoLibro;
    }

    /**
     * 
     * @param diasPrestamoRevista Asigna una nueva cantidad de días para el préstamo de Revistas
     */
    public void setDiasPrestamoRevista(int diasPrestamoRevista) {
        this.diasPrestamoRevista = diasPrestamoRevista;
    }

    public Date getFechaConDiasAdicionales(int dias){
        Calendar c = Calendar.getInstance(); 
        c.setTime(fechaDelSistema);
        c.add(Calendar.DATE, dias);
        return fechaConDiasAdicionales = c.getTime();
    }
    
        

    
}
