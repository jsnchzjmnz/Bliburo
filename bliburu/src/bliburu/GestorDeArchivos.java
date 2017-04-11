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

/*
La clase GestorDeArchivos requiere de Java Excel Api, jexcelapi, accesible en la dirección http://jexcelapi.sourceforge.net/
Se comprende su funcionamiento mediante el análisis del tutorial disponible en vogella, desde la ruta http://www.vogella.com/tutorials/JavaExcel/article.html
*/

package bliburu;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * 
 * @author Julio Sánchez Jiménez (jsnchzjmnz)
 *  @version 0.1
 */
public class GestorDeArchivos {

    private String ArchivoEntrada;
    private List<String> campos = new ArrayList<String>();
    private Inventario inventario;

    /**
     * Constructor de la clase
     * @param inventario requiere de este parámetro para realizar las respectivas instancias a la clase requerida inventario
     */
    public GestorDeArchivos(Inventario inventario) {
        this.inventario = inventario;
    }
        
        
        
    /**
     * 
     * @param ArchivoEntrada ruta del archivo que se piensa analizar
     */    
    public void setArchivoEntrada(String ArchivoEntrada) {
            this.ArchivoEntrada = ArchivoEntrada;
    }

    /**
     * Clase que se encarga de recorrer el archivo xls, extrae los distintos valores en cada celda, los ordena y crea la instancia respectiva de Libro o Revista
     * @throws IOException
     * @throws ParseException 
     */
    public void leerArchivo(String ruta) throws IOException, ParseException  {
            File libro = new File(ruta);
            Workbook w;

            try {
                    w = Workbook.getWorkbook(libro);
                    Sheet hoja = w.getSheet(0);
                    for (int j = 0; j < hoja.getRows(); j++) {
                        campos.clear();
                        
                            for (int i = 0; i < hoja.getColumns(); i++) {
                                Cell celda = hoja.getCell(i, j);
                                campos.add(i, celda.getContents());                              
                            }
                            if(campos.get(0).equalsIgnoreCase("LIBRO")){
                                System.out.println("Tratando de ingresar un nuevo Libro");
                                DateFormat format = new SimpleDateFormat("yyyy", Locale.ENGLISH);
                                Date fecha = format.parse(campos.get(3));
                                inventario.registrarLibro(campos.get(1),campos.get(2),fecha,campos.get(4), TipoLibro.valueOf(campos.get(5).toUpperCase()));
                            }else if(campos.get(0).equalsIgnoreCase("REVISTA")){
                                System.out.println("Tratando de ingresar una nueva Revista");
                                DateFormat format = new SimpleDateFormat("yyyy", Locale.ENGLISH);
                                Date fecha = format.parse(campos.get(3));
                                inventario.registrarRevista(campos.get(1),Integer.parseInt(campos.get(2)), fecha, TipoRevista.valueOf(campos.get(4).toUpperCase()),Double.parseDouble(campos.get(5)));
                            }
                    }

            } catch (BiffException e) {
                    e.printStackTrace();
            }
    }
}