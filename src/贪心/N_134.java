package Ì°ÐÄ;

public class N_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = 0;
        int curRest = 0, total = 0;
        for (int i = 0; i < gas.length; i++) {
            curRest += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (curRest < 0) {
                result = i + 1;
                curRest = 0;
            }
        }
        if(total < 0){
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,2,1};
        N_134 test = new N_134();
        System.out.println(test.canCompleteCircuit(gas, cost));
    }
}

