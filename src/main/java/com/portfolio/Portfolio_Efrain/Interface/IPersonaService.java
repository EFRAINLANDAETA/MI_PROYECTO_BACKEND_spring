package com.portfolio.Portfolio_Efrain.Interface;

import com.portfolio.Portfolio_Efrain.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);

}
