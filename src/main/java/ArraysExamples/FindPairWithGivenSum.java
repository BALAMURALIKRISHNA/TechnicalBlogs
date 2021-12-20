package ArraysExamples;

import java.util.HashMap;
import java.util.Map;

public class FindPairWithGivenSum {

//    Input: nums = [8, 7, 2, 5, 3, 1]
//    target = 10
//    Output :-
    public static void main(String[] args) {


        Map<Integer,Integer> resultMap = new HashMap<Integer,Integer>();

        int[] inputArray = {8, 7, 2, 5, 3, 1};
        int target = 10;
        FindPairWithGivenSum gs = new FindPairWithGivenSum();
        gs.getFindPairWithGivenSum(
                resultMap,inputArray,target
        );
    }

    public Map<Integer,Integer> getFindPairWithGivenSum(  Map<Integer,Integer> resultMap ,int[] inputArray, int target){

        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();

        int i =0 ;
        while(i<inputArray.length){

           if(hm.containsKey(target - inputArray[i] )){
               resultMap.put(inputArray[i],target - inputArray[i]);
           }else{
               hm.put(inputArray[i],1);
           }

            i++;
        }

        System.out.println("hm:-" + resultMap);
        System.out.println("Result :-"+resultMap);
        return resultMap;
    }
}
