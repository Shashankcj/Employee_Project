package com.EmployeeManagment.EmployeeManagment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagment.EmployeeManagment.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
