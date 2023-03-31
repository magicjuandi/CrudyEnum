package com.EjerciciosCrud.Local.RepositoryLocal;

import java.util.List;

import com.EjerciciosCrud.Local.ModelLocal.Local;

public interface LocalRep {
    Local findbyNum(int numLocal);
    List<Local> findAll();
    void save(Local local);
    void update(Local local);
    void delete(Local local);
}
