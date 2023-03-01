package com.flotaAviones.Persistence.Daos;

import com.flotaAviones.Models.Avion;
import com.flotaAviones.Persistence.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AvionDao implements IDao<Avion>{
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    @Override
    public Avion registrar(Avion avion) {
        String insert="INSERT INTO aviones VALUES(default,?,?,?,?)";
        try {
            connection= DbConnection.getConnection();

            ps=connection.prepareStatement(insert,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, avion.getMarca());
            ps.setString(2, avion.getModelo());
            ps.setString(3, avion.getMatricula());
            ps.setString(4, String.valueOf(avion.getInicioServicio()));
            ps.executeUpdate();

            rs=ps.getGeneratedKeys();
            rs.next();

            Long idAvion = (long) rs.getInt(1);
            System.out.println(idAvion);
            avion.setId(idAvion);
            return avion;
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e);
        }finally {
            try {
                connection.close();
                ps.close();
            }catch (SQLException e) {
                e.toString();
            }
        }
        return null;
    }

    @Override
    public Avion buscar(Long id) {
        String select="SELECT * FROM aviones WHERE id = ?";
        try {
            Avion avion;
            connection= DbConnection.getConnection();

            ps=connection.prepareStatement(select);
            ps.setLong(1,id);

            rs=ps.executeQuery();
            rs.next();

            Long idAvion = (long) rs.getInt(1);
            String marca = rs.getString(2);
            String modelo = rs.getString(3);
            String matricula = rs.getString(4);
            LocalDate inicioServicio = LocalDate.parse(rs.getString(5));

            avion= new Avion(idAvion,marca,modelo,matricula,inicioServicio);
            return avion;
        }catch (SQLException e){
            e.toString();
        }finally {
            try {
                connection.close();
                ps.close();
                rs.close();
            }catch (SQLException e) {
                e.toString();
            }
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        String delete="DELETE FROM aviones WHERE id = ?";
        try {
            connection= DbConnection.getConnection();

            ps=connection.prepareStatement(delete);
            ps.setLong(1,id);
            ps.executeUpdate();
            System.out.println("se elimino el avion con id: "+id);
        }catch (SQLException e){
            e.toString();
        }finally {
            try {
                connection.close();
                ps.close();
            }catch (SQLException e) {
                e.toString();
            }
        }
    }

    @Override
    public List<Avion> buscarTodo() {
        String select="SELECT * FROM aviones";
        List<Avion> aviones = new ArrayList<>();
        try {
            Avion avion;
            connection= DbConnection.getConnection();

            ps=connection.prepareStatement(select);

            rs=ps.executeQuery();

            while (rs.next()){
                Long idAvion = (long) rs.getInt(1);
                String marca = rs.getString(2);
                String modelo = rs.getString(3);
                String matricula = rs.getString(4);
                LocalDate inicioServicio = LocalDate.parse(rs.getString(5));
                avion= new Avion(idAvion,marca,modelo,matricula,inicioServicio);
                aviones.add(avion);
            }
        }catch (SQLException e){
            e.toString();
        }finally {
            try {
                connection.close();
                ps.close();
                rs.close();
            }catch (SQLException e) {
                e.toString();
            }
        }
        return aviones;
    }
}
