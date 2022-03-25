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
                // ȥ��ǰ��0
                if (num == 0 && nums[i] == '0') {
                    continue;
                }
                char old = nums[i];
                nums[i] = 'x';
                // ���ݿ�ʼ
                //a - '0'���԰�aת������
                if (dfs(nums, count + 1, num * 10 + old - '0')) {
                    return true;
                }
                // ״̬�ָ�
                nums[i] = old;
            }
        }

        return false;
    }

    private static boolean isValid(int num) {
        // 2���ݵĶ�������ֻ��һ��1
        return (num & (num - 1)) == 0;
    }
}


