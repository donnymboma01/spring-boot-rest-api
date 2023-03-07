package com.restapi.Sprintboottutorial.controller;

import com.restapi.Sprintboottutorial.entity.Departement;
import com.restapi.Sprintboottutorial.service.DepartmentService;
import com.restapi.Sprintboottutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departement")
    public Departement saveDepartement(@RequestBody Departement departement){
        return departmentService.saveDepartment(departement);
    }
}
