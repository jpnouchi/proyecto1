package org.jpnouchi.MonitorCliente.base.service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 20/06/13
 * Time: 15:07
 * To change this template use File | Settings | File Templates.
 */
public interface GenericService<T> {

    public T get(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
