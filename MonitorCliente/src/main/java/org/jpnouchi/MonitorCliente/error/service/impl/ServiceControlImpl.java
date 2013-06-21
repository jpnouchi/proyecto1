package org.jpnouchi.MonitorCliente.error.service.impl;

import org.jpnouchi.MonitorCliente.error.dao.ControlDAO;
import org.jpnouchi.MonitorCliente.error.model.Control;
import org.jpnouchi.MonitorCliente.error.service.ServiceControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 21/06/13
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */

@Service
public class ServiceControlImpl implements ServiceControl{

   // @Autowired
    private ControlDAO controlDAO;

    @Override
    public Control get(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.

    }

    @Override
    public List<Control> getAll() {

       return  controlDAO.getAll();
    }

    @Override
    public void save(Control control) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public void update(Control control) {

           controlDAO.update(control);
    }

    @Override
    public void delete(Control control) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
