package org.sid.produit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sid.produit.dao.detailsRepository;
import org.sid.produit.entities.details;

@Service
public class detailsservice {
    @Autowired
    private detailsRepository detailsRepository;
    public void addDetails(details Details){
        detailsRepository.save(Details);
    }
}
