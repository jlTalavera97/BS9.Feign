package com.example.BS9.RestTemplateFeign.profesor.infrastructure.controller;

import com.example.BS9.RestTemplateFeign.profesor.application.service.interfaz.ProfesorService;
import com.example.BS9.RestTemplateFeign.profesor.domain.dto.output.ProfesorOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/getId/{id}")
    public ProfesorOutputDto getId(@PathVariable int id) throws Exception{
        System.out.println("En profesor");
        return profesorService.buscarPorId(id);
    }

}
