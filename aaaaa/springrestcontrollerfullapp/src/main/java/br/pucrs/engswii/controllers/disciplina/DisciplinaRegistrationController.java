package br.pucrs.engswii.controllers.disciplina;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.disciplina.DisciplinaRegistration;
import br.pucrs.engswii.beans.disciplina.DisciplinaRegistrationReply;
import br.pucrs.engswii.beans.disciplina.Disciplina;


@RestController
public class DisciplinaRegistrationController {
	@PostMapping("/register/disciplina")
	public DisciplinaRegistrationReply registerDisciplina(@RequestBody Disciplina disciplina) {

		System.out.println("In registerStudent");
		DisciplinaRegistrationReply discregreply = new DisciplinaRegistrationReply();           
		DisciplinaRegistration.getInstance().add(disciplina);
		
		discregreply.setNome(disciplina.getNome());
		discregreply.setCodigo(disciplina.getCodigo());
		discregreply.setHorario(disciplina.getHorario());
        discregreply.setTurma(disciplina.getTurma());
		discregreply.setRegistrationStatus("Successful");
        
		return discregreply;

	}
}
