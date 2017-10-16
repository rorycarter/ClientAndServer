package com.roryCarter.Services;

public interface BaseService<E,ID> {
    E save(E entity);
    E findById(ID id);
    E update(E id);
    void delete(E id);
}
