package com.cursos.demo.service;

import java.util.List;

import com.cursos.demo.model.Curso;

public interface CursosService {
    /**
     * Metodos implementados
     */
        List<Curso>cursos();
    Curso buscarCurso(int codigoCurso);
    void altaCurso (Curso curso);
    void actualizarCurso (int codigoCurso, int duracionCurso);
    List<Curso>eliminarCurso(int codigoCurso);
}
