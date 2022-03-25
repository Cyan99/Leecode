package n_229;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class N_229 {
/*
 * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * 
 * 官方思路：
 *	1.哈希Map 
 *	
 *  2.摩尔投票法：解决的问题是如何在任意多的候选人中，选出票数超过一半的那个人
 * 	假设投票是这样的，[A, C, A, A, B]，ABC 是指三个候选人。
		第一张票与第二张票进行对坑，如果票不同则互相抵消掉；
		接着第三票与第四票进行对坑，如果票相同，则增加这个候选人的可抵消票数；
		这个候选人拿着可抵消票数与第五张票对坑，如果票不同，则互相抵消掉，即候选人的可抵消票数 -1。
*****但这不意味着这个候选人的票数一定能超过一半，例如 [A, B, C] 的抵消阶段，
*		最后得到的结果是 [C,1]，C 候选人的票数也未能超过一半的票数
 * 	所以摩尔投票法分为两个阶段：抵消阶段和计数阶段。
 * 抵消阶段:两个不同投票进行对坑，并且同时抵消掉各一张票，如果两个投票相同，则累加可抵消的次数
 * 计数阶段：在抵消阶段最后得到的抵消计数只要不为 0，
那这个候选人是有可能超过一半的票数的，为了验证，则需要遍历一次，统计票数，才可确定。
 */

/*
 * 结论：
 * 如果至多选一个代表，那他的票数至少要超过一半（⌊ 1/2 ⌋）的票数；
	如果至多选两个代表，那他们的票数至少要超过 ⌊ 1/3 ⌋ 的票数；
	如果至多选m个代表，那他们的票数至少要超过 ⌊ 1/(m+1) ⌋ 的票数
 */

    public static void main(String[] args) {
        int[] test = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> l = majorityElement(test);
        for (int e : l) {
            System.out.println(e);
        }

    }

    public static List<Integer> majorityElement(int[] nums) {
//自己的方法
//		HashSet<Integer> sites = new HashSet<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
//		for(int e : nums) {
//			sites.add(e);
//		}
//		int [][] num = new int[sites.size()][2];
//		int temp = 0;
//		for(int i : sites) {
//			num[temp][0] = i;
//			temp++;
//		}
//		for(int j = 0; j<sites.size();j++) {
//			for(int k = 0; k<nums.length;k++) {
//				if(num[j][0] == nums[k]) {
//					num[j][1]++;
//				}
//			}
//		}
//		for(int m = 0; m < sites.size();m++) {
//			if(num[m][1] > nums.length/3) {
//				list.add(num[m][0]);
//			}
//		}
//		return list;
//    }
        //摩尔投票法
        List<Integer> a = new ArrayList<Integer>();
        int count1 = 0, c1 = nums[0];
        int count2 = 0, c2 = nums[0];
        for (int e : nums) {
            if (c1 == e) {
                //第一个候选人投票
                count1++;
                continue;
            }
            if (c2 == e) {
                //第二个候选人投票
                count2++;
                continue;
            }

            if (count1 == 0) {
                //如果第一个候选人没有票，则更新候选人
                c1 = e;
                count1++;
                continue;
            }
            if (count2 == 0) {
                //如果第二个候选人没有票，则更新候选人
                c2 = e;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }
// 计数阶段
        count1 = 0;
        count2 = 0;
        for (int e : nums) {
            if (c1 == e) {
                count1++;
            } else if (c2 == e) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            a.add(c1);
        }
        if (count2 > nums.length / 3) {
            a.add(c2);
        }
        return a;
    }
}
