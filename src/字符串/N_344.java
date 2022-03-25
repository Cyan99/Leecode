package ×Ö·û´®;

public class N_344 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (char e : s) {
            System.out.println(e);
        }
    }

    public static void reverseString(char[] s) {
        char temp;
        int l = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[l - i];
            s[l - i] = temp;
        }

    }

}
