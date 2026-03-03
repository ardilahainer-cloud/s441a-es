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

    public int[][] mayorMenor(int [][] m1, int [][] m2){
        int [][] m3 = new int [m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                if (m1[i][j] > m2[i][j]){
                    m3[i][j] = m1[i][j];
                } else {
                    m3[i][j] = m2[i][j];
                }
            }
        }
        return m3;
    }



}
