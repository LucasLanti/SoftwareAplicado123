package br.pucrs.engswii.beans;

import java.util.ArrayList;

public class Discipline {
    int disciplineCod;
    String disciplineName;
    String disciplineHour;
    int disciplineClass;
    ArrayList<Student> students;

    public Discipline(){
        students = new ArrayList<>();
    }

    public int getDisciplineCod() {
        return disciplineCod;
    }
    public void setDisciplineCod(int disciplineCod) {
        this.disciplineCod = disciplineCod;
    }
    public String getDisciplineName() {
        return disciplineName;
    }
    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }
    public String getDisciplineHour() {
        return disciplineHour;
    }
    public void setDisciplineHour(String disciplineHour) {
        this.disciplineHour = disciplineHour;
    }
    public int getDisciplineClass() {
        return disciplineClass;
    }
    public void setDisciplineClass(int disciplineClass) {
        this.disciplineClass = disciplineClass;
    }

    public ArrayList<Student> getStudents(){
        ArrayList<Student> studentsClone = (ArrayList<Student>) students.clone();
       return studentsClone;
    }

    public void adicionarEstudante(Student s){
        students.add(s);
    }





}
