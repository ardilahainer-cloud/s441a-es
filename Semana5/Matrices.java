package Semana5;

public class Matrices {
    public static void main(String[] args) {
        

        int [][] m1= {{9, 4, 1}, {2,8,7}, {3,5,6}};







        //int[][] m2 = new int[3][3];
        //m2[0][0] = 9;
        //m2[0][1] = 4;
        //m2[0][2] = 1;
        //m2[1][0] = 2;
        //m2[1][1] = 8;
        //m2[1][2] = 7;
        //m2[2][0] = 3;
        //m2[2][1] = 5;
        //m2[2][2] = 6;

       
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                System.out.println ("m1[" + i + "][" + j + "] = " + m1[i][j] + " ");

            }
        }

         String cad ="";
         for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[0].length; j++){
                cad += m1[i][j] + " ";
            }
                cad += "\n";
        }
        System.out.println(cad);

        OperacionesMatrices op = new OperacionesMatrices();
         int [][] m = op.llenarMatriz(5, 5, 1, 9);
        System.out.println(op.mostrarMatriz(m));
        int [][] m3 = op.mayorMenor(m1, m);
        System.out.println(op.mostrarMatriz(m3));
    }
    
}
