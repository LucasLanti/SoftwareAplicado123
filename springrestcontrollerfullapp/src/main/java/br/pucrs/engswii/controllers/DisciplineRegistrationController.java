package br.pucrs.engswii.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Discipline;
import br.pucrs.engswii.beans.DisciplineRegistration;
import br.pucrs.engswii.beans.DisciplineRegistrationReply;
import br.pucrs.engswii.beans.Matricula;

@RestController
public class DisciplineRegistrationController {
    @PostMapping("/register/discipline")
    public ResponseEntity<?> registerDiscipline(@RequestBody Discipline discipline) throws Exception {
        try {
            System.out.println("In registerDiscipline");
            DisciplineRegistrationReply discregreply = new DisciplineRegistrationReply();
            DisciplineRegistration instace = DisciplineRegistration.getInstance();
            if (instace.getDuplicatedDiscipline(discipline)) {
                throw new Exception("Duplicated Discipline");
            }
            DisciplineRegistration.getInstance().add(discipline);
            discregreply.setDisciplineCod(discipline.getDisciplineCod());
            discregreply.setDisciplineName(discipline.getDisciplineName());
            discregreply.setDisciplineHour(discipline.getDisciplineHour());
            discregreply.setDisciplineClass(discipline.getDisciplineClass());
            discregreply.setRegistrationStatus("Successful");
            return new ResponseEntity<>(discregreply, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/register/matricula")
    public DisciplineRegistrationReply matriculaStudent(@RequestBody Matricula matricula) {
        DisciplineRegistrationReply discregreply = new DisciplineRegistrationReply();
        DisciplineRegistration instace = DisciplineRegistration.getInstance();
        Discipline discipline = instace.matricularAluno(matricula.getCodDisciplina(), matricula.getMatricula(), matricula.getTurma());
        if (discipline == null) {
            discregreply.setRegistrationStatus("Failed");
        } else {
            discregreply.setDisciplineCod(discipline.getDisciplineCod());
            discregreply.setDisciplineName(discipline.getDisciplineName());
            discregreply.setDisciplineHour(discipline.getDisciplineHour());
            discregreply.setDisciplineClass(discipline.getDisciplineClass());
            discregreply.setRegistrationStatus("Successful");
        }
        return discregreply;
    }
    
}
