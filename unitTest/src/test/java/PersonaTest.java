import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonaTest {
    @Test
    public void nombreCompletoEsCorrecto(){
        SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YY");
        try {
            Date date =  formatter.parse("01/02/2004");
            Persona persona1 = new Persona("Matteo","Chiapponi","mateo@gmail.com",date);
            String nombreCompleto = persona1.mostrarNombreCompleto();
            boolean esMayorDeEdad =persona1.esMayorDeEdad();
            Assertions.assertEquals("Matteo Chiapponi",nombreCompleto);
            Assertions.assertTrue(esMayorDeEdad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
