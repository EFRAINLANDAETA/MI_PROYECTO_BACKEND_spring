package com.portfolio.Portfolio_Efrain.Repository;

import com.portfolio.Portfolio_Efrain.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
