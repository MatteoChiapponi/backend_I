import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("a", "a", 1, "pfizer", LocalDate.of(2023, 2, 16));
        Persona p2 = new Persona("a", "a", 1, "pfizer", LocalDate.of(2023, 2, 17));
        Persona p3 = new Persona("a", "a", 1, "pfizer", LocalDate.of(2023, 2, 3));

        VacunatorioInterfaz proxy = new VacunatorioProxy(new Vacunatorio());
        proxy.vacunar(p1);
        proxy.vacunar(p2);
        proxy.vacunar(p3);

    }
}
