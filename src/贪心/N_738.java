package Ì°ÐÄ;

public class N_738 {
    public int monotoneIncreasingDigits(int n) {
        char[] nChar = String.valueOf(n).toCharArray();
        int flag = nChar.length;
        for (int i = nChar.length - 1; i > 0; i--) {
            if (nChar[i - 1] > nChar[i]) {
                flag = i - 1;
                nChar[i - 1]--;
            }
        }

        for (int i = flag + 1; i < nChar.length; i++) {
            nChar[i] = '9';
        }

        return Integer.parseInt(String.copyValueOf(nChar));
    }

    public static void main(String[] args) {
        N_738 test = new N_738();
        System.out.println(test.monotoneIncreasingDigits(1234));
    }
}
