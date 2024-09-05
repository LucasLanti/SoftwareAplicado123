package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentRegistration {

	private List<Student> studentRecords;

	private static StudentRegistration stdregd = null;
	private static Random random = new Random();
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
			if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				studentRecords.set(i, std);//update the new record
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

	public String deleteStudent(String registrationNumber) {

		for(int i=0; i<studentRecords.size(); i++)
		{
			Student stdn = studentRecords.get(i);
			if(stdn.getRegistrationNumber().equals(registrationNumber)){
				studentRecords.remove(i);//update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}

	public List<Student> getStudentRecords() {
		return studentRecords;
	}

	public int generateMatricula() {
		int matriculaAux = random.nextInt(999999);
		for(int i=0; i<studentRecords.size(); i++)
		{
			if(studentRecords.get(i).getMatricula() == matriculaAux) {
				matriculaAux = random.nextInt(999999);
				i = 0;
			};
		}
		return matriculaAux;
	}
	public Student getStudentByMatricula(int matricula) {
		for(int i=0; i<studentRecords.size(); i++)
		{
			Student stdn = studentRecords.get(i);
			if(stdn.getMatricula() == matricula) {
				return stdn;
			}
		}
		return null;
	}
	public List<Student> getStudentsByNameFragment(String nameFragment) {
        List<Student> matchingStudents = new ArrayList<>();
        for (Student student : studentRecords) {
            if (student.getName().toLowerCase().contains(nameFragment.toLowerCase())) {
                matchingStudents.add(student);
            }
        }
        return matchingStudents;
    }
}