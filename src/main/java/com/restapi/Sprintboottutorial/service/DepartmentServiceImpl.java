package com.restapi.Sprintboottutorial.service;

import com.restapi.Sprintboottutorial.entity.Departement;
import com.restapi.Sprintboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Departement saveDepartment(Departement departement) {
        return departmentRepository.save(departement); // la méthode save() vient de Jpa
    }

    @Override
    public List<Departement> fetchDepartmentsList() {
        return departmentRepository.findAll();
    }
}
