package org.jpnouchi.MonitorCliente.error.dao;

import org.jpnouchi.MonitorCliente.base.dao.GenericDAO;
import org.jpnouchi.MonitorCliente.error.model.Control;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 20/06/13
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
//@Component
    @Repository
public interface ControlDAO  {


    List<Control> getAll();

    void update(Control control);
}
