//
//  Comentário no pod
//

package br.pucrs.engswii.controllers.disciplina;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.disciplina.Disciplina;
import br.pucrs.engswii.beans.disciplina.DisciplinaRegistration;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaRetrieveController {
	
	//@GetMapping("/disciplinByStudent")
	//public List<Disciplina> getDisciplinasByStudent() {
		//return DisciplinaRegistration.getInstance().getDisciplinaRecords();
	//}

    //@GetMapping("/studentByDisciplin")
	//public List<Disciplina> getStudentsByDisciplina() {
		//return DisciplinaRegistration.getInstance().getStudentRecords();
	//}
}