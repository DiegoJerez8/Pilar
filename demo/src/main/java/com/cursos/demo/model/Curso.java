package com.cursos.demo.model;

public class Curso {

    /**
     * variables
     * */
    int codigoCurso;
    String nombreCurso;
    int duracionCurso;
    int precioCurso;
    
     /**
     * setters y getters
     * */
    public int getCodigoCurso() {
        return codigoCurso;
    }
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public int getDuracionCurso() {
        return duracionCurso;
    }
    public void setDuracionCurso(int duracionCurso) {
        this.duracionCurso = duracionCurso;
    }
    public int getPrecioCurso() {
        return precioCurso;
    }
    public void setPrecioCurso(int precioCurso) {
        this.precioCurso = precioCurso;
    }
    /**
     * constructor vacio y consstructor con todas las variables
     * */
    public Curso() {
    }
    public Curso(int codigoCurso, String nombreCurso, int duracionCurso, int precioCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.duracionCurso = duracionCurso;
        this.precioCurso = precioCurso;
    }

   
}
