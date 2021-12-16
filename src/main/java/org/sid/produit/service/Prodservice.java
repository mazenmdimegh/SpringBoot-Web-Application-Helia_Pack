package org.sid.produit.service;

import org.sid.produit.dao.ProduitRepository;

import org.sid.produit.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Prodservice {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getemp(){
        return produitRepository.findAll();
    }
    public void addNewProduit(Produit produit){
        produitRepository.save(produit);
    }
    public Produit getproduit(long id){
        return produitRepository.findById(id).get();
    }
    public Produit UpdateProduit(long id, Produit P ){
        P.setId(id);
        return produitRepository.save(P);
    }
    public void DeleteProduit(long id) {
        produitRepository.deleteById(id);
    }
}
