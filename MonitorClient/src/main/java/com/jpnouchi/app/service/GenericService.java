package com.jpnouchi.app.service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jose
 * Date: 23/06/13
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericService<T> {
    public T get(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
