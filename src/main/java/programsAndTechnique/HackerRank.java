package programsAndTechnique;

import java.util.*;

public class HackerRank {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int k = 9;

        HackerRank fn = new HackerRank();
        // System.out.println(fn.findNumber(ls,k));
        // System.out.println(fn.oddNumbers(791,967));
        //String s ="abc";
        // long n =10;
        //System.out.println(fn.repeatedString(s,n));
        //System.out.println(fn.sockMerchant(k, ls));
        int[] arr = {7,1,3,2,4,5,6};
        System.out.println(fn.minimumSwaps(arr));

    }


    /* Linear search
     */

    public String findNumber(List<Integer> arr, int k) {
        // Write your code here

        String restult = "NO";
        for (Integer i : arr) {
            if (i == k) {
                restult = "YES";
                break;
            }
        }

        return restult;
    }

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public List<Integer> oddNumbers(int l, int r) {
        // Write your code here

        List<Integer> ls = new ArrayList<Integer>();

        if ((l != 0) && (l % 2 == 0)) {
            l = l + 1;
        }

        if ((r != 0) && (r % 2 == 0)) {
            r = r + 1;
        }

        for (int i = l; i <= r; i++) {

            if (i % 2 != 0) {
                ls.add(i);
            }
        }

        return ls;
    }

/*
There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.
Example
The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.
 */

    public long repeatedString(String s, long n) {
        // Write your code here
        int temp = 0;
        long l2 = 0;
        if (s.length() >= n) {
            s = s.substring((int) n);
            char[] arr = s.toCharArray();
            for (char i : arr) {
                if (i == 'a') {
                    temp++;
                }
            }
            l2 = temp;
            return l2;
        } else {

            int x = s.length();
            int i = 0;
            while (i <= n - x) {
                s = s + s;
                i = i + x;
            }

            if (s.length() >= n) {
                s = s.substring((int) n);
                char[] arr = s.toCharArray();
                for (char j : arr) {
                    if (j == 'a') {
                        temp++;
                    }
                }
                l2 = temp;

            }
        }

        return l2;
    }


    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int oddOne = 0;
        if (n != 0) {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for (int i = 0; i <= n - 1; i++) {

                if (hm.containsKey(ar.get(i))) {
                    hm.put(ar.get(i), hm.get(ar.get(i)) + 1);
                } else {
                    hm.put(ar.get(i), 1);
                }
            }

            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {

                if (e.getValue() % 2 == 1) {
                    oddOne++;
                }
            }
        }
        n = n - oddOne;
        return n / 2;
    }

    public List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here

        if (d != a.size()) {


            //First rotation

            for (int i = 0; i <= d; i++) {

                int temp = a.get(i);
                a.add(i, a.get(d));
                a.add(d - i, temp);

            }

            //First rotation

            for (int i = 0; i <= d; i++) {

                int temp = a.get(i);
                a.add(i, a.get(d));
                a.add(d - i, temp);

            }


        }
        return a;
    }


    // Minimum number of swaps required to sort an array
    // https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/

    /*
    Question :-  Input {7,2,1,3,5}  ==> {1,2,3,5,7} output :- no of Swap Taken ==> ?
    Steps :-
     1) Sort the given Map fot knowing actual positions
     2) Creare a Hash Map  - Number and its Index
     3) new Temp variable for swap ++
     4) Whenever swap happens update ur HaspMap index too
     */


    public int minimumSwaps(int[] arr) {

        int noOfSwap =0 ;
       int[] b = Arrays.copyOf(arr, arr.length);
       Arrays.sort(b);
       for(int i :b)
           System.out.println(i);
       HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        int j =0 ;
        for(int i :arr) {
            hs.put(i,j);
            j++;
        }
        System.out.println(hs);

        for(int i =0 ;i<arr.length;i++){

            if(arr[i]!=b[i]){
                if(hs.containsKey(arr[i])){

                    int swap2 = hs.get(arr[i]);
                    int swap1 = arr[i];


                    arr[i] = arr [swap2];
                    arr [swap2]= swap1;

                    hs.put(arr[swap2],swap2);
                    hs.put(arr[i],i);

                    noOfSwap++;
                }
            }
        }
        return noOfSwap;
    }

}