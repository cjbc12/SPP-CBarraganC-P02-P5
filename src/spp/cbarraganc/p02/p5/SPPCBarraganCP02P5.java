/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.p02.p5;
import java.util.Scanner;
/**
 *
 * @author
 * José Eduardo De Llano Barragán   A01410712   IC
 * Alberto Barnetche Suarez         A01411570   ISS
 * Carlos Barragán Carrión          A01410357   IMT
 * Carlos Miguel De León García     A01410399   IMA
 * 
 */
public class SPPCBarraganCP02P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño=Int("el tamaño de los arreglos: ");
        // Definir los valores dentro de la matriz
        int [][] a=crearMatriz("A",tamaño); //arreglo
        sumaMat(a); // método
     
    }
     public static int Int(String mensaje){
        Scanner teclado = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = teclado.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            teclado.nextLine();
    } 
  } while (flag); 
    return varEntera;
     }

public static int [][]crearMatriz(String mensaje, int tamaño){
     System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);
        int[][]Matrix=new int[tamaño][tamaño];
        int valor;
        System.out.println("El tamaño de la matriz es "+Matrix.length);
        for (int i=0; i<Matrix.length; i++){
            for (int j=0; j<Matrix[i].length; j++){
            Matrix[i][j]=Int("el valor ("+i+","+j+"): ");
            }
        }
        return Matrix;
        }


public static void sumaMat(int [][] a){
    int sumF;
         int[][]r=new int[a.length][a.length];
    for (int i = 0; i < a.length; i++) {  
        sumF=0;  
        for (int j = 0; j < a[i].length; j++) {  
          sumF=sumF+a[i][j];  
        }  
        System.out.println("La suma de los valores de la fila "+(i+1)+" es: "+sumF);  
      }  
      System.out.println(""); 
    
    }
    
}
