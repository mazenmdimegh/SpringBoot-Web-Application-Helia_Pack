package org.sid.produit.controller;

import org.sid.produit.dao.EmployeRepository;
import org.sid.produit.entities.Employe;
import org.sid.produit.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
public class EmpController {

    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private Empservice empservice;
    @GetMapping(value = "/employe")
    private List<Employe> empliste(){
            return empservice.getemp();
    }
    @GetMapping(value = "/employe/{id}")
    private Employe getemploye(@PathVariable(name = "id")long id){
        return empservice.getemploye(id);
    }

    @PostMapping("/addemp")
    public void addNewEmploye(@RequestBody Employe employe   ){
        empservice.addNewEmploye(employe);
    }

    @PutMapping("/employe/{id}")
    public Employe UpdateEmploye(@PathVariable(name = "id")long id, @RequestBody Employe E){
        return empservice.UpdateEmploye(id,E);
    }

    @DeleteMapping("/employe/{id}")
    public void DeleteEmploye(@PathVariable(name = "id")long id){
        empservice.DeleteEmploye(id);
    }

}
