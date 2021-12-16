package org.sid.produit.dao;
import org.sid.produit.entities.Employe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RepositoryRestResource
@CrossOrigin("*")
public interface EmployeRepository extends JpaRepository<Employe,Long> {
   @RestResource(path="/byName")
   public List<Employe> findByNameContains(@Param("mc") String des );
   @RestResource(path="/byNamePage")
    public Page<Employe> findByNameContains(@Param("mc")String  des , Pageable pageable);
}
