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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Julio Sánchez Jiménez (jsnchzjmnz)
 * @author Joaquin Mena Montero
 * @version 0.1
 */
public class Administrador {

    private Parametrizador parametrizador;
    private List<Cliente> listaClientes;
    private List<Bibliotecario> listaBibliotecarios;
    private List<Multa> listaMultas;
    private List<Prestamo> listaPrestamos;
    private List<Venta> listaVentas;
    private static final String expesionRegularEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private static final String expesionRegularTelefono = "^[0-9]{8}$";
    
    /**
     * Constructor por defecto de la clase Administrador
     *      inicializa las listas y atributos
     */
    public Administrador() {
        parametrizador = new Parametrizador();
        listaClientes = new ArrayList<Cliente>();
        listaBibliotecarios =  new ArrayList<Bibliotecario>();
        listaMultas = new ArrayList<Multa>();
        listaPrestamos = new ArrayList<Prestamo>();
        listaVentas = new ArrayList<Venta>();
    }

    /*
    Getter
    */
    
    /**
     * 
     * @return retorna el parametrizador que utiliza para asignar fecha y días de préstamo de recursos literarios 
     */
    public Parametrizador getParametrizador() {
        return parametrizador;
    }

    /**
     * 
     * @return retorna la lista de clientes 
     */
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    /**
     * 
     * @return retorna la lista de Bibliotecarios
     */
    public List<Bibliotecario> getListaBibliotecario() {
        return listaBibliotecarios;
    }

    /**
     * 
     * @return retorna la lista de multas
     */
    public List<Multa> getListaMultas() {
        return listaMultas;
    }

    /**
     * 
     * @return retorna la lista de préstamos realizados
     */
    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    /**
     * 
     * @return retorna la lista de ventas realizadas hasta el momento
     */
    public List<Venta> getListaVentas() {
        return listaVentas;
    }
    
    
    
    /*
    Setter
    */

    /**
     * 
     * @param parametrizador asigna un nuevo parametrizador
     */
    public void setParametrizador(Parametrizador parametrizador) {
        this.parametrizador = parametrizador;
    }

    /**
     * 
     * @param listaClientes asigna una nueva lista de clientes
     */
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    /**
     * 
     * @param listaBibliotecarios asigna una nueva lista de Bibliotecarios
     */
    public void listaBibliotecarios(List<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    /**
     * 
     * @param listaMultas asigna una nueva lista de multas
     */
    public void setListaMultas(List<Multa> listaMultas) {
        this.listaMultas = listaMultas;
    }

    /**
     * 
     * @param listaPrestamos asigna una nueva lista de préstamos
     */
    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    /**
     * 
     * @param listaVentas asigna una lista con las ventas
     */
    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
    
    
    
    /*
    Métodos
    */
    
    /**
     * Método que se encarga del registro de clientes
     * 
     * @param nombre nombre del cliente
     * @param cedula cédula del cliente
     * @param email correo electrónico del cliente
     * @param telefono teléfono del cliente
     */
    public int registrarCliente(String nombre,String cedula, String email, String telefono){
        Cliente cl = new Cliente(nombre, cedula, email, telefono);
        listaClientes.add(cl);
        return cl.getIdCliente();
    }
    
        /**
     * Método que se encarga del registro de clientes
     * 
     * @param nombre nombre del Bibliotecario
     * @param cedula cédula del Bibliotecario
     * @param email correo electrónico del Bibliotecario
     * @param telefono teléfono del Bibliotecario
     */
    public int registrarBibliotecario(String nombre,String cedula, 
            String email, String telefono,String password){
        Bibliotecario bl = new Bibliotecario(nombre, cedula, email, telefono,password);
        listaBibliotecarios.add(bl);
       return bl.getIdBibliotecario();
    }
    
    /**
     * Se encarga de realizar todas las validaciones requeridas para el registro de clientes
     * 
     */
    private boolean validarRegistroCliente(){
        return true;
    }
    
     /**
     * 
     * @param correo Permite validar que el correo ingresado 
     * cumpla con el formato
     * @return retorna mensaje si es correcto el correo o inválido
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
    
    /**
     * Realiza una búsqueda del cliente solicitado 
     * @param idCliente identificador del cliente que se consulta
     * @return cliente que concuerda con el identificador
     */
    public Cliente consultarCliente(String idCliente){
        return listaClientes.get(0);
    }
    
    /**
     * Método que define los parámetros del programa
     * 
     * @param fecha fecha que se asignará al programa
     * @param diasPrestamoLibro días que se asignarán al préstamo de libros
     * @param diasPrestamoRevista días que se asignarán al préstamo de revistas
     */
    public void definirParametros(Date fecha,int diasPrestamoLibro,int diasPrestamoRevista){
        
    }
    
    /**
     * Método requerido para realizar el registro de libros
     * 
     * @param idCliente Cliente que solicita el libro
     * @param contrasenia Contraseña del cliente solicitada para validar que sea este el que solicita el préstamo
     * @param recursosLiterarios Recursos literarios solicitados para préstamo
     * @return retorna true si se realizó el préstamo
     */
    public boolean registrarPrestamo(String idCliente,String contrasenia,List<RecursoLiterario> recursosLiterarios){
        return true;
    }
    
    /**
     * Se encarga de validar que tel préstamo solicitado no presente problemas
     * @return true si el préstamo solicitado puede realizarse
     */
    private boolean validarPrestamo(){
        return true;
    }
    
    /**
     * Método requerido para realizar una compra de revistas
     * 
     * @param idCliente cliente que está realizando la compra
     * @param recursosLiterarios recursos literarios que desea comprar
     * @return true si la venta fue exitosa
     */
    public boolean venderRevista(String idCliente, List<RecursoLiterario> recursosLiterarios){
        return true;
    }
    
    /**
     * Valida si el proceso de venta no cuenta con problemas
     * @return true si la venta puede realizarse
     */
    private boolean validarVenta(){
        return true;
    }
    
    /**
     * Método que se encarga de realizar la devolución de literatura prestada
     * 
     * @param idCliente Cliente a que se prestó la literatura
     * @param contrasenia Contraseña del cliente
     * @param recursosLiterarios recursos que va a devolver
     * @return retorna true si el proceso fue exitoso
     */
    public boolean devolverLiteratura(String idCliente, String contrasenia,List<RecursoLiterario> recursosLiterarios){
        return true;
    }
    
    /**
     * Método para realizar el pago de multas
     * 
     * @param idCliente Cliente que tiene asociada la multa
     * @param contrasenia contraseña del cliente
     * @param idMulta identificador de la multa
     * @return retorna true si el proceso fue exitoso
     */
    public boolean pagarMulta(String idCliente,String contrasenia, String idMulta){
        return true;
    }
    
    /**
     * Consulta una multa según el identificador suministrado
     * 
     * @param idMulta identificador de la multa
     * @return la multa que concuerda con la búsqueda
     */
    public Multa consultarMulta(int idMulta){
        Multa multa=listaMultas.get(0);
        return multa;
    }
    
    /**
     * Consulta una multa según el cliente que tiene asociado
     * 
     * @param idCliente Cliente asociado a la multa
     * @return Multa que concuerda con la búsqueda
     */
    public Multa consultarMultasPorCliente(String idCliente){
        Multa multa=listaMultas.get(0);
        return multa;
    }
    
    /**
     * Realiza el cálculo de las multas
     */
    public void calcularMultas(){
        
    }
    
    /**
     * Genera avisos a los clientes por medio de correo electrónico
     */
    public void generarAviso(){
        
    }
    
    /**
     * Consulta los distintos préstamos
     * @return lista de préstamos
     */
    public List<Prestamo> consultarPrestamos(){
        return listaPrestamos;
    }
    
    /**
     * Consulta los libros prestados
     * @return una lista de préstamos de libros
     */
    public List<Prestamo> consultarLibrosPrestados(){
        return listaPrestamos;
    }
    
    /**
     * Consulta las revistas prestadas
     * @return una lista con los préstamos de revistas
     */
    public List<Prestamo> consultarRevistasPrestadas(){
        return listaPrestamos;
    }
    
}
