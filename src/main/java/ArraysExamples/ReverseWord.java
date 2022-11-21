package ArraysExamples;

import java.lang.reflect.Array;
import java.util.*;

public class ReverseWord {
    /*
    Given a string and a set of delimiters,
    reverse the words in the string while maintaining the relative order of the delimiters.
    For example, given "hello/world:here", return "here/world:hello"
    Follow-up: Does your solution work for the following cases: "hello/world:here/", "hello//world:here"
     */
    public static void main(String[] args) {

        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        hs.put(1,hs.getOrDefault(1,0)+1);
        int[][] matrix = {
                {10,13,14,15},
                {20,21,22,23},
                {33,34,35,36},
                {37,38,39,40}
        };

        int target =34;
        ReverseWord rw  = new ReverseWord();
        System.out.println(rw.searchMatrix(matrix,target));
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int low = 0;
        int high = matrix.length - 1;
        int targetRowIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][matrix[0].length - 1] == target) {
                return true;
            } else if (target > matrix[mid][matrix[0].length-1]) {
                low = mid + 1;
            } else {
                targetRowIndex = mid;
                high = mid - 1;
            }
        }

        if (targetRowIndex == -1) {
            return false;
        }

        low = 0;
        high = matrix[0].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[targetRowIndex][mid] == target) {
                return true;
            } else if (target > matrix[targetRowIndex][mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;

    }
}
