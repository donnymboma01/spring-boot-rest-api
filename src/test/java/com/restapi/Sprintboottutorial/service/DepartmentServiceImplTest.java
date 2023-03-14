package com.restapi.Sprintboottutorial.service;

import com.restapi.Sprintboottutorial.entity.Departement;
import com.restapi.Sprintboottutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceImplTest {

    @Autowired
    private DepartmentService departmentService;

    // On va mocker departmentRepository afin d'assurer l'independance entre les couches.
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
        Departement departement = Departement.builder()
                .departmentName("IT")
                .departementAddress("Henallux IESN")
                .departementCode("IG-IT-IESN")
                .departementId(1L)
                .build();
        Mockito.when(departmentRepository.findByDepartmentName("IT"))
                .thenReturn(departement);
    }

    @Test
    @DisplayName("Get Data based on valid department name")
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "IT";
        Departement found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}