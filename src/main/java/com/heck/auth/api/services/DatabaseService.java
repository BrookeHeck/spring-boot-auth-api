package com.heck.auth.api.services;

import java.util.Collection;

public interface DatabaseService<T> {
    T create(T record);
    Collection<T> getAll();
    T getOne(long id);
    T update(T record);
    boolean delete(long id);
}
