package ArraysExamples;

//Find the smallest missing positive number from an unsorted array
//        Given an unsorted integer array, find the smallest missing positive integer in it.
//
//        For example,
//
//        Input:  {1, 4, 2, -1, 6, 5}
//        Output: 3
//
//        Input:  {1, 2, 3, 4}
//        Output: 5

public class MissingSmallestNumber {

    public static void main(String[] args) {

        int[] input1 = {1, 4, 2, -1, 6, 5};
        int[] input2 = {1, 2, 3, 4};
        MissingSmallestNumber ms = new MissingSmallestNumber();
        System.out.println(ms.findSmallestMissingNum(input1));
        System.out.println(ms.findSmallestMissingNum(input2));

    }

    public int findSmallestMissingNum(int[] input){

        int largest=0;
        int sum =0;
        for(int i = 0;i<input.length;i++){
            if(input[i]>0){
              sum =sum+  input[i];
            }
            if(input[i]>largest){
                largest =  input[i];
            }
        }
        System.out.println("Sum="+sum);
        System.out.println("largest="+largest);
        int sumFromEquation =0;
        if(largest>0) {
            sumFromEquation = (largest * (largest+1))/2;
        }

        return (sumFromEquation-sum);
    }


}
