package com.restapi.Sprintboottutorial.repository;

import com.restapi.Sprintboottutorial.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departement, Long> {

    public Departement findByDepartmentName(String departmentName);

    public Departement findByDepartmentNameIgnoreCase(String departmentName);
}
