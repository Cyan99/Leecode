package 动态;

import java.util.List;

public class N_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp =new boolean[s.length()+1]; // dp[i]就是长度为i的字符串,能不能被字典里的单词拼出
        dp[0] = true;
        for(int i = 0; i <= s.length(); i++){
            // 遍历背包
            for(int j = 0; j <= i; j++){
                //遍历物品
                String temp = s.substring(j, i);
                if(dp[j] && wordDict.contains(temp)){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
