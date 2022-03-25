package n_7;

import java.util.ArrayList;

public class N_7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(reverse(0));

    }

    public static int reverse(int x) {
//    	ArrayList<Integer> a = new ArrayList<Integer>();
//    	int reverse = 0;
//    	int count = 0;
//    	while(x != 0) {
//    		a.add(x%10);
//    		x /= 10;
//    		count++;
//    	}
//    	for(int i = 0; i < a.size(); i++) {
//    		reverse += a.get(i) * Math.pow(10,count-1-i);
//    	}
//    	if(reverse >= Integer.MAX_VALUE || reverse <= Integer.MIN_VALUE) {
//    		reverse = 0;
//    	}
//    	return reverse;
//    }
//}
        //判断溢出条件有所改变
        int reverse = 0;
        while (x != 0) {
            if (reverse > (Integer.MAX_VALUE / 10) || reverse < (Integer.MIN_VALUE / 10)) {
                reverse = 0;
                break;
            }
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse;
    }
}
