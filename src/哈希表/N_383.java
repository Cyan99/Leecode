package ¹þÏ£±í;

public class N_383 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "a";
        String t = "ba";
        System.out.println(canConstruct(s, t));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] s1 = new int[26];
        for (char e : ransomNote.toCharArray()) {
            s1[e - 'a'] += 1;
        }
        int[] s2 = new int[26];
        for (char e : magazine.toCharArray()) {
            s2[e - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (s1[i] <= s2[i]) {
                continue;
            }
            return false;
        }
        return true;
    }
}
