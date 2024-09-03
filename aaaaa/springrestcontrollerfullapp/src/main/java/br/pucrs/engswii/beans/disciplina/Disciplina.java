package br.pucrs.engswii.beans.disciplina;

public class Disciplina {
    private String nome;
    private int codigo;
    private String horario;
    private int turma;


    public Disciplina(){

    }

    public String getNome(){
        return nome;
    }  

    public void setNome(String nome){
        this.nome = nome;        
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getHorario(){
        return horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public int getTurma(){
        return turma;
    }

    public void setTurma(int turma){
        this.turma = turma;
    }

}