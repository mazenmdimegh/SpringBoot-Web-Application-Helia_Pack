package org.sid.produit.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.sid.produit.entities.hour;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface hourRepository extends JpaRepository<hour,Long> {
    @RestResource(path="/byDate")
    public List<hour> findByDateContains(@Param("date") String des );
    @RestResource(path="/byDatePage")
    public Page<hour> findByDateContains(@Param("date") String des , Pageable pageable);
}
