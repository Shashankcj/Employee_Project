package com.EmployeeManagment.EmployeeManagment.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagment.EmployeeManagment.Entity.Employee;
import com.EmployeeManagment.EmployeeManagment.Repository.EmployeeRepository;

@Service
public class EmplyoeeServiceImpl implements EmployeeSevice {

	@Autowired
	EmployeeRepository er;
	
	@Override
	public Employee add(Employee emplyoee) {
		
		return er.save(emplyoee);
	}

	@Override
	public Employee update( int e_id ,Employee employee) {
	Employee emp= er.findById(e_id).get();

	emp.setFirstName(employee.getFirstName());
	emp.setLastName(employee.getLastName());
	emp.setEmail(employee.getEmail());
		return er.save(emp);
	}

	@Override
	public Employee getEmployee(int e_id) {
		
		return er.findById(e_id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employeelist=new ArrayList<Employee>();
		er.findAll().forEach(employee->employeelist.add(employee));
		return employeelist;
	}

	@Override
	public String delete(int e_id) {
		er.deleteById(e_id);
		return "Deleted";
			
			
	}

}
