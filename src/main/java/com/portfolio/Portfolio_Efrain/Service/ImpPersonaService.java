package com.portfolio.Portfolio_Efrain.Service;

import com.portfolio.Portfolio_Efrain.Entity.Persona;
import com.portfolio.Portfolio_Efrain.Interface.IPersonaService;
import com.portfolio.Portfolio_Efrain.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    
    }
    
    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    
    }

}
