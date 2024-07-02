package com.EmployeeManagment.EmployeeManagment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagment.EmployeeManagment.Entity.Employee;
import com.EmployeeManagment.EmployeeManagment.Service.EmplyoeeServiceImpl;


@CrossOrigin("*")
@RestController
public class EmployeeController {
	
	@Autowired
	EmplyoeeServiceImpl esi;
	
	@PostMapping("/employee")
	public Employee createStudent(@RequestBody  Employee employee) {
		return esi.add(employee);
		
	}
	
	@GetMapping("/employee/{e_id}")
	public Employee retriveStudent(@PathVariable("e_id") int e_id) {
		 return esi.getEmployee(e_id);
		
	}
	
	@GetMapping("/employee")
	public List<Employee> retriveAllStudent() {
		return esi.getAllEmployee();
	}
	
	@DeleteMapping("/employee/{e_id}")
	public String deleteStudent(@PathVariable("e_id") int e_id) {
			return esi.delete(e_id);
	}
	
	@PutMapping("/employee/{e_id}")
	public Employee update(@PathVariable("e_id")int e_id ,@RequestBody Employee employee) {
		
		return 	esi.update(e_id, employee);
		
		
	}


}
