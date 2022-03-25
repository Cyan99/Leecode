package n_869;

public class official {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        reorderedPowerOf2(16);
    }

    public static boolean reorderedPowerOf2(int n) {
        char[] nums = String.valueOf(n).toCharArray();
        return dfs(nums, 0, 0);
    }

    private static boolean dfs(char[] nums, int count, int num) {
        if (count == nums.length) {
            if (isValid(num)) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(" nums[" + i + "]" + nums[i]);
            if (nums[i] != 'x') {
                // 去除前导0
                if (num == 0 && nums[i] == '0') {
                    continue;
                }
                char old = nums[i];
                nums[i] = 'x';
                // 回溯开始
                //a - '0'可以把a转成数字
                if (dfs(nums, count + 1, num * 10 + old - '0')) {
                    return true;
                }
                // 状态恢复
                nums[i] = old;
            }
        }

        return false;
    }

    private static boolean isValid(int num) {
        // 2的幂的二进制中只有一个1
        return (num & (num - 1)) == 0;
    }
}


