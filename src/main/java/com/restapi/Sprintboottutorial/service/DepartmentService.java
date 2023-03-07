package com.restapi.Sprintboottutorial.service;

import com.restapi.Sprintboottutorial.entity.Departement;
import java.util.List;

public interface DepartmentService {

    public Departement saveDepartment(Departement departement);
    public List<Departement> fetchDepartmentsList();
}
