package com.jpnouchi.app.mapper;

import com.jpnouchi.app.model.Control;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jose
 * Date: 23/06/13
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:applicationContext.xml"})
public class ControlTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ControlMapper controlMapper;

    @Test
    public void testControl(){
        List<Control> controlList= controlMapper.getAll();
        Assert.assertNotNull(controlList);
        Assert.assertEquals(1, controlList.size());
        System.out.println("testControl");
    }


}
