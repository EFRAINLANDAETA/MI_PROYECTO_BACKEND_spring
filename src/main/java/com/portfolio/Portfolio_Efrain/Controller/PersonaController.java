package com.portfolio.Portfolio_Efrain.Controller;

import com.portfolio.Portfolio_Efrain.Entity.Persona;
import com.portfolio.Portfolio_Efrain.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La Persona fue eliminada correctamente";
                
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("domicilio") String nuevoDomicilio,
                               @RequestParam("fechaNac") String nuevoFechaNac,
                               @RequestParam("telefono") String nuevoTelefono,
                               @RequestParam("correo") String nuevoCorreo,
                               @RequestParam("img_banner") String nuevoImg_banner,
                               @RequestParam("img_foto") String nuevoImg_foto,
                               @RequestParam("url_facebook") String nuevoUrl_facebook,
                               @RequestParam("url_instagram") String nuevoUrl_instagram,
                               @RequestParam("acercaDe") String nuevoAcercaDE){
    
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setTitulo(nuevoTitulo);
        persona.setDomicilio(nuevoDomicilio);
        persona.setFechaNac(nuevoFechaNac);
        persona.setTelefono(nuevoTelefono);
        persona.setCorreo(nuevoCorreo);
        persona.setImg_banner(nuevoImg_banner);
        persona.setImg_foto(nuevoImg_foto);
        persona.setUrl_facebook(nuevoUrl_facebook);
        persona.setUrl_instagram(nuevoUrl_instagram);
        persona.setAcercaDe(nuevoAcercaDE);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
}
