package org.sid.produit.service;

import org.sid.produit.dao.EmployeRepository;
import org.sid.produit.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Empservice {
    @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> getemp(){
        return employeRepository.findAll();
    }
    public void addNewEmploye(Employe employe){
        employeRepository.save(employe);
    }
    public Employe getemploye(long id){
        return employeRepository.findById(id).get();
    }
    public Employe UpdateEmploye(long id, Employe E ){
        E.setId(id);
        return employeRepository.save(E);
    }
    public void DeleteEmploye(long id) {
        employeRepository.deleteById(xid);
    }
}
