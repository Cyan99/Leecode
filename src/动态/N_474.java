package 动态;

public class N_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1]; // dp[i][j] 为i个0，j个1 时的最大子集长度

        for(String str:strs){
            // 遍历物品，即字符串数组中的字符串
            int zeroNum = 0;
            int oneNum = 0;
            for(char c:str.toCharArray()){
                if(c == '0'){
                    zeroNum++;
                }else{
                    oneNum++;
                }
            }

            // 遍历背包
            for(int i = m; i >= zeroNum; i--){
                for(int j = n; j >= oneNum; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeroNum][j-oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
