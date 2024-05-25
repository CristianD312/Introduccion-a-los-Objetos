
package vectores;

import java.util.Scanner;
public class matrices {
    public static void maid (String[] args){
      Scanner teclado = new Scanner(System.in);
        int arreglosNum[][] = new int [3][3];
      
      for (int i=0;i<3;i++){
          for (int j=0;j<3;j++){
          System.out.println("Ingresa el valor en la posicion "+i+"seccion" + j);
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
