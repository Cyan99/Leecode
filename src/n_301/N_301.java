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
            //l,r:���Ϸ���������������
            //ll, rr:������������
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

        //���պϷ�����ĳ���
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
            //����������ţ��������뵽������
            dfs(a + 1, b + String.valueOf(c), ll, rr, score + 1);
            //�����뵽������
            dfs(a + 1, b, ll - 1, rr, score);
        } else if (c == ')') {
            //����������ţ��������뵽������
            dfs(a + 1, b + String.valueOf(c), ll, rr, score - 1);
            //�����뵽������
            dfs(a + 1, b, ll, rr - 1, score);
        } else {
            //����������ַ���ֱ�Ӽ���
            dfs(a + 1, b + String.valueOf(c), ll, rr, score);
        }
    }

}
