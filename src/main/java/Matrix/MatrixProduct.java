package Matrix;

public class MatrixProduct {

    public static void main(String[] args) {
        MatrixSum ms = new MatrixSum();
        int[][] matrixA = new int[4][4];
        int[][] matrixB = new int[4][4];
        for (int i = 0; i <matrixA.length ; i++) {
            for (int j = 0; j <matrixA.length ; j++){
                matrixA[i][j] = MatrixSum.rd.nextInt(13);
                matrixB[i][j] = MatrixSum.rd.nextInt(13);
            }

        }
        System.out.println("=======matrixA=========");
        ms.printMatrix(matrixA);
        System.out.println("=======matrixB=========");
        ms.printMatrix(matrixB);

        MatrixProduct mp = new MatrixProduct();
        mp.productMatrix(matrixA,matrixB,ms);
    }

    public void productMatrix(int[][] matrixA, int[][] matrixB,MatrixSum ms){

        int[][] product = new int[matrixA.length][matrixB.length];
    //    if(matrixA[0].length == matrixB.length) {

            int from1st = 0;
            int sum = 0;
            int from2nd = 0;

            for (int i = 0; i < matrixA.length; i++) {

                for (int j=0; j < matrixA.length; j++) {
                    product[i][j] =0 ;
                    for (int k=0; k<=j ; k++) {
                        product[i][j] = product[i][j]+(matrixA[i][k]*matrixB[k][j]);
                    }

                }


            }

    //    }

        System.out.println("=======matrixProduct=========");
        ms.printMatrix(product);


    }
}
