package org.jpnouchi.MonitorCliente.base.dao;


import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 19/06/13
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO <T> {
    public T get(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
