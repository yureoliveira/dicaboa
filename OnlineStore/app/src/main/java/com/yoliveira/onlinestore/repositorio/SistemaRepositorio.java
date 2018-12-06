package com.yoliveira.onlinestore.repositorio;

import com.yoliveira.onlinestore.modelo.Marca;
import com.yoliveira.onlinestore.modelo.Sistema;

import java.util.ArrayList;
import java.util.List;

public class SistemaRepositorio implements IRepositorio<Sistema>{

    @Override
    public List<Sistema>listar(){
        String[]itens=new String[]{
                "Windows 8","Windows 10","Ubunto 18","Debian","macOS X"
        };
        List<Sistema>sistemas=new ArrayList<Sistema>();
        for (int i=0;i<itens.length; i++){
            sistemas.add(new Sistema(i+1,itens[i]));

        }
        return sistemas;

    }

}
