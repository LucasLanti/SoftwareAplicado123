package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.List;

public class DisciplineRegistration {
    private List<Discipline> disciplinesRecords;

	private static DisciplineRegistration disregd = null;
	private DisciplineRegistration(){
		disciplinesRecords = new ArrayList<Discipline>();
	}

	public static DisciplineRegistration getInstance() {
		if(disregd == null) {
			disregd = new DisciplineRegistration();
			return disregd;
		}
		else {
			return disregd;
		}
	}

	public void add(Discipline dis) {
		disciplinesRecords.add(dis);
	}

    public boolean getDuplicatedDiscipline(Discipline dis) {
        for(int i=0; i<disciplinesRecords.size(); i++)
        {
            Discipline disn = disciplinesRecords.get(i);
            if((disn.getDisciplineCod() == dis.getDisciplineCod() || disn.getDisciplineName().equals(dis.getDisciplineName())) && (disn.getDisciplineClass() == dis.getDisciplineClass())) {
                return true;
            }
        }
        return false;
    }

	public Discipline matricularAluno(int codDisciplina, int matricula, int turma){
		for (Discipline disciplina : disciplinesRecords){
			if (disciplina.getDisciplineCod() == codDisciplina && disciplina.getDisciplineClass() == turma){
				for (Student student: disciplina.getStudents()){
					if (student.getMatricula() == matricula){
						return null;
					}
				}
				Student student = StudentRegistration.getInstance().getStudentByMatricula(matricula);
				disciplina.adicionarEstudante(student);
				return disciplina;
			}
		}
		return null;
	}

	public List<Discipline> getDisciplinesByMatricula(int matricula) {
		List<Discipline> list = new ArrayList<Discipline>();
		for (Discipline disciplina : disciplinesRecords){
			for (Student student: disciplina.getStudents()){
				if (student.getMatricula() == matricula){
					list.add(disciplina);
				}
			}
		}
		return list;
	}

	public List<Student> getStudentsByClass(int codDisciplina, int turma) {
		for (Discipline disciplina : disciplinesRecords){
			if (disciplina.getDisciplineCod() == codDisciplina && disciplina.getDisciplineClass() == turma){
				return disciplina.getStudents();
			}
		}
		return null;
	}
}
