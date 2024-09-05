package br.pucrs.engswii.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;

@RestController
public class StudentRegistrationController {
	@PostMapping("/register/student")
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In registerStudent");
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		int matricula = StudentRegistration.getInstance().generateMatricula();
		student.setMatricula(matricula);       
		StudentRegistration.getInstance().add(student);
		stdregreply.setName(student.getName());
		stdregreply.setAge(student.getAge());
		stdregreply.setRegistrationNumber(student.getRegistrationNumber());
		stdregreply.setMatricula(student.getMatricula());
		stdregreply.setRegistrationStatus("Successful");

		return stdregreply;
	}

}
