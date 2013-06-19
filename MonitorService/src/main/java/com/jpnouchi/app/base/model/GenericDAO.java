package com.jpnouchi.app.base.model;

import com.jpnouchi.app.base.util.Pagination;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 19/06/13
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO <T> {
    public T get(Long id);
    public List<T> getAll();
    public List<T> getAll(Pagination paginacion);
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
