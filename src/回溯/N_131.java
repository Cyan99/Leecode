package »ØËÝ;

import java.util.ArrayList;
import java.util.List;

public class N_131 {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTrack(s,0,new ArrayList<String>());
        return result;
    }

    public void backTrack(String s, int startIndex, List<String> single){
        if(startIndex == s.length()){
            result.add(new ArrayList<>(single));
            return;
        }
        for(int i = startIndex; i < s.length(); i++){
            String temp = s.substring(startIndex,i+1);
            if(isHuiWen(temp)){
                single.add(temp);
            }else{
                continue;
            }
            backTrack(s, i+1,single);
            single.remove(single.size()-1);
        }

    }

    public boolean isHuiWen(String s){
        for(int start = 0, end = s.length() -1; start < end; start++, end--){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        N_131 test = new N_131();
        test.partition("aab");
        System.out.println(test.result);
    }
}
