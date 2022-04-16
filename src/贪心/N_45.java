package 贪心;

public class N_45 {
    public int jump(int[] nums) {
        int count = 0;
        if(nums.length == 1){
            return count;
        }
        int cur = 0, next = 0;//当前覆盖范围和下一覆盖范围
        for(int i = 0; i < nums.length; i++){
           next = Math.max(nums[i]+i, next);
            if(next >= nums.length - 1){
                count++;
                return count;
            }
           if(i == cur) {
               //当走到了当前覆盖范围的末尾
               cur = next;
               count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        N_45 test = new N_45();
        System.out.println(test.jump(nums));
    }
}
