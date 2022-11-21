package ArraysExamples;

//OM NAMO NARAYANAYA =  75 Program.

import java.util.*;

public class TenxGenomics {


    public static void main(String[] args){

        List<String> input = new ArrayList<String>();
        input = Arrays.asList("AAABC","AAABC","AAABC","AAABC","AAABC","AAABC","AAABC","AAABC","AAABC","AAABC","AAABC","AAABC");

        Map<Integer,String> map = new HashMap<Integer,String>();
        int len = input.get(0).length();
        StringBuffer n = new StringBuffer("");
        int j =5;
        for(int i =0 ;i<len*2;i++){

            if(i<len){
                n.trimToSize();
                n =n.append("N");
            }else{
                System.out.println(map);

                n.deleteCharAt(i-j);
                j= j+1;

            }

            map.put(i,n.toString());
        }


      System.out.println(map);


        for(int k =0;k<input.size();k++){

            StringBuffer sb = new StringBuffer(input.get(k));

            int m = k;
            if(m>10){
                m= k%10;
            }

            if(m<(input.get(0).length()-1)){
                    System.out.println(input);
                    //String str = sb.substring(i,sb.length());

                    String temp = map.get(m)+input.get(k);
                    input.set(k,temp);
                }else if(m>=(input.get(0).length()-1)){
                    System.out.println(input);
//                    sb.replace((k-len)+1,sb.length()-1, map.get(k+1));
//                    input.add(k, sb.toString());
                String temp = input.get(k)+map.get(m);
                input.set(k,temp);
                }

//            for (int i = 1; i < sb.length(); i++) {
//                if(k<=5){
//                    System.out.println(input);
//                    String str = sb.substring(i,sb.length());
//                    String temp = map.get(k+1)+str;
//                    input.set(k,temp);
//                }else if(k>5){
//                    System.out.println(input);
//                    sb.replace((k-len)+1,sb.length()-1, map.get(k+1));
//                    input.add(k, sb.toString());
//                }
//            }

        }

        System.out.println(input);
    }




}
