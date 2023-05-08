/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.LinkedList;
import java.util.List;



/**
 *
 * @author minor
 */
public class Persistencia {
    
    
   private List<Estudiante> estudiantes;

    public Persistencia() {
        estudiantes = new LinkedList<Estudiante>();
    }

    public Persistencia(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes.add(estudiantes);
    }
   
   

   
}
