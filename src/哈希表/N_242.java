package ¹þÏ£±í;

import java.util.HashMap;

public class N_242 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "anagam";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        int count = 0;
        for (char e : s.toCharArray()) {
            mapS.put(e, mapS.getOrDefault(e, 1) + 1);
        }
        for (char e : t.toCharArray()) {
            mapT.put(e, mapT.getOrDefault(e, 1) + 1);
        }
        if (mapS.equals(mapT)) {
            return true;
        }
        return false;
    }

}
