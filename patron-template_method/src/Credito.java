import java.util.Date;

public class Credito extends Tarjeta{
    private Double saldoLimite;
    private Double saldoUtilizado;

    public Credito(String numFrontales, String codSeguridad, Date vencimiento, Double saldoLimite, Double saldoUtilizado) {
        super(numFrontales, codSeguridad, vencimiento);
        this.saldoLimite = saldoLimite;
        this.saldoUtilizado = saldoUtilizado;

    }

    @Override
    protected boolean autorizarPago(Double monto) {
        saldoUtilizado+=monto;
        if (saldoUtilizado <= saldoLimite){
            return true;
        }
        return false;
    }

    public Double getSaldoUtilizado() {
        return saldoUtilizado;
    }

}
