import java.util.Scanner;

public class Main {
    static int N, K;
    static int dp[][];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        dp = new int[11][11];
        for(int i=0; i<=N; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
            dp[i][1] = i;
        }
        for(int i=2; i<=N; i++) {
            for(int j=1; j<i; j++) {
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }
        System.out.println(dp[N][K]);
    }
}