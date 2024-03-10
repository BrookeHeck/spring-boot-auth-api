package com.heck.auth.api.services;

import java.util.Collection;

public interface DatabaseInterface<T> {
    T create(T record);
    Collection<T> getAll();
    T getOne(long id);
    boolean delete(long id);
}
