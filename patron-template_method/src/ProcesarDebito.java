public class ProcesarDebito extends ProcesarPago{
    @Override
    protected String procesarPago(Tarjeta tarjeta, Double monto) {
        if (super.procesarPago(tarjeta, monto).equals("tu pago fue procesado exitosamente")){
            return "tu compra con debito fue procesada correctamente";
        }
        return "no pudimos debitar tu plata";
    }

}
