import dao.EmpleadoDao;

public class Main {
    public static void main(String[] args) {
        EmpleadoDao empleadoDao = new EmpleadoDao();
        empleadoDao.insertarEmpleado("matteo", 19);
        empleadoDao.insertarEmpleado("leandro", 19);
        empleadoDao.insertarEmpleado("roberto", 19);
        empleadoDao.eliminarEmpleado("matteo");
    }
}
