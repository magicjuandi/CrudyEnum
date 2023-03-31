package com.EjerciciosCrud.Local.RepositoryLocal;

import java.util.ArrayList;
import java.util.List;

import com.EjerciciosCrud.Local.ModelLocal.Local;

public class LocalRepImp implements LocalRep {
    
    private List<Local> locals;

    public LocalRepImp(){
        locals = new ArrayList<>();
    }

    @Override
    public void update(Local local){
        Local oldLocal = findbyNum(local.getNumLocal());
        if(oldLocal != null){
            locals.remove(oldLocal);
            locals.add(local);
        }
    }
    @Override
    public void delete(Local local){
        locals.remove(local);
    }
    @Override
    public List<Local> findAll(){
        return locals;
    }
    @Override
    public Local findbyNum(int numLocal){
        return locals.stream()
            .filter(local -> local.getNumLocal() == numLocal)
            .findFirst()
            .orElse(null);
    }

    @Override
    public void save(Local local) {
        locals.add(local);
    }
       



}
