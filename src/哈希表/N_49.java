package ¹þÏ£±í;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class N_49 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] temp = new int[26];
            StringBuffer sb = new StringBuffer();
            for (char e : s.toCharArray()) {
                temp[e - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (temp[i] != 0) {
                    sb.append((char) (i + 'a'));
                    sb.append(temp[i]);
                }
            }
            String st = sb.toString();
            List<String> list = map.getOrDefault(st, new ArrayList<String>());
            list.add(s);
            map.put(st, list);

        }
        return new ArrayList<List<String>>(map.values());


    }
}
