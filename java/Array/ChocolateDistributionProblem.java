package Array;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int chocolate[] = {7, 3, 2, 4, 9, 12, 56};
        int students = 3;
        System.out.println("The minimum difference between max and min no of chocolates is:"+getMinNumber(chocolate,students));
    }

    private static int getMinNumber(int[] chocolate, int students) {
        Arrays.sort(chocolate);
        int minChocolate = Integer.MAX_VALUE;
        int diff = 0;

        for(int i=0;i+students-1<chocolate.length;i++){
            diff = chocolate[i+students-1] - chocolate[i];
            minChocolate = Math.min(diff, minChocolate);
        }
        return minChocolate;
    }
}
