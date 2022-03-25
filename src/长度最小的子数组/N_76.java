package 长度最小的子数组;

import java.util.HashMap;

public class N_76 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "ba";
        String t = "a";
        System.out.print(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        String result = "";
        int len = Integer.MAX_VALUE;
        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char e : t.toCharArray()) {
            target.put(e, target.getOrDefault(e, 0) + 1);
        }
        int l = 0, count = 0;
        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            if (target.containsKey(s.charAt(r)) && map.get(s.charAt(r)) <= target.get(s.charAt(r))) {
                count++;
            }
            while (l < r && (!target.containsKey(s.charAt(l)) || map.get(s.charAt(l)) > target.get(s.charAt(l)))) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            if (count == t.length() && r - l + 1 < len) {
                len = r - l + 1;
                result = s.substring(l, r + 1);
            }
        }
//    	if(result != "" && t.length() == 1) {
//    		return t;
//    	}
        return result;
    }
}
