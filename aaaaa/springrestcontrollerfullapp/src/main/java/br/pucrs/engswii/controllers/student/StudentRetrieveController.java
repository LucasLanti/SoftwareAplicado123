//
//  Comentário no pod
//

package br.pucrs.engswii.controllers.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.student.Student;
import br.pucrs.engswii.beans.student.StudentRegistration;

@RestController
@RequestMapping("/student")
public class StudentRetrieveController {
	
	@GetMapping("/allstudent")
	public List<Student> getAllStudents() {
		return StudentRegistration.getInstance().getStudentRecords();
	}

	@GetMapping("/matricula/{matricula}")
	public Student getStudantsByDocument(@PathVariable String matricula) {
		return StudentRegistration.getInstance().getStudentsByDocument(matricula);
	}

	@GetMapping("/parsename/{parseName}")
	public List<Student> getStudantParseName(@PathVariable String parseName) {
		return StudentRegistration.getInstance().getStudentParseName(parseName);
	}
}
