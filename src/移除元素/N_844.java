package ÒÆ³ýÔªËØ;

import java.util.Stack;

public class N_844 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(backspaceCompare("a##c", "#a#c"));
    }

    public static boolean backspaceCompare(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Stack<Character> ss = new Stack<Character>();
        Stack<Character> tt = new Stack<Character>();
        for (char e : a) {
            if (e == '#') {
                if (!ss.empty()) {
                    ss.pop();
                }
            } else {
                ss.push(e);
            }
        }
        for (char e : b) {
            if (e == '#') {
                if (!tt.empty()) {
                    tt.pop();
                }
            } else {
                tt.push(e);
            }
        }
        ss.equals(tt);
        return ss.equals(tt);
    }
}
