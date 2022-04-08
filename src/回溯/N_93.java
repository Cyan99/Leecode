package 回溯;

import java.util.ArrayList;
import java.util.List;

public class N_93 {
    List<String> result = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backTrack(s, 0,0);
        return result;
    }

    public void backTrack(String s, int startIndex, int flag) {
        if (flag == 3) {
            // 划分第四段后，如果第四段也有效就加到结果
            if (isValid(s.substring(startIndex, s.length() ))) {
                result.add(s);
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s.substring(startIndex, i+1))) {
                //s：[0, i+1) . [i+1,s.length())
                s = s.substring(0, i+1) + "." + s.substring(i + 1);
                flag++;
                // i+2是因为有逗号
                backTrack(s, i + 2, flag);
                // 去掉逗号
                s = s.substring(0, i+1) + s.substring(i + 2);
                flag--;
            } else {
                break;
            }

        }
    }

    public boolean isValid(String s) {
        if(s.equals("")){
            return false;
        }
        if (s.length() > 3) {
            return false;
        }
        if( s.length()>1 && s.charAt(0) == '0'){
            return false;
        }
        int sum = 0;
        for(char e:s.toCharArray()){
            sum = sum * 10 + e-'0';
            if(sum > 255 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        N_93 test = new N_93();
        test.restoreIpAddresses("0000");
        System.out.println(test.result);
//        System.out.println(test.isValid("345"));
    }
}
