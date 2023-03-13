package com.restapi.Sprintboottutorial.service;

import com.restapi.Sprintboottutorial.entity.Departement;
import com.restapi.Sprintboottutorial.exception.DepartmentNotFoundException;
import com.restapi.Sprintboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Override
    public Departement fecthDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Departement> departement = departmentRepository.findById(departmentId);

        if(!departement.isPresent()){
            throw new DepartmentNotFoundException("Department Not Found !");
        }

        return departement.get();
    }

    @Override
    public void deleteDepartmentById(Long department) {
        departmentRepository.deleteById(department);
    }

    @Override
    public Departement updateDepartment(Long departmentId, Departement departement) {
        Departement departementDB = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(departement.getDepartmentName()) && !"".equalsIgnoreCase(departement.getDepartmentName())){
            departementDB.setDepartmentName(departement.getDepartmentName());
        }

        if(Objects.nonNull(departement.getDepartementCode()) && !"".equalsIgnoreCase(departement.getDepartementCode())){
            departementDB.setDepartementCode(departement.getDepartementCode());
        }

        if(Objects.nonNull(departement.getDepartementAddress()) && !"".equalsIgnoreCase(departement.getDepartementAddress())){
            departementDB.setDepartementAddress(departement.getDepartementAddress());
        }
        return departmentRepository.save(departementDB);
    }

    @Override
    public Departement fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }


}
