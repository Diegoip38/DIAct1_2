/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1_2;

/**
 *
 * @author diegoip
 */
public class Alumno {
  private String  nombre;
  private String apellidos;
  private String email;
  private String telefono;
  private int edad; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeléfono() {
        return telefono;
    }

    public void setTeléfono(String teléfono) {
        this.telefono = teléfono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellidos, String email, String telefono, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
    } 
   
    
    public void Mayor_edad(){
        if(this.getEdad()<18)
            System.out.println("menor");
        else
            System.out.println("mayor");
            
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono + ", edad=" + edad + '}';
    }
    
    
    
    
}
