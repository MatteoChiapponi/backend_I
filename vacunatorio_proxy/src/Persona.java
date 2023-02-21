import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer dni;
    private String nombreVacuna;
    private LocalDate fecha;

    public Persona(String nombre, String apellido, Integer dni, String nombreVacuna, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nombreVacuna = nombreVacuna;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
