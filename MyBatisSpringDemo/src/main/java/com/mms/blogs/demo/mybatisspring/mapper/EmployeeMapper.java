package com.mms.blogs.demo.mybatisspring.mapper;

import com.mms.blogs.demo.mybatisspring.vo.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {

	public Employee getEmployeeName(long empId);
	
	public void insertEmployee(Employee employee);
	
	
}
