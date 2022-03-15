package com.example.BS9.RestTemplateFeign.persona.infrastructure.controller;

import com.example.BS9.RestTemplateFeign.persona.application.feign.IFeignServer;
import com.example.BS9.RestTemplateFeign.persona.application.service.interfaz.PersonaService;
import com.example.BS9.RestTemplateFeign.persona.domain.dto.output.PersonaOutputDto;
import com.example.BS9.RestTemplateFeign.profesor.domain.dto.output.ProfesorOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    IFeignServer iFeignServer;

    @GetMapping("{id}")
    public ResponseEntity<ProfesorOutputDto> getProfesorFeign(@PathVariable int id) throws Exception {
        System.out.println("En cliente antes de llamada");
        ResponseEntity<ProfesorOutputDto> respuesta = iFeignServer.getIdProfesor(id);
        System.out.println("En cliente despues de llamada");
        return respuesta;
    }

}
