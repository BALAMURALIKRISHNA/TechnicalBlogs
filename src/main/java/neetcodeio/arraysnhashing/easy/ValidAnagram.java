package neetcodeio.arraysnhashing.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
            boolean isAnagramFlag = true;

            if(s.isEmpty() || t.isEmpty()){
               return false;
            }
            if(s.length()!= t.length()){
                return false;
            }
            char[] sChar= s.toCharArray();
            char[] tChar= t.toCharArray();
            Map<Character,Integer> sMap= new HashMap<Character,Integer>();
            Map<Character,Integer> tMap= new HashMap<Character,Integer>();

            for(char i : sChar){

                if(sMap.containsKey(i)){
                    sMap.put(i,sMap.get(i)+1);
                }else{
                    sMap.put(i,1);
                }

            }
            for(char j : tChar){

                if(tMap.containsKey(j)){
                    tMap.put(j,tMap.get(j)+1);
                }else{
                    tMap.put(j,1);
                }

            }

        if (sMap.equals(tMap)){
            return true;
        }
        return false;

//            Iterator<Map.Entry<Character,Integer>> mapIterator = sMap.entrySet().iterator();
//            while(mapIterator.hasNext()){
//                Map.Entry<Character,Integer> entry = mapIterator.next();
//                Character c = entry.getKey();
//                if(sMap.get(c)==tMap.get(c)){
//                    isAnagramFlag = true;
//
//                }else{
//                  return false;
//
//                }
//
//            }
//            return isAnagramFlag;
        }


    public boolean hasAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] store = new int[26];

        for(int i=0; i<s.length(); i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for(int n:store)
            if(n != 0)
                return false;

        return true;
    }

    public static void main(String[] args){
        ValidAnagram cd = new ValidAnagram();
        boolean flag = cd.isAnagram("abcdef", "defbca");
        System.out.println("Has duplicate ="+ flag);
    }
    }
