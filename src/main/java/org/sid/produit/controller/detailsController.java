package org.sid.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.sid.produit.entities.details;
import org.sid.produit.dao.detailsRepository;
import org.sid.produit.service.detailsservice;
@RestController
@CrossOrigin("*")
public class detailsController {

    @Autowired
    private detailsRepository detailsRepository;
    @Autowired
    private detailsservice detailsservice;
    @PostMapping("/addDetails")
    public void addDetails(@RequestBody details details){
        detailsservice.addDetails(details);
    }

}

