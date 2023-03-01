import dbConnection.DbConnection;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        CirculosDao circulosDao = new CirculosDao();
        circulosDao.insertarCirculos("circulo","rojo");
    }
}
