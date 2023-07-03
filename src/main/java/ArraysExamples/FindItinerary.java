package ArraysExamples;

import java.util.*;

/**
 * Find itinerary from the given list of departure and arrival airports
 * Given a list of departure and arrival airports, find the itinerary in order. It may be assumed that departure is scheduled from every airport except the final destination, and each airport is visited only once, i.e., there are no cycles in the route.
 *
 * For example,
 *
 * Input:
 *
 * HKG —> DXB
 * FRA —> HKG
 * DEL —> FRA
 *
 * Output: DEL —> FRA —> HKG —> DXB
 *
 *
 * Input:
 *
 * LAX —> DXB
 * DFW —> JFK
 * LHR —> DFW
 * JFK —> LAX
 *
 * Output: LHR —> DFW —> JFK —> LAX —> DXB
 * Practice this problem
 *
 * We can easily solve this problem in linear time using hashing. The idea is to find the source airport and print the itinerary starting from the source airport. To find the source airport, construct a set of destination airports from a given list of tickets. A source airport would be one that is not present in the list of destination airports. Once the source airport is found, traverse the list of tickets to the print itinerary in order using recursion.
 *
 * Following is the C++, Java, and Python program that demonstrates this:
 *
 *
 * import java.util.HashSet;
 * import java.util.Map;
 * import java.util.Set;
 * import java.util.stream.Collectors;
 * import java.util.stream.Stream;
 *
 * class Main
 * {
 *     // Function to print the itinerary starting from a given source `src`
 *     private static void printItinerary(Map<String, String> map, String src)
 *     {
 *         String dest = map.get(src);
 *         if (dest == null) {
 *             return;
 *         }
 *
 *         System.out.println(src + " —> " + dest);
 *         printItinerary(map, dest);
 *     }
 *
 *     // Function to find the itinerary from the given list of departure
 *     // and arrival airports
 *     private static void findItinerary(String[][] input)
 *     {
 *         // construct a map from the given list of tickets (departure —> arrival)
 *         Map<String, String> tickets = Stream.of(input)
 *                 .collect(Collectors.toMap(p -> p[0], p -> p[1]));
 *
 *         // construct a set of destination airports
 *         Set<String> destinations = new HashSet<>(tickets.values());
 *
 *         // consider each departure airport to find the source airport
 *         for (String airport: tickets.keySet())
 *         {
 *             // source airport will not be present in the list of destination airports
 *             if (!destinations.contains(airport))
 *             {
 *                 // when the source airport is found, print the itinerary
 *                 printItinerary(tickets, airport);
 *                 return;
 *             }
 *         }
 *     }
 *
 *     public static void main(String[] args)
 *     {
 *         // input: list of tickets
 *         String[][] input = new String[][]{
 *                 {"LAX", "DXB"},
 *                 {"DFW", "JFK"},
 *                 {"LHR", "DFW"},
 *                 {"JFK", "LAX"}
 *         };
 *
 *         findItinerary(input);
 *     }
 * }
 * Download  Run Code
 *
 * Output:
 *
 * LHR —> DFW
 * DFW —> JFK
 * JFK —> LAX
 * LAX —> DXB
 *
 * The time complexity of the above solution is O(n) and requires O(n) extra space, where n is the total number of tickets.
 *
 *
 * Another standard solution is to build a directed graph of departure to arrival airports and perform topological sorting upon it. The time complexity of this solution remains O(n).
 *
 * Rate this post
 *
 * Average rating 4.87/5. Vote count: 46
 *
 *  Array, Graph
 *  Easy, Hashing, Recursive
 * Previous:Maximum Independent Set ProblemNext:Truncate an integer array such that `2×min` becomes more than `max`
 *
 *
 */

public class FindItinerary {

    public static void main(String[] args) {

        String[][] input = {
                {"LAX" , "DXB"},
                {"DFW" ,"JFK"},
                {"LHR" ,"DFW"},
                {"JFK" ,"LAX"}
                      };
        FindItinerary findItinerary = new FindItinerary();
        findItinerary.printItinerary(input);

    }

    public void printItinerary(String[][] input){

        int col = input[0].length;
        int row = input.length;
        Map<String,String> map = new HashMap<String,String>();

        for(int i =0;i<row;i++){
                map.put(input[i][0],input[i][1]);
        }

        System.out.println(map);
        ArrayList<String> output = new ArrayList<String>();
        output=findSource(map,output);
        System.out.println(output);


    }

    public ArrayList<String> findSource(Map<String,String> map, ArrayList<String> al){
        Set<String> key = map.keySet();
        for(String str : key){
            if(!map.containsValue(str)){
                al.add(str);
                al.add(map.get(str));
                map.remove(str);
                break;
            }
        }

        return getItinerary(map,al);
    }

    public ArrayList<String> getItinerary(Map<String,String> map, ArrayList<String> al){
      while(map.size()>0){
          int size =  al.size()-1;
         String des = map.get(al.get(size));
          map.remove(al.get(size));
          al.add(des);
      }
        return al;
    }
}
