import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Tarjeta {
    private String numFrontales;
    private String codSeguridad;
    private Date vencimiento;

    public Tarjeta(String numFrontales, String codSeguridad, Date vencimiento) {
        this.numFrontales = numFrontales;
        this.codSeguridad = codSeguridad;
        this.vencimiento = vencimiento;
    }

    public String getNumFrontales() {
        return numFrontales;
    }

    public String getCodSeguridad() {
        return codSeguridad;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    protected abstract boolean autorizarPago(Double monto);

    public static Date getDateFormat(String formatPattern, String date) {
        SimpleDateFormat formatter = new SimpleDateFormat(formatPattern);
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
