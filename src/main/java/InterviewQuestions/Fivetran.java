package InterviewQuestions;

import MapExamples.ProgramCreekExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fivetran {
    public static void main(String[] args) {

        ProgramCreekExample pc = new ProgramCreekExample();
        List<Integer> number = Arrays.asList(5, 4, 5, 3, 2);
        List<Integer> x = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = pc.frequencyOfMaxValue(number, x);

        System.out.println(result);
    }

    public static List<Integer> frequencyOfMaxValue(List<Integer> number, List<Integer> x) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0 ; i<=x.size()-1 ; i++) {
            //get the query element
            int query = x.get(i);
            // execute the query
            if(query>number.size()-1){
                System.out.println("Query not valid");
            }else{
                int numberElement = number.get(query);
                List<Integer> temp = new ArrayList<Integer>();
                for(int j=query-1;j<number.size();j++ ){
                    temp.add(number.get(j));
                }
                Integer tempResult = Collections.max(temp);
                Integer resultValue = Collections.frequency(temp,tempResult);
                result.add(resultValue);
            }
        }
        return result;
    }

}
