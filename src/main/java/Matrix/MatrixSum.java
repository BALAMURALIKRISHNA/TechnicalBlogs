package Matrix;

import java.util.Random;

public class MatrixSum {

    static int[][] matrixA = new int[4][4];
    static int[][] matrixB = new int[4][4];
    static Random rd = new Random();

    public static void main(String[] args) {

        for(int i = 0 ; i <matrixA.length; i++){
            for(int j=0;j<matrixA.length;j++) {
                matrixA[i][j]= rd.nextInt(15);
                matrixB[i][j]= rd.nextInt(15);
            }
        }

        MatrixSum ms = new MatrixSum();
        System.out.println("============matrixA =========== ");
        ms.printMatrix(matrixA);
        System.out.println("============matrixB =========== ");
        ms.printMatrix(matrixB);

        ms.addMatrix(matrixA,matrixB);

    }


    public void printMatrix(int[][] matrixA){

        for(int i = 0 ; i <matrixA.length; i++){
            for(int j=0;j<matrixA.length;j++) {

               System.out.print( matrixA[i][j] + " ");


            }
            System.out.println();
        }

    }

    public void addMatrix(int[][] matrixA,int[][] matrixB){

        System.out.println(matrixA.length);
        System.out.println(matrixB.length);

        int[][] matrixSum = new int [matrixA.length][matrixA[0].length];
        if(matrixA.length==matrixB.length){
            for(int i = 0 ; i <matrixA.length; i++){
                for(int j=0;j<matrixA.length;j++) {
                    matrixSum[i][j] = matrixA[i][j]+matrixB[i][j];
                }
                System.out.println();
            }
        }else
        {
            System.out.println("Sum is not possible");
        }

        System.out.println("==========matrixSum============");
        printMatrix(matrixSum);

    }
}
