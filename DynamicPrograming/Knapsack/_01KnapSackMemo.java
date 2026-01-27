import java.util.Arrays;
import java.util.Scanner;

public class _01KnapSackMemo {

    static int[][] dp;

    int knapSack(int[] wt, int[] val, int W, int n) {

        // Base condition
        if (n == 0 || W == 0) {
            return 0;
        }

        // Memoization check
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // Choice diagram
        if (wt[n - 1] <= W) {
            dp[n][W] = Math.max(
                    val[n - 1] + knapSack(wt, val, W - wt[n - 1], n - 1),
                    knapSack(wt, val, W, n - 1)
            );
        } else {
            dp[n][W] = knapSack(wt, val, W, n - 1);
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] wt = new int[n];
        int[] val = new int[n];

        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }

        System.out.print("Enter knapsack capacity: ");
        int W = sc.nextInt();

        dp = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        _01KnapSackMemo obj = new _01KnapSackMemo();
        System.out.println("Maximum value in Knapsack = " +
                obj.knapSack(wt, val, W, n));

        sc.close();
    }
}
