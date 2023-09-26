package com.cursos.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cursos.demo.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {

    List<Curso> cursos;

    public CursosServiceImpl() {
        cursos = new ArrayList<>();
        cursos.add(new Curso(1, "hola", 2, 3));
        cursos.add(new Curso(4, "adios", 5, 6));
        cursos.add(new Curso(7, "hasta luego", 8, 9));
        cursos.add(new Curso(10, "clases de judo", 11, 12));

    }

    @Override
    public void altaCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public void actualizarCurso(int codigoCurso, int duracionCurso) {
        for (Curso curso : cursos) {
            if (curso.getCodigoCurso() == codigoCurso) {
                curso.setDuracionCurso(duracionCurso);
            }
        }
    }

    @Override
    public List<Curso> eliminarCurso(int codigoCurso) {
        for (Curso curso : cursos) {
            if (curso.getCodigoCurso() == codigoCurso) {
                cursos.remove(curso);
            }
        }
        return cursos;
    }

    @Override
    public Curso buscarCurso(int codigoCurso) {

        for (Curso curso : cursos) {
            if (curso.getCodigoCurso() == codigoCurso) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public List<Curso> cursos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cursos'");
    }
}
