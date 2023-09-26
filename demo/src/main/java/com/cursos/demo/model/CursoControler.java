package com.cursos.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.demo.service.CursosService;

@RestController
public class CursoControler {

 @Autowired
    CursosService service;

    /**
     * http://localhost:8880/cursos muestra la lista de cursos 
     **/ 
    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> curso() {
        return service.cursos();
    }
 /**
     * http://localhost:8880/curso/"numero" muestra la informacion de un curso concreto
     **/
    @GetMapping(value = "curso/{codigoCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable("codigoCurso") int codigoCurso) {
        return service.buscarCurso(codigoCurso);
    }
 /**
     * http://localhost:8880/agregarCurso agrega un nuevo curso mediante un json 
     **/
    @PostMapping(value = "agregarCurso", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregar(@RequestBody Curso curso) {

        service.altaCurso(curso);
    }
 /**
     * http://localhost:8880/modificarCurso/int/int modifica la duracion del curso introducido 
     **/
    @PutMapping(value = "modificarCurso/{codigoCurso}/{duracionCurso}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@PathVariable("codigoCurso") int codigo,@PathVariable("duracionCurso") int duracion) {
        service.actualizarCurso(codigo, duracion);
    }
 /**
     * http://localhost:8880/eliminarCurso/int elimina el curso introducido
     **/
    @DeleteMapping(value = "eliminarCurso/{codigoCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminar(@PathVariable("curso") int codigoCurso) {
        return service.eliminarCurso(codigoCurso);
    }
}
