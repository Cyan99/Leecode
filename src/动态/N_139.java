package ��̬;

import java.util.List;

public class N_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp =new boolean[s.length()+1]; // dp[i]���ǳ���Ϊi���ַ���,�ܲ��ܱ��ֵ���ĵ���ƴ��
        dp[0] = true;
        for(int i = 0; i <= s.length(); i++){
            // ��������
            for(int j = 0; j <= i; j++){
                //������Ʒ
                String temp = s.substring(j, i);
                if(dp[j] && wordDict.contains(temp)){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
