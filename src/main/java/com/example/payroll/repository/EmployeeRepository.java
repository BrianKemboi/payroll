package com.example.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.payroll.model.*;;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}