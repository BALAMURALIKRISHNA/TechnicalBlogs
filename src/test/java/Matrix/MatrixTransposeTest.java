package Matrix;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MatrixTransposeTest {

    @Test
    public void testMatrixTranspose(){
        MatrixTranspose mt = new MatrixTranspose();
        MatrixSum ms = new MatrixSum() ;
        int[][] A = {
                {1,2,3}, {4,5,6}, {7,8,9}
        };
        System.out.println("Expected");

        int[][] result  = {{1,4,7},{2,5,8},{3,6,9}};
        ms.printMatrix(result);

        Assert.assertTrue(Arrays.deepEquals(result,mt.getTranspose(A,ms)));

    }
}
