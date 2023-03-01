import dbConnection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CirculosDao {
    Connection connection = DbConnection.getConnection();
    PreparedStatement preparedStatement;

    public void insertarCirculos(String tipoFigura, String color){
        {
            try {
                preparedStatement = connection.prepareStatement("insert into figuras values(default,?,?)");
                preparedStatement.setString(1,tipoFigura);
                preparedStatement.setString(2,color);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
