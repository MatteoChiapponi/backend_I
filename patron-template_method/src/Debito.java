import java.util.Date;

public class Debito extends Tarjeta{
    private Double disponible;

    public Debito(String numFrontales, String codSeguridad, Date vencimiento, Double disponible) {
        super(numFrontales, codSeguridad, vencimiento);
        this.disponible = disponible;
    }

    @Override
    protected boolean autorizarPago(Double monto) {
        if (monto <= disponible){
            return true;
        }
        return false;
    }
}
