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
public class Ejemplo045 {

    public static void main(String[] args) {
        // 

        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = matriz3(arreglo1, arreglo2);
        double[][] arreglo4 = matriz4(arreglo1, arreglo2);

        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
        obtenerReporteDos(arreglo4);
    }

    public static int[][] matriz3(int[][] a, int[][] b) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                matriz[i][j] = obtenerMultiplicacion(a[i][j],
                        b[i][j]);
            }
        }

        return matriz;
    }

    public static double[][] matriz4(int[][] a, int[][] b) {
        double[][] matriz = new double[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                matriz[i][j] = obtenerPot(a[i][j],
                        b[i][j]);
            }
        }

        return matriz;
    }

    public static void obtenerReporte(int[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
    public static void obtenerReporteDos(double[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%s\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

    public static double obtenerPot(int a, int b) {
        double operacion; 
        operacion = Math.pow(a, b);
        return operacion;
    }

}
