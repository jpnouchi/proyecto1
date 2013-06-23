package com.jpnouchi.app.mapper;

import com.jpnouchi.app.model.Control;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jose
 * Date: 23/06/13
 * Time: 12:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface ControlMapper {

    public List<Control> getAll();

    public  void update(Control control);
}
