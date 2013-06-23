package com.jpnouchi.app.service.impl;

import com.jpnouchi.app.mapper.ControlMapper;
import com.jpnouchi.app.model.Control;
import com.jpnouchi.app.service.ServiceControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jose
 * Date: 23/06/13
 * Time: 01:00 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class ServiceControlImpl implements ServiceControl {

    @Autowired
    private ControlMapper controlMapper;

    @Override
    public Control get(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Control> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void save(Control control) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(Control control) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Control control) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
