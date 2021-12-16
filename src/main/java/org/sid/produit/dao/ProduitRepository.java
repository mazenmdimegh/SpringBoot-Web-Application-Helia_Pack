package org.sid.produit.dao;

import org.sid.produit.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProduitRepository extends JpaRepository<Produit,Long> {
    @RestResource(path="/byName")
    public List<Produit> findByNameContains(@Param("mc") String des );
    @RestResource(path="/byNamePage")
    public Page<Produit> findByNameContains(@Param("mc")String  des , Pageable pageable);

}
