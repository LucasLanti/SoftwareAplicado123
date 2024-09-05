package br.pucrs.engswii.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Discipline;
import br.pucrs.engswii.beans.DisciplineRegistration;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DisciplineRetrieveController {
    @GetMapping("/class/{matricula}")
    public List<Discipline> getClassByMatricula(@PathVariable int matricula) {
        DisciplineRegistration instace = DisciplineRegistration.getInstance();
        List<Discipline> list = instace.getDisciplinesByMatricula(matricula);
        return list;

    }
    
}
