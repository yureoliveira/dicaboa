package com.yoliveira.onlinestore.repositorio;

import com.yoliveira.onlinestore.modelo.Processador;


import java.util.ArrayList;
import java.util.List;

public class ProcessadorRepositorio  implements IRepositorio<Processador>{
    @Override
    public List<Processador> listar(){
        String[]itens=new String[]{
                "Intel I3 2GHz",
                "Intel I5 2,5GHz",
                "Intel I5 3GHz",
                "Intel I7 3GHz",
                "Intel I9 3,5GHz",

        };
        List<Processador>cpus=new ArrayList<Processador>();
        for (int i=0;i<itens.length; i++){
            cpus.add(new Processador(i+1,itens[i]));

        }
        return cpus;

    }



}
