
package vectores;

import java.util.Scanner;
public class Vectores {

    
    public static void main(String[] args) {
      Scanner teclado=new Scanner (System.in);
        
        int arreglosNum[][]= new int[3][3];
      
      for (int i=0;i<3;i++){
          for (int j=0;j<3;j++){
          System.out.println("Ingresa el valor en la posicion "+(i+1)+"seccion" + (j+1));
          arreglosNum[i][j]=teclado.nextInt();
      }
      
    }
      for (int i=0;i<3;i++){
         for (int j=0;j<3;j++){
             System.out.println("El valor de la posicion " + (i+1)+(j+1) + "es " + arreglosNum[i][j]);
         }
    }
 } 
}

