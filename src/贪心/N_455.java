package Ì°ĞÄ;

import java.util.Arrays;

public class N_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int flag = g.length;
        for(int i = s.length - 1; i >= 0; i--){
            if(flag == 0){
                return result;
            }
            for(int j = flag-1; j >= 0; j--){
                if(s[i] >= g[j]){
                    result++;
                    flag = j;
                    break;
                }
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
