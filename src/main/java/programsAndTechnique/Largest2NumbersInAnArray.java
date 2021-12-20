package programsAndTechnique;

public class Largest2NumbersInAnArray {

    public static void main (String[] args){
        int arr[] = new int[] {
                3,2,1,18,21,0,17};

        int firstLargest = 0;
        int secondLargest =0;

        if(arr[0]>arr[1]) {
            firstLargest = arr[0];
            secondLargest = arr[1];
        }else{
            firstLargest = arr[1];
            secondLargest = arr[0];
        }

        for (int i=2;i<arr.length;i++){

            if(arr[i]>secondLargest) {

                if(arr[i]>firstLargest) {
                    secondLargest =firstLargest;
                    firstLargest = arr[i];

                }
            }
        }

        System.out.println("firstLargest="+firstLargest +"|"+"secondLargest="+secondLargest);
    }
}
