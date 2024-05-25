package escuela;

import java.util.Scanner;

public class Escuela {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //  System.out.println("Dime el nombre del alumno");
        //String nombre = leer.next(); 
        //int edad=leer.nextInt();leer.nextLine();
       
        Alumno alumno1 = new Alumno("juan", "Perez", 30, 8);
        System.out.println("el nombre el alumno 2 es :" + alumno1.getNombre());
        System.out.println(alumno1);
        
        

        




    }

}
