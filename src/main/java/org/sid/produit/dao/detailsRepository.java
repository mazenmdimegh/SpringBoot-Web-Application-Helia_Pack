package org.sid.produit.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.sid.produit.entities.details;

@RepositoryRestResource
@CrossOrigin("*")
public interface detailsRepository extends JpaRepository<details,Long> {

}
