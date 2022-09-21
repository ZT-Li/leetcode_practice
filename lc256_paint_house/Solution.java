import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[][] case1 = new int[][]{{17,2,17},{16,16,5},{14,3,9}};
        System.out.println(paintHouse(case1));
    }

    public static int paintHouse(int[][] cost) {
        int n = cost.length;
        int[][] dp = new int[n][3];
        dp[0] = cost[0];

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 3; j++) {

                //the current cost depends on the previous minimum cost, that is not in the same color
                dp[i][j] = Math.min(dp[i-1][(j+1)%3], dp[i-1][(j+2)%3]) + cost[i][j];
            }
        }

        return Arrays.stream(dp[n-1]).min().getAsInt();
    }
}
