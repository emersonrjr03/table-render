package br.ufu.tablerender.repositories;

import java.util.List;

public interface Repository<T, U> {

    T findById(U id);

    List<T> findAll();

    void save(T obj);

    void delete(T obj);
}