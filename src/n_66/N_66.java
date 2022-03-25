package n_66;

import java.util.ArrayList;

/*
 * 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 
 * 解题思路：加一只需考虑两种情况，一种是遇到9要进位，一种是直接加一
 * 可以直接用对10取余将0保留
 * 还有一些特殊情况：9999、999999 之类的数字时，
 * 		循环到最后也需要进位，出现这种情况时需要手动将它进一位。
 */
public class N_66 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] test = {0};
        for (int i : plusOne(test)) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {

//***********自己解的笨方法
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		int count = 0;
//		int m = 1;
//		if (digits[digits.length-1]!=9) {
//			digits[digits.length-1] += 1;
//			for(int e:digits) {
//				a.add(e);
//			}
//		}
//		else if(digits.length != 1){
//			digits[digits.length-1] = 0;
//			int i = 0;
//			do {
//				i++;
//				digits[digits.length-i-1]++;
//				if(digits[digits.length-i-1] == 10) {
//					digits[digits.length-i-1] = 0;
//					count++;
//				}
//			}while(digits[digits.length-i-1]%10 == 0 && count<digits.length-1);
//			for(int e:digits) {
//				a.add(e);
//			}
//		}
//		else {
//			a.add(1);
//			a.add(0);
//			m--;
//		}
//		int l = a.size();
//		if (a.indexOf(0)==0 ) {
//			l += 1;
//		}
//		int []arr = new int[l];
//		int i = 0;
//		if (a.indexOf(0)==0 ) {
//			for(int e:digits) {
//				arr[i+1] = e;
//				i++;
//			}
//			arr[0] = 1;
//		}
//		else if(m!=0){
//			for(int e:digits) {
//				arr[i] = e;
//				i++;
//			}
//		}
//		else {
//			arr[0] = 1;
//			arr[1] = 0;
//		}
//		for(int e:arr) {
//			System.out.println(e);
//		}
//		
//		return arr;  

// 官方题解
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
