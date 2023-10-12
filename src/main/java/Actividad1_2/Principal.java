package Actividad1_2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.ArrayList;

/**
 *
 * @author diegoip
 */
public class Principal {
        public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();     
   public static void main(String[] args) { 
     
        FormularioAlumno formulario = new FormularioAlumno();
        formulario.setVisible(true);
    }
    public static void agregarAlumno(Alumno alumnos) {
        listaAlumnos.add(alumnos);
        
    }
    Alumno alumnos = new Alumno();
    }
    