package n_20;

import java.util.Stack;

public class N_20 {
    //”√’ª
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = ")";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char e : s.toCharArray()) {
            if (e == ')') {
                if (!st.empty()) {
                    if (st.peek() == '(') {
                        st.pop();
                        continue;
                    }
                } else
                    return false;
            } else if (e == ']') {
                if (!st.empty()) {
                    if (st.peek() == '[') {
                        st.pop();
                        continue;
                    }
                } else
                    return false;
            } else if (e == '}') {
                if (!st.empty()) {
                    if (st.peek() == '{') {
                        st.pop();
                        continue;
                    }
                } else
                    return false;

            }
            st.push(e);
        }
        return st.empty();
    }
}
