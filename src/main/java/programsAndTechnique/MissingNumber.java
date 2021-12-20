package programsAndTechnique;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

     int arr[] = {1,2,3,4,6,7,8,9};

     // Using Maths
      int wholeNumberSum =0;
      int sum =0;
      int n = arr[arr.length-1];

        wholeNumberSum = (n*(n+1)/2);
        for (int i = 0; i < arr.length; i++) {
           sum =sum+arr[i] ;
        }

        System.out.println(wholeNumberSum);
        System.out.println(sum);
        System.out.println(wholeNumberSum-sum);
    }

}
