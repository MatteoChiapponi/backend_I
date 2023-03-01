package com.flotaAviones.Persistence.Daos;

import java.util.List;

public interface IDao <T>{
    T registrar(T t);
    T buscar(Long id);
    void eliminar(Long id);
    List<T> buscarTodo();
}
