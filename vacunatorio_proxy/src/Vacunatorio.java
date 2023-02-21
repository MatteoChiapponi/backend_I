public class Vacunatorio implements VacunatorioInterfaz{
    @Override
    public String vacunar(Persona persona) {
        return "Vacunado. Vacuna: " + persona.getNombreVacuna();
    }
}
