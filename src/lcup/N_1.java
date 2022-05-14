package lcup;

public class N_1 {
    public int getMinimumTime(int[] time, int[][] fruits, int limit) {
        int result = 0;
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i][1] % limit == 0){
                result += fruits[i][1] / limit * time[fruits[i][0]];
            }else{
                result += (fruits[i][1] / limit + 1) * time[fruits[i][0]];
            }
            fruits[i][0] = 0;
            fruits[i][1] = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] time = {2,3,2};
        int[][] fruits = {{0,2},{1,4},{2,1}};
        int limit = 3;
    }
}
