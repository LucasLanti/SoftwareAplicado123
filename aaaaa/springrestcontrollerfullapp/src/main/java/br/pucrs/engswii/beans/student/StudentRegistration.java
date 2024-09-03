package br.pucrs.engswii.beans.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

public class StudentRegistration {

	private List<Student> studentRecords;
	private static StudentRegistration stdregd = null;

	private StudentRegistration(){
		studentRecords = new ArrayList<Student>();
	}

	public static StudentRegistration getInstance() {

		if(stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}

	public void add(Student std) {
		studentRecords.add(std);
	}

	public String upDateStudent(Student std) {

		for(int i=0; i<studentRecords.size(); i++)
		{
			Student stdn = studentRecords.get(i);
			if(stdn.getDocument().equals(std.getDocument())) {
				studentRecords.set(i, std);//update the new record
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

	public String deleteStudent(String document) {

		for(int i=0; i<studentRecords.size(); i++)
		{
			Student stdn = studentRecords.get(i);
			if(stdn.getDocument().equals(document)){
				studentRecords.remove(i);//update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}

	public List<Student> getStudentRecords() {
		return studentRecords;
	}

	public Student getStudentsByDocument(String matricula) {
		for (Student student : studentRecords) {
			if (student.getDocument().equals(matricula)) {
				return student;
			}
		}
		return null;
	}

	public List<Student> getStudentParseName(String parseName){
		List<Student> listAux = new ArrayList<Student>();
		for (Student student : studentRecords) {
			if (student.getName().toLowerCase().contains(parseName.toLowerCase())) {
				listAux.add(student);
			}
		}
		return listAux;
	}

}