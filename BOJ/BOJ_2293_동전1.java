package algorithm;

import java.util.Scanner;

public class BOJ_2293_동전1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		int[] dp = new int[10001];
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = coin[i]; j <= k; j++) {
				if(j-coin[i] >=0) {
					dp[j] += dp[j - coin[i]];
				}
			}
		}
		System.out.println(dp[k]);
	}

}
