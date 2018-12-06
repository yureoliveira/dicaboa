package com.yoliveira.onlinestore.repositorio;

import java.util.List;

public interface IRepositorio<T> {
    public List<T> listar();
}
