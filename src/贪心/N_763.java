package 贪心;

import java.util.*;

public class N_763 {
    public List<Integer> partitionLabels(String s) {
        int[] count = new int[27];
        for(int i = 0; i < s.length(); i++){
            //统计s中每个字符出现的最后位置
            count[s.toCharArray()[i]-'a'] = i;
        }
//        for(int e: count){
//            System.out.print(e+" ");
//        }
//        System.out.println();
        List<Integer> result = new ArrayList<>();
        int right = 0;
        int left = 0;
        for(int i = 0; i< s.length();i++){
            right = Math.max(right, count[s.toCharArray()[i]-'a']);
            if(i == right){
                result.add(right - left + 1);
                left = right +1 ;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N_763 test = new N_763();
        System.out.println(test.partitionLabels("ababcbacadefegdehijhklij"));
    }

}
