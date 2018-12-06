package com.yoliveira.onlinestore.repositorio;

import com.yoliveira.onlinestore.modelo.Marca;

import java.util.ArrayList;
import java.util.List;

public class MarcaRepositorio  implements IRepositorio<Marca>{

    @Override
    public List<Marca> listar(){
        String [] itens=new String[]{
            "Acer","Dell","Lenovo","Samsung"
        };
        List<Marca> marcas=new ArrayList<Marca>();
        for(int i=0; i<itens.length;i++){
            marcas.add(new Marca( i+1,itens[i]));
        }
        return marcas;
    }




}
