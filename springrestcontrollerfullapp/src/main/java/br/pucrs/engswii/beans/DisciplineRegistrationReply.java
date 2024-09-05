package br.pucrs.engswii.beans;

public class DisciplineRegistrationReply {
    int disciplineCod;
    String disciplineName;
    String disciplineHour;
    int disciplineClass;
    String registrationStatus;

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
    public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
}
