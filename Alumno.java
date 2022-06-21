/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author lui59
 */
public class Alumno {
    String nombre,apellido;
    int numcuenta,clave;
    public Alumno(String nombre, String apellido, int numcuenta,int clave){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numcuenta=numcuenta;
        this.clave=clave;
    }
   public void get(){
       System.out.println("Alumno: "+this.nombre+" "+this.apellido+" Clave: "+this.clave+" Num. cuenta: "+this.numcuenta);
   }
}
