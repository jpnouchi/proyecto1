package mybatis;

import static org.junit.Assert.*;
import org.jpnouchi.MonitorCliente.error.dao.ControlDAO;
import org.jpnouchi.MonitorCliente.error.model.Control;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 21/06/13
 * Time: 16:46
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-config.xml"})
public class MybatisTest {

    @Autowired
    private ControlDAO controlDAO;

    @Test
    public void testControlDAO() {

        List<Control> controlList= controlDAO.getAll();
        assertNotNull(controlList);
        assertEquals(2,controlList.size());

    }

}
