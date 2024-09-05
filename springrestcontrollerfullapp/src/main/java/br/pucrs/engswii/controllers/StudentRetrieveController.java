//
//  Comentário no pod
//

package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.DisciplineRegistration;
import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;

@RestController
public class StudentRetrieveController {
	@RestController
	@RequestMapping("/student")
	public class StudentRegistrationController {
		@GetMapping("/allstudent")
		public List<Student> getAllStudents() {
			return StudentRegistration.getInstance().getStudentRecords();
		}
		@GetMapping("/matricula/{matricula}")
		public Student getStudentByMatricula(@PathVariable("matricula") int matricula) {
			return StudentRegistration.getInstance().getStudentByMatricula(matricula);
		}
		@GetMapping("/nameFrag/{nameFrag}")
		public List<Student> getStudentByName(@PathVariable("nameFrag") String name) {
			return StudentRegistration.getInstance().getStudentsByNameFragment(name);
		}
		@GetMapping("/studentsInClass/{codDisciplina}/{classCode}")
		public List<Student> getStudentsInClass(@PathVariable("codDisciplina") int codDisciplina, @PathVariable("classCode") int classCode) {
			return DisciplineRegistration.getInstance().getStudentsByClass(codDisciplina, classCode);
		}
				
	}
}
