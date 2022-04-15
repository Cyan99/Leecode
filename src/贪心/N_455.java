package Ì°ĞÄ;

import java.util.Arrays;

public class N_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int flag = s.length - 1;
        for(int i = g.length - 1; i >= 0; i--){
            if(flag>=0 && s[flag] >= g[i]){
                result++;
                flag--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] g= {1,2,3};
        int[] s = {1,1};
        N_455 test = new N_455();
        System.out.println(test.findContentChildren(g,s));
    }
}
