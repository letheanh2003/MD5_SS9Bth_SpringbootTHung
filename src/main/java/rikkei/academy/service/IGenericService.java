package rikkei.academy.service;

import rikkei.academy.model.Student;

import java.util.Optional;

public interface IGenericService<T, E> {
    Iterable<T> findAll();
    Student save(T t);
    void deleteById(E id);
    Optional<T> findById(E id);
}
