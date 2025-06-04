package org.crudapp.repository;

import org.crudapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All CRUD Database methods
}


