package ×Ö·û´®;

public class N_541 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "a";
        System.out.println(s.length());
        System.out.println(reverseStr(s, 20));
    }

    public static String reverseStr(String s, int k) {
        int l = s.length();
        char[] c = s.toCharArray();
        char temp;
        for (int i = 0; i < l; i += 2 * k) {
            int left = i, right = Math.min(k + left, l);
            while (left < right) {
                temp = c[left];
                c[left] = c[right - 1];
                c[right - 1] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}
