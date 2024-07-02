package com.EmployeeManagment.EmployeeManagment.Service;

import java.util.List;

import com.EmployeeManagment.EmployeeManagment.Entity.Employee;

public interface EmployeeSevice {
	
	public Employee add(Employee emplyoee);
	public Employee update( int e_id ,Employee employee);
	public Employee getEmployee(int e_id);
	public List<Employee> getAllEmployee();
	public String delete(int e_id);


}
