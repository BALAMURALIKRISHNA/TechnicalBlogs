package Matrix;

public class MatrixTranspose {

    public static void main(String[] args) {
        MatrixSum ms = new MatrixSum();
        int[][] matrixA = new int[4][4];
        System.out.println(matrixA.length);
        System.out.println(matrixA[1].length);
        for (int i = 0; i <matrixA.length ; i++) {
            for (int j = 0; j <matrixA[0].length ; j++){
                matrixA[i][j] = MatrixSum.rd.nextInt(13);
            }

        }
        System.out.println("=======matrixA=========");
        ms.printMatrix(matrixA);
        MatrixTranspose mt = new MatrixTranspose();
        mt.getTranspose(matrixA,ms);

    }

    /*
    | 2 3 4  |          2 1  5
    | 1 2 5  |   ===>   3 2  7
    | 5 7 9  |          4 5  9

    */
    public  int[][] getTranspose(int[][] matrixA,MatrixSum ms){
        int col= matrixA.length;
        int row= matrixA[0].length;
        int[][] matrixC = new int[row][col];

        for(int i =0 ;i<matrixA.length;i++){
            for(int j =0 ;j<matrixA[0].length;j++){

                matrixC[j][i] =  matrixA[i][j];
            }
        }

        System.out.println("=======matrixTranspose=========");
        ms.printMatrix(matrixC);
        return matrixC;
    }
}
