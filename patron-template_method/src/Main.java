import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date vencimiento = Tarjeta.getDateFormat("YYYY/MM/DD","2024/02/16");
        Tarjeta debito = new Debito("1658321","123",vencimiento,20000.0);
        ProcesarDebito procesarDebito = new ProcesarDebito();
        System.out.println(procesarDebito.procesarPago(debito,20000.0));
        Tarjeta credito = new Credito("464136","345",vencimiento,30000.0,0.0);
        ProcesarCredito procesarCredito = new ProcesarCredito();
        System.out.println(procesarCredito.procesarPago(credito,10000.0));
        System.out.println(procesarCredito.procesarPago(credito,20000.0));
        System.out.println(procesarCredito.procesarPago(credito,10000.0));

    }
}
