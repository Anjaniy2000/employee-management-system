package com.anjaniy.employeemanagementsystem.repositories;

import com.anjaniy.employeemanagementsystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Return a list of employees based on the department name:
    List<Employee> findByDepartmentName(String departmentName);

}
