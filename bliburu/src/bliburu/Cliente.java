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
public class Cliente extends Persona{
    public  static int idCliente = 0; 
    
    /**
     * Constructor por defecto
     */
    Cliente(){
        idCliente+=1;
        
    }
    
    /**
     * Constructor sobrecargado para el Cliente
     * @param nombre nombre del Cliente
     * @param correo correo electronico del Cliente
     * @param cedula cedula del Cliente
     * @param telefono telefono del Cliente
     */
    Cliente(String nombre,String correo,String cedula,String telefono){
        this.nombre = nombre;
        this.email = correo;
        this.cedula = cedula;
        this.telefono = telefono;
        idCliente+=1;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        Cliente.idCliente = idCliente;
    }
    
    
}