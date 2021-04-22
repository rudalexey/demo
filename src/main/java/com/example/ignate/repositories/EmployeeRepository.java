package com.example.ignate.repositories;

import com.example.ignate.entity.Employee;
import org.apache.ignite.springdata22.repository.IgniteRepository;
import org.apache.ignite.springdata22.repository.config.Query;
import org.apache.ignite.springdata22.repository.config.RepositoryConfig;

import java.util.List;

@RepositoryConfig(cacheName = "PersonCache")
public interface EmployeeRepository extends IgniteRepository<Employee, Long> {

    List<Employee> findByNameLike(String name);

    @Query("SELECT emp.* FROM Employee emp WHERE name > ?")
    List<Employee> selectEmployeeByName(String name);
}
