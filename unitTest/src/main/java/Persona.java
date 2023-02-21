import java.util.Date;

public class Persona {
    /*
Te proponemos desarrollar una pequeña aplicación. Para eso, debemos generar la clase Persona, que tiene que tener los atributos:
Nombre, Apellido, Email y Edad. Los objetivos son crear:
Un método que muestre el nombre completo de la siguiente manera: Apellido, Nombre.
Un método para calcular si la persona es mayor de 18 años.
Un test que nos certifique que el nombre completo es correcto.
Un test que nos certifique que la persona es realmente mayor a 18 años, tener en cuenta que la fecha de hoy que vamos a utilizar
en los test tiene que ir harcodeada, es decir, agregada manualmente con la fecha: 21/09/2021. Debemos comparar contra esta fecha en los tests.
Por ejemplo, alguien nacido el 20/01/2015 no es mayor a 18 años.
    */
    private String nombre;
    private String apellido;
    private String email;
    private Date edad;

    public String mostrarNombreCompleto(){
        return nombre + " " + apellido;
    }

    public Persona(String nombre, String apellido, String email, Date edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public Boolean esMayorDeEdad(){
        Long tiempoDeVida = edad.getTime()/604800000; // en semanas
        int años = 0;
        System.out.println(tiempoDeVida);
        while (tiempoDeVida >= 52){
            System.out.println(años);
            años+=1;
        }
        return años >= 18;
    }
}
