package org.sid.produit.controller;

import org.sid.produit.dao.ProduitRepository;
import org.sid.produit.entities.Produit;
import org.sid.produit.service.Prodservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProdController {

    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private Prodservice prodservice;

    @GetMapping(value = "/produit")
    private List<Produit> prodliste(){
        return prodservice.getemp();
    }
    @GetMapping(value = "/produit/{id}")
    private Produit getproduit(@PathVariable(name = "id")long id){
        return prodservice.getproduit(id);
    }

    @PostMapping("/addproduit")
    public void addNewproduit(@RequestBody Produit produit){
        prodservice.addNewProduit(produit);
    }

    @PutMapping("/produit/{id}")
    public Produit UpdateProduits(@PathVariable(name = "id")long id, @RequestBody Produit P){
        return prodservice.UpdateProduit(id,P);
    }

    @DeleteMapping("/produit/{id}")
    public void DeleteProduit(@PathVariable(name = "id")long id){
        prodservice.DeleteProduit(id);
    }

}
