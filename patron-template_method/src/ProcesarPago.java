import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ProcesarPago {
    protected String procesarPago(Tarjeta tarjeta, Double monto){
        DateFormat formatter = new SimpleDateFormat("YYYY/MM/DD");
        Date date = Tarjeta.getDateFormat("YYYY/MM/DD",formatter.format(new Date()));;
        if (tarjeta.getVencimiento().after(date) && tarjeta.autorizarPago(monto)){
            return "tu pago fue procesado exitosamente";
        }
        return "no se pudo procesar el pago";
    }
}
