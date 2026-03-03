package Semana5;

import java.util.Random;

public class OperacionesMatrices {

    public int[][] llenarMatriz(int filas, int columnas, int min, int max){
        int [][] m = new int [filas][columnas];
        Random r = new Random();
  
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < m[0].length; j++){
               m[i][j] = r.nextInt(max - min + 1) + min;

                
            }
        }
        return m;  
    }
    public String mostrarMatriz(int [][] m){
        String cad = "";
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                cad += m[i][j] + " ";
            }
            cad += "\n";
        }
        return cad;
    }
}
