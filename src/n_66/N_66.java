package n_66;

import java.util.ArrayList;

/*
 * ��һ
 * ����һ���� ���� ��ɵ� �ǿ� ��������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢�������֡�
 * 
 * ����˼·����һֻ�迼�����������һ��������9Ҫ��λ��һ����ֱ�Ӽ�һ
 * ����ֱ���ö�10ȡ�ཫ0����
 * ����һЩ���������9999��999999 ֮�������ʱ��
 * 		ѭ�������Ҳ��Ҫ��λ�������������ʱ��Ҫ�ֶ�������һλ��
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

//***********�Լ���ı�����
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

// �ٷ����
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
