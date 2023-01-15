package com.portfolio.Portfolio_Efrain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String nombre;
    
    @Size(min = 1, max = 150, message = "no cumple con la longitud")
    private String titulo;
    
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String domicilio;
    
    @Size(min = 1, max = 11, message = "no cumple con la longitud")
    private String fechaNac;
    
    @Size(min = 1, max = 15, message = "no cumple con la longitud")
    private String telefono;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String correo;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img_banner;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img_foto;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String url_facebook;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String url_instagram;
    
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String acercaDe;

}
