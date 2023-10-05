// https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

public class Valid_Anagram {
    // time -  O(nlogn) and space -  O(n)
    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()){
    //         return false;
    //     }
    //     char temp[] = s.toCharArray();
    //     char fal[] = t.toCharArray();
    //     Arrays.sort(temp);
    //     Arrays.sort(fal);
    //     return Arrays.equals(temp, fal);
    // }

    // time - O(n) and space - O(k)
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                } else{
                    map.put(ch, map.get(ch)-1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
    
}