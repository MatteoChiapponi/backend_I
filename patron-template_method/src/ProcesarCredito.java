public class ProcesarCredito extends ProcesarPago{
    @Override
    protected String procesarPago(Tarjeta tarjeta, Double monto) {
        if (super.procesarPago(tarjeta, monto).equals("tu pago fue procesado exitosamente")){
            return "tu compra con credito fue procesada correctamente";
        }
        return "no pudimos realizar la compra con credito";
    }
}
