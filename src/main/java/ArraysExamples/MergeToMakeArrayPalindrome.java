package ArraysExamples;


/*
Find the minimum number of merge operations to make an array palindrome
Given a list of non-negative integers, find the minimum number of merge operations to make it a palindrome. A merge operation can only be performed on two adjacent elements. The result of a merge operation is that the two adjacent elements are replaced with their sum.

For example,

Input:  [6, 1, 3, 7]

Output: 1

Explanation: [6, 1, 3, 7] —> Merge 6 and 1 —> [7, 3, 7]
 */
public class MergeToMakeArrayPalindrome {

    public  static void main(String[] args){

        int[] input1 = {6, 1, 3, 7};
        int[] input2 = {6, 1, 4, 3, 1, 7};
        int[] input3 = {1, 3, 3, 1};

        MergeToMakeArrayPalindrome ms = new MergeToMakeArrayPalindrome();
        System.out.println("input1 = "+ms.getMinimumNumberOfMergeOperations(input1));
        System.out.println("input2 = "+ms.getMinimumNumberOfMergeOperations(input2));
        System.out.println("input3 = "+ms.getMinimumNumberOfMergeOperations(input3));



    }

    public int getMinimumNumberOfMergeOperations(int[] input){

        int i = 0;
        int j = input.length-1;
        int output = 0;

        while(i<j){
            if(input[i] < input[j]){
                int temp = input[i];
                temp = input[i+1] + temp;
                i= i+1;
                if(temp==input[j]){
                    output++;
                }else{
                    break;
                }
            }else if(input[i] > input[j]){
                int temp = input[j];
                temp = input[j-1] + temp;
                j = j-1;
                if(temp==input[i]){
                    output++;
                }else{
                    break;
                }

            }

            i=i+1;
            j=j-1;
        }
        return output;
    }
}
