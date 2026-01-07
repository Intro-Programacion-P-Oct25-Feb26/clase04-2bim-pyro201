/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        //
        int[] valores1={10,100,1000,20,200,2000};
        int[] valores2={1000,1001,1002,1003,1004,1005};
        for (int f =0; f < valores1.length;f++){
            int v1= valores1[f];
            int v2= valores2[f];
             obtenerSuma(v1,v2);
        }
        /* este codigo toma los valores correspondientes en cada arreglo y
        se los envia a el procedimiento obtenerSuma el cual los suma y presenta
        el resultado en la pantalla
        */
    }
        
    public static void obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
        
    }
    
    
}
