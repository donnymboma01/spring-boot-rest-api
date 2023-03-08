package com.restapi.Sprintboottutorial.service;

import com.restapi.Sprintboottutorial.entity.Departement;
import java.util.List;

public interface DepartmentService {

    public Departement saveDepartment(Departement departement);
    public List<Departement> fetchDepartmentsList();
    public Departement fecthDepartmentById(Long departmentId);
    public void deleteDepartmentById(Long department);
    public Departement updateDepartment(Long departmentId, Departement departement);
    public Departement fetchDepartmentByName(String departmentName);
}
