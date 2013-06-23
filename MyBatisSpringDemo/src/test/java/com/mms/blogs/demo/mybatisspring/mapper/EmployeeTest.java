package com.mms.blogs.demo.mybatisspring.mapper;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mms.blogs.demo.mybatisspring.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:applicationContext.xml"})
public class EmployeeTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Before
	public void insertEmployee(){

	}
	
	@Test
	public void testEmployee(){

        Employee emp = new Employee();
        emp.setEmpid(1);
        emp.setFirstName("Manik");
        emp.setLastName("Magar");
        employeeMapper.insertEmployee(emp);

		System.out.println("testEmployee");
		Employee emp2 = employeeMapper.getEmployeeName(1);
		Assert.assertNotNull(emp2);
	}
	
}
