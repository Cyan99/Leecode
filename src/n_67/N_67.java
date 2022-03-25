package n_67;

import java.util.ArrayList;
import java.util.List;

public class N_67 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1 = "1001";
        String s2 = "0001";
//		System.out.print(s1.charAt(0)-'0'+s2.charAt(0)-'0');
        System.out.print(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        int max = Math.max(a.length(), b.length());
        int h = a.length() - 1;
        int u = b.length() - 1;
        int p = 0, temp = 0;
        char[] c = new char[max];
        for (int i = 0; i < max; i++) {
            if (h < 0) {
                p = b.charAt(u) - '0' + temp;
            } else if (u < 0) {
                p = a.charAt(h) - '0' + temp;
            } else {
                p = a.charAt(h) - '0' + b.charAt(u) - '0' + temp;
            }
            if (temp != 0) {
                temp = 0;
            }
            if (p >= 2) {
                p = p % 2;
                temp = 1;
            }
            c[max - i - 1] = (char) (p + '0');
            u--;
            h--;
        }

        if (temp != 0) {
            return "1" + new String(c);
        } else {
            return new String(c);
        }
    }

}
