package n_301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class N_301 {
    public static void main(String[] args) {
        String s = "()())()";
        for (String e : removeInvalidParentheses(s)) {
            System.out.println(e);
        }
    }

    static Set<String> set = new HashSet<>();
    static int len = 0;
    static int s_len = 0;
    static String ss;
    static int max = 0;

    public static List<String> removeInvalidParentheses(String s) {
        ss = s;
        s_len = s.length();
        int l = 0, ll = 0;
        int r = 0, rr = 0;
        for (char e : s.toCharArray()) {
            //l,r:不合法的左、右括号数量
            //ll, rr:左、右括号数量
            if (e == '(') {
                l++;
                ll++;
            } else if (e == ')') {
                rr++;
                if (l != 0) {
                    l--;
                } else {
                    r++;
                }
            }
        }

        max = Math.min(ll, rr);

        //最终合法情况的长度
        len = s_len - l - r;

        dfs(0, "", l, r, 0);
        return new ArrayList<>(set);
    }

    static void dfs(int a, String b, int ll, int rr, int score) {
        if (ll < 0 || rr < 0 || score > max || score < 0) {
            return;
        }
        if (ll == 0 && rr == 0) {
            if (b.length() == len) {
                set.add(b);
            }
        }
        if (a == s_len) {
            return;
        }
        char c = ss.charAt(a);
        if (c == '(') {
            //如果是左括号，把它加入到搜索中
            dfs(a + 1, b + String.valueOf(c), ll, rr, score + 1);
            //不加入到搜索中
            dfs(a + 1, b, ll - 1, rr, score);
        } else if (c == ')') {
            //如果是右括号，把它加入到搜索中
            dfs(a + 1, b + String.valueOf(c), ll, rr, score - 1);
            //不加入到搜索中
            dfs(a + 1, b, ll, rr - 1, score);
        } else {
            //如果是其他字符，直接加入
            dfs(a + 1, b + String.valueOf(c), ll, rr, score);
        }
    }

}
