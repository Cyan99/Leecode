package �ݹ�;

import java.util.ArrayList;
import java.util.List;

public class N_77 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> single = new ArrayList<>();
        backTrack(n,k, single, 1);

        return result;
    }

    public void backTrack(int n, int k, List<Integer> single, int start){
        if(single.size() == k){
            result.add(new ArrayList(single));
            return;
        }

//        for (int i = start; i <= n; i++) {
        //�Ż���֦
        // ����Ҫ�Ľڵ�����k-single.size()
        // ��ʼλ�ã�n - (k -single.size()) + 1��start�������λ�ú���ľͲ���������k����
        for (int i = start; i <= n - (k -single.size()) + 1 ; i++) {
            single.add(i);
            backTrack(n, k, single, i+1);
            single.remove(single.size()-1);
        }

    }

    public static void main(String[] args) {
        N_77 test = new N_77();
        test.combine(4,2);
    }
}
