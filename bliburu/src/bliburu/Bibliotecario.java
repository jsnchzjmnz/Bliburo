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
    
    Bibliotecario(String nombre,String correo,String cedula,
            String telefono,String contrasenia){
        this.nombre = nombre;
        this.email = correo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
        idBibliotecario+=1;
    }

    /**
     * 
     * @return retorna contraseña del Bibliotecario
     */
    public String getContrasenia() {
        return contrasenia;
    }
    /**
     * 
     * @return retorna idBibliotecario del Bibliotecario
     */
    public static int getIdBibliotecario() {
        return idBibliotecario;
    }

    /**
     * 
     * @param contrasenia asigna contraseña al Bibliotecario
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /**
     * 
     * @param idBibliotecario asigna idBibliotecario al Bibliotecario
     */
    public static void setIdBibliotecario(int idBibliotecario) {
        Bibliotecario.idBibliotecario = idBibliotecario;
    }

    
}
