package com.h2.repository;

import com.h2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public List<Employee> findAllByName(String name);

    @Query("from Employee r where r.name=?1 and r.department=?2")
    List<Employee> findByFirstNameAndLastName(String name, String dept);

}
