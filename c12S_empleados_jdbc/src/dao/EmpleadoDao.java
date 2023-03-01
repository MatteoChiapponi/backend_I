package dao;

import db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoDao {
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public EmpleadoDao() {

    }

    public void insertarEmpleado(String nombre, Integer edad) {
        connection=DbConnection.getConnection();
        try {
            preparedStatement=connection.prepareStatement("INSERT INTO empleado(nombre, edad) VALUES(?,?);");
            preparedStatement.setString(1,nombre);
            preparedStatement.setInt(2,edad);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
        finally {
            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
    }
    public void actualizarEmpleado(Integer edadNueva, Integer edadVieja){
            connection=DbConnection.getConnection();
            try {
                preparedStatement=connection.prepareStatement("UPDATE empleado SET edad = ? WHERE edad = ?;");
                preparedStatement.setInt(1,edadNueva);
                preparedStatement.setInt(2,edadVieja);
                preparedStatement.executeUpdate();
                connection.close();
                preparedStatement.close();
            }
            catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
    }
    public void eliminarEmpleado(String nombre){
        connection=DbConnection.getConnection();
        mostrarEmpleado(nombre);
        try {
            preparedStatement=connection.prepareStatement("DELETE FROM empleado WHERE nombre = ?;");
            preparedStatement.setString(1,nombre);
            preparedStatement.executeUpdate();
            System.out.println("se borro");
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
    }
    public void mostrarEmpleado(String nombre){
        connection=DbConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM empleado WHERE nombre = ? LIMIT 1;");
            preparedStatement.setString(1, nombre);
            resultSet=preparedStatement.executeQuery();
            resultSet.next();
            System.out.println("el usuario que se esta por eliminar es usuario "+nombre+" con id: "+ resultSet.getInt("idempleado"));;
            resultSet.close();
        }
        catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
    }
}
