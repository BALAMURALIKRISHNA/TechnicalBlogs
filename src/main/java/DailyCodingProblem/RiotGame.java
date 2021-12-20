package DailyCodingProblem;


import javax.xml.stream.events.EntityReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*

This question was asked by Riot Games.

Design and implement a HitCounter class that keeps track of requests (or hits). It should support the following operations:

record(timestamp): records a hit that happened at timestamp
total(): returns the total number of hits recorded
range(lower, upper): returns the number of hits that occurred between timestamps lower and upper (inclusive)
Follow-up: What if our system has limited memory?
 */
public class RiotGame {


    public static Map<Long, Integer> hm = new LinkedHashMap<>();

    public static void main(String[] args){

        RiotGame obj = new RiotGame();

        Scanner in = new Scanner(System.in);
        System.out.println("request / total/ range/stop");
        String incoming = in.nextLine();

        while(incoming.equalsIgnoreCase("request")){
            Date dt = new Date();
            SimpleDateFormat st = new SimpleDateFormat("MM-DD-YYYY hh:mm:ss");
            st.format(dt);
            obj.record(dt.getTime());
            System.out.println("request or stop ");
            incoming = in.nextLine();
            System.out.println("You entered string " + incoming);
        }

        System.out.println("get total");
        System.out.println(obj.total());

        System.out.println(hm);

        System.out.println("get range between");
        System.out.println("lower");
        long lower = in.nextLong();
        System.out.println("upper");
        long upper = in.nextLong();
        System.out.println(obj.range(lower,upper));



    }

    protected void record(long timestamp){
        hm.put(timestamp,1);
    }

    protected int total(){
        return hm.size();
    }

    protected int range(long lower, long upper){

        int temp =0 ;
        for(Map.Entry<Long,Integer> entry: hm.entrySet()){
            if(entry.getKey() >= lower && entry.getKey() <= upper){
                temp ++;
            }
        }

        return temp;
    }
}
