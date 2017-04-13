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
public class Bibliotecario extends Persona{
    public  static int idBibliotecario = 0;
    private String contrasenia;
    
    Bibliotecario(){
            idBibliotecario+=1;
    }
    Bibliotecario(String nombre,String contrasenia){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
