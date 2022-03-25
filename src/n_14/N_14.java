package n_14;

public class N_14 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] strs = {"aac", "aacab", "aa", "aabba", "aa"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        int min = 201;
        int j = 0, k = 0;
        for (int i = 0; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }

        String result = strs[0];
        for (j = 1; j < strs.length; j++) {
            for (k = 0; k < min && k < result.length(); k++) {
                if (strs[j].charAt(k) != result.charAt(k)) {
                    break;
                }
            }
            result = result.substring(0, k);
            if (result.equals("")) {
                return result;
            }
        }
        return result;
    }
}
