package ̰��;

public class N_45 {
    public int jump(int[] nums) {
        int count = 0;
        if(nums.length == 1){
            return count;
        }
        int cur = 0, next = 0;//��ǰ���Ƿ�Χ����һ���Ƿ�Χ
        for(int i = 0; i < nums.length; i++){
           next = Math.max(nums[i]+i, next);
            if(next >= nums.length - 1){
                count++;
                return count;
            }
           if(i == cur) {
               //���ߵ��˵�ǰ���Ƿ�Χ��ĩβ
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
