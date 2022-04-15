package Ì°ÐÄ;

public class N_53 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int sum = 0;
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > result){
                result = sum;
            }
            if(sum < 0){
                sum = 0;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums =  {5,4,-1,7,8};
        N_53 test = new N_53();
        System.out.println(test.maxSubArray(nums));
    }
}
