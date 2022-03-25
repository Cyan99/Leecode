package n_9;

public class Official {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int sum = 0;
        while (temp != 0) {
            sum = sum * 10 + temp % 10;
            temp /= 10;
        }
        if (sum == x) {
            return true;
        } else if (sum > Integer.MAX_VALUE) {
            return false;
        }
        return false;
    }
}
