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

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Julio Sánchez Jiménez (jsnchzjmnz)
 * @version 0.1
 */
public class Inventario {
    List<RecursoLiterario> listaRecursosLiterarios = new ArrayList<RecursoLiterario>();
    GestorDeArchivos gestor;

    /**
     * Constructor por defecto de la clase
     */
    public Inventario() {
        this.gestor = new GestorDeArchivos(this);
        this.gestor.setArchivoEntrada("/home/julio/Documents/TEC/POO/Bliburu/prueba.xls");
    }

    /*
    Getters
    */
    /**
     * 
     * @return retorna la lista de los Recursos Literarios
     */
    public List<RecursoLiterario> getListaRecursosLiterarios() {
        return listaRecursosLiterarios;
    }

    /**
     * 
     * @return retorna el gestor de archivos 
     */
    public GestorDeArchivos getGestor() {
        return gestor;
    }
    
    /*
    Setters
    */

    /**
     * 
     * @param listaRecursosLiterarios asigna la lista de recursos literarios
     */
    public void setListaRecursosLiterarios(List<RecursoLiterario> listaRecursosLiterarios) {
        this.listaRecursosLiterarios = listaRecursosLiterarios;
    }

    /**
     * 
     * @param gestor asigna la el gestor de archivos de la clase
     */
    public void setGestor(GestorDeArchivos gestor) {
        this.gestor = gestor;
    }
    
    
    /**
     * 
     * @param nombre nombre del libro que se registrará
     * @param autor nombre del autor del libro que se va a registrar
     * @param anio año de publicación del libro a registrar
     * @param editorial editorial que publicó el libro a registrar
     * @param tipo tipo de libro que se va a registrar
     */
    public void registrarLibro(String nombre, String autor,Date anio,String editorial,TipoLibro tipo){
        Libro l = new Libro(nombre, autor, anio, editorial, tipo);
        listaRecursosLiterarios.add(l);
    }
    
    /**
     * Encargado de realizar el registro automático de los recursos literarios a partir de un archivo
     * @throws IOException
     * @throws ParseException 
     */
    public void registroAutomatico(String ruta) throws IOException, ParseException {
        this.gestor.leerArchivo(ruta);
    }
    
    
    public void registrarRevista(String nombre,int numero,Date anio,TipoRevista tipo,double costo){
       Revista r = new Revista(nombre,numero, anio, tipo, costo);
       listaRecursosLiterarios.add(r);
    }
    
    public void listarRecursosLiterarios(){
        int c=0;
        while(c<listaRecursosLiterarios.size()){
            
            System.out.println(listaRecursosLiterarios.get(c).toString());
            c++;
        }
    }
    
}
