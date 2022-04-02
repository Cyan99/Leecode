package ����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class N_17 {
    static List<String> result = new ArrayList<>();

    public String[] set() {
        //��ʼ��Ӧ���е����֣�Ϊ��ֱ�Ӷ�Ӧ2-9��������������Ч���ַ���""
        String[] telephoneNum = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return telephoneNum;
    }

    public List<String> letterCombinations(String digits) {
        String[] telephoneNum = set();
//        System.out.println(map.get(2+"").charAt(0));
        if (digits.equals("")) {
            return result;
        }
        backTrack(digits, 0, new StringBuffer(), telephoneNum);
        return result;
    }

    public void backTrack(String digits, int start, StringBuffer single, String[] telephoneNum) {
        if (single.length() == digits.toCharArray().length) {
            result.add(new String(single.toString()));
            return;
        }
//        System.out.println(digits.toCharArray()[start]);
        String cur = telephoneNum[digits.toCharArray()[start] - '0'];
        for (int i = 0; i < cur.length(); i++) {
            single.append(cur.charAt(i));
            backTrack(digits, start + 1, single, telephoneNum);
            single.deleteCharAt(single.length() - 1);
        }
    }

    public static void main(String[] args) {
        N_17 test = new N_17();
        test.letterCombinations("22");
        System.out.println(result);
    }
}
