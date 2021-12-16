package org.sid.produit.controller;

import org.sid.produit.dao.hourRepository;
import org.sid.produit.entities.hour;
import org.sid.produit.service.hourservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
public class hoursController {
    @Autowired
    private hourRepository hourRepository;
    @Autowired
    private hourservices hourservices;
    @PostMapping("/addHours")
    public void addHour(@RequestBody hour hour){

       hourservices.addhour(hour);
    }
    @GetMapping(value = "/hour")
    private List<hour> hourslist(){

        return hourservices.gethour();
    }
}
