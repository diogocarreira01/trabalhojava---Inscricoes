/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.para.sexta;

/**
 *
 * @author me
 */
class cursos {
private int idCurso;
    private String nome;
    private int horas;

    public cursos(int idCurso, String nome, int horas) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.horas = horas;
    }

    public cursos() {
this.idCurso = idCurso;
        this.nome = nome;
        this.horas = horas;   
    }


    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "cursos{" + "idCurso=" + idCurso + ", nome=" + nome + ", horas=" + horas + '}';
    }

    
    
}
