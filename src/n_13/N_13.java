package n_13;

import java.util.HashMap;

public class N_13 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = new String("MCMXCVI");
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        char[] a = s.toCharArray();
        int value = 0;
        HashMap<Character, Integer> sites = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int i = 0;
        for (i = 0; i < a.length - 1; i++) {
            if (sites.get(a[i]) < sites.get(a[i + 1])) {
                value += sites.get(a[i + 1]) - sites.get(a[i]);
                i++;
            } else {
                value += sites.get(a[i]);
            }
        }
        if (i < a.length) {
            value += sites.get(a[a.length - 1]);
        }
        return value;
    }
}
