package com.flotaAviones.Services;

import com.flotaAviones.Models.Avion;
import com.flotaAviones.Persistence.Daos.AvionDao;
import com.flotaAviones.Persistence.Daos.IDao;

import java.util.List;

public class AvionesService {
    IDao<Avion> avionDao;

    public AvionesService() {
        avionDao=new AvionDao();
    }
    public Avion registrarAvion(Avion avion){
        return avionDao.registrar(avion);
    }
    public Avion buscarAvion(Long id){
        return avionDao.buscar(id);
    }
    public void eliminarAvion(Long id){
        avionDao.eliminar(id);
    }
    public List<Avion> buscarTodosLosAviones(){
        return avionDao.buscarTodo();
    }
}
