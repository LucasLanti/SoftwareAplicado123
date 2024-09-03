package br.pucrs.engswii.beans.disciplina;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

public class DisciplinaRegistration {

	private List<Disciplina> disciplinasRecords;
	private static DisciplinaRegistration stdregd = null;

	private DisciplinaRegistration(){
		disciplinasRecords = new ArrayList<Disciplina>();
	}

	public static DisciplinaRegistration getInstance() {

		if(stdregd == null) {
			stdregd = new DisciplinaRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}

	public void add(Disciplina dscp) {
		disciplinasRecords.add(dscp);
	}

	public String upDateDisciplina(Disciplina dscp) {

		for(int i=0; i<disciplinasRecords.size(); i++)
		{
			Disciplina dscpl = disciplinasRecords.get(i);
			if(dscpl.getCodigo() == dscp.getCodigo()) {
				disciplinasRecords.set(i, dscp);//update the new record
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

	public String deleteDisciplin(int codigo) {

		for(int i=0; i<disciplinasRecords.size(); i++)
		{
			Disciplina dscpl = disciplinasRecords.get(i);
			if(dscpl.getCodigo() == codigo){
				disciplinasRecords.remove(i);//update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}

	public List<Disciplina> getDisciplinaRecords() {
		return disciplinasRecords;
	}

	public Disciplina getStudentsByCode(int codigo) {
		for (Disciplina disciplina : disciplinasRecords) {
			if (disciplina.getCodigo() == codigo) {
				return disciplina;
			}
		}
		return null;
	}

	public List<Disciplina> getDisciplinaParseName(String parseName){
		List<Disciplina> listAux = new ArrayList<Disciplina>();
		for (Disciplina disciplina : disciplinasRecords) {
			if (disciplina.getNome().toLowerCase().contains(parseName.toLowerCase())) {
				listAux.add(disciplina);
			}
		}
		return listAux;
	}

}