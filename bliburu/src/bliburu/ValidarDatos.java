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

//import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JOAQUIN
 */
public class ValidarDatos {
    
    private static final String expesionRegularEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private static final String expesionRegularTelefono = "^([0-9]){8}$";
    
    ValidarDatos(){
    }
    
    
    /**
     * 
     * @param correo, Permite validar que el correo ingresado cumpla con el formato
     * @return retorna mensaje si es correcto el email ingresado o inválido
     */
    public  String validarEmail(String correo){
        Pattern pattern = Pattern.compile(expesionRegularEmail);

        Matcher matcher = pattern.matcher(correo);
        
        if (matcher.find() == true) {
            return "CORRECTO";
        } else {
            return "* El email ingresado es inválido.";
        }
    }
    /**
     * 
     * @param telefono Permite validar que el telefono ingresado 
     * cumpla con el formato
     * @return retorna mensaje si es correcto el telefono o inválido
     */
    public String validarTelefono(String telefono){
        Pattern pattern2 = Pattern.compile(expesionRegularTelefono);
        
        Matcher matcher2 = pattern2.matcher(telefono);
        
        if (matcher2.find() == true) {
            return "CORRECTO";
        } else {
            return "* El telefono ingresado es inválido.";
        }
    }
}