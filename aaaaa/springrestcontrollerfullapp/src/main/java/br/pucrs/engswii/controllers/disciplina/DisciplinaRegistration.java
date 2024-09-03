package br.pucrs.engswii.controllers.disciplina;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;
import br.pucrs.engswii.beans.student.Student;
import br.pucrs.engswii.beans.student.StudentRegistration;
import br.pucrs.engswii.beans.student.StudentRegistrationReply;

@RestController
public class DisciplinaRegistrationController {
	@PostMapping("/register/disciplina")
	public StudentRegistrationReply registerDisciplina(@RequestBody Disciplina disciplina) {

		System.out.println("In registerStudent");
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();           
		StudentRegistration.getInstance().add(student);
		
		stdregreply.setName(student.getName());
		stdregreply.setAge(student.getAge());
		stdregreply.setDocument(student.getDocument());
		stdregreply.setRegistrationStatus("Successful");

		return stdregreply;

	}

}
