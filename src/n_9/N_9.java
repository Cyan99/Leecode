package n_9;

public class N_9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(isPalindrome(21));
    }

    public static boolean isPalindrome(int x) {
        char[] a = Integer.toString(x).toCharArray();
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == a[a.length - 1 - i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

