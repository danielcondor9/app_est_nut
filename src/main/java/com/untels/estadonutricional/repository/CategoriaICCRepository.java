package com.untels.estadonutricional.repository;

import com.untels.estadonutricional.entity.CategoriaICC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaICCRepository extends
        JpaRepository<CategoriaICC, Integer> {

}
