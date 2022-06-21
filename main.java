
package ej4;

import java.util.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Miexcepcion {
        int op=0;
        String nombre,apellido,numcuenta,clave;
        Scanner scanner=new Scanner(System.in);
        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        do{
            System.out.println("Practica 10-Ej4");
            System.out.println("1) Ingresa alumno");
            System.out.println("2) Lista alumnos");
            System.out.println("3) Salir");
            System.out.println("Ingresa opcion: ");
            try{
             op=scanner.nextInt();
             }catch(java.util.InputMismatchException e){
            System.out.println("Lo sentimos, no se aceptan letras");
            }
            scanner.nextLine();
            switch(op){
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    nombre=scanner.nextLine();
                    nombree(nombre);
                    
                    System.out.println("Ingresa el apellido: ");
                    apellido=scanner.nextLine();
                    apelle(apellido);
                    
                    System.out.println("Ingresa el numero de cuenta: ");
                    numcuenta=scanner.nextLine();
                    nume(numcuenta);
                    
                    System.out.println("Ingresa la clave de la materia: ");
                    clave=scanner.nextLine();
                    clavee(clave);
                    alumnos.add(new Alumno(nombre,apellido,Integer.parseInt(numcuenta),Integer.parseInt(clave)));
                    break;
                case 2:
                    vacio(alumnos);
                    for(Alumno alumno:alumnos){
                        alumno.get();
                    }
                    break;
                    
            }
        }while(op!=3);
        
    }
    
    public static void nume (String nc) throws Miexcepcion {
        if(nc.length()!=9){
            throw new Miexcepcion("Numero de cuenta no valido");
        }
    }
    public static void clavee(String cl) throws Miexcepcion {
        if(cl.length()!=4){
            throw new Miexcepcion("Clave incorrecta");
        }
    }
    public static void nombree(String nom)throws Miexcepcion {
        if(nom.length()<4){
            throw new Miexcepcion("Solo se aceptan nombre de mas de 4 letras");
        }
    }
        public static void apelle(String apell)throws Miexcepcion {
        if(apell.length()<4){
            throw new Miexcepcion("Solo se aceptan apellidos de mas de 4 letras");
        }
    }
        public static void vacio(ArrayList<Alumno> alumnos) throws Miexcepcion{
            if(alumnos.isEmpty())
                throw new Miexcepcion("Esta vacia la lista");
            
        }
}
