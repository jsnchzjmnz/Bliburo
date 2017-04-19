package bliburu;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author jsnchzjmnz
 */
    

public class Bliburu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {
        /*
        Inventario i = new  Inventario();
        i.registroAutomatico();
        i.listarRecursosLiterarios();
        DateFormat format = new SimpleDateFormat("yyyy", Locale.ENGLISH);
                                    Date fecha = format.parse("1999");
        Libro l = new Libro("julio", "julio", fecha, "julio", TipoLibro.TEATRO);
        */
        Biblioteca biblioteca = new Biblioteca();
        GUI gui = new GUI();
        gui.setBiblioteca(biblioteca);
        gui.setTitle("Bliburu");
        gui.show();
        
        /*LogIn log = new LogIn();
        log.setVisible(true);
        */

    }
    
}
