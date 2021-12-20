package programsAndTechnique;

import java.util.Arrays;

public class Largest3ElementInAnArray {
    public static void main(String[] args) {

        int arr[] = {3, 8, 7, 17, 19, 25};
        Arrays.sort(arr);  // Study QuickSort and Implement it here\
        for(int i= arr.length-1 ; i>=arr.length-3;i--){
            System.out.println(arr[i]);
        }

    }

}
