package com.example.crudTask.demo.repos;


import com.example.crudTask.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
	
	

}