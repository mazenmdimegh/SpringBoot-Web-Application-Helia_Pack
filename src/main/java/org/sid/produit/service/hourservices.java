package org.sid.produit.service;

import org.sid.produit.entities.hour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sid.produit.dao.hourRepository ;
import java.util.List;

@Service
public class hourservices {
    @Autowired
    private hourRepository hourRepository;

    public void addhour(hour hour){
        hourRepository.save(hour);
    }
    public List<hour> gethour(){
        return hourRepository.findAll();
    }
}
