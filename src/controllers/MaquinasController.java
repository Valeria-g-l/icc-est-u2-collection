package controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {
    //Metodo que ordena un listado de maquinas por su subred y luego por el nombre 
    //Si ambas son iguales se consideran maquinas iguales y se desctartan

    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas){
       Set<Maquina> maquinas0 = new TreeSet<>();
       for (Maquina maquina : maquinas) {
            maquinas0.add(maquina);
        
       }
        return maquinas0;
    }
    
}
