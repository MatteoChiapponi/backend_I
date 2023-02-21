import java.time.LocalDate;
import java.time.LocalDateTime;

public class VacunatorioProxy implements VacunatorioInterfaz{
    private Vacunatorio puestoVacunacion;

    public VacunatorioProxy(Vacunatorio puestoVacunacion) {
        this.puestoVacunacion = puestoVacunacion;
    }

    public Vacunatorio getPuestoVacunacion() {
        return puestoVacunacion;
    }

    public void setPuestoVacunacion(Vacunatorio puestoVacunacion) {
        this.puestoVacunacion = puestoVacunacion;
    }

    @Override
    public String vacunar(Persona persona) {
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaTurno = persona.getFecha();

        if(fechaHoy.equals(fechaTurno) || fechaManana.equals(fechaTurno)){
            System.out.println(puestoVacunacion.vacunar(persona));
        }else{
            System.out.println("Saca otro turno");
        }
        return "";
    }
}
