package day17;

import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] dp = new int[N];
            int rst = 0;
            
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
                dp[i] = 1;
            }

            for(int i=1; i<N; i++){ // i번째 수를 마지막으로 가장 긴 배열찾기
                for(int j=0; j<i; j++){
                    if(arr[i] >= arr[j]){
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
            }

            for(int i=0; i<N; i++){
                rst = Math.max(rst, dp[i]);
            }

            System.out.println("#"+test_case+" "+rst);
		}
	}
}