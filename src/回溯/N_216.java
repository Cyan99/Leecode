package ����;

import java.util.*;

public class N_216 {
    static List<List<Integer>> result = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k,n, new LinkedList<Integer>(),1);
        return result;
    }

    public void backTrack(int k, int n, Deque<Integer> single, int start){
        if(sum > n){
            //��֦
            return;
        }
        if(single.size() == k){
            if(sum == n){
                result.add(new ArrayList<>(single));
            }
            return;
        }
        for(int i = start; i <= 9 -(k-single.size()) + 1; i++){
            //ԭ����i<=9�����ڶ��˼�֦
            //k-single.size() �� ����Ҫ������
            // 9 -(k-single.size()) + 1 ������forѭ����ʼ��λ�ã����������ʣ������Ͳ���k����
            single.offer(i);
            sum += single.getLast();
            backTrack(k,n,single,i+1);
            sum -= single.pollLast();
        }
    }
//    public static void main(String[] args) {
//        N_216 test = new N_216();
//        test.combinationSum3(3,7);
//        System.out.println(result);
//    }
}
