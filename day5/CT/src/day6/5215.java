package day6;
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
			int N = sc.nextInt(); 
            int L = sc.nextInt(); 
            int max = 0;
            
            int[] score = new int[N];
            int[] calorie = new int[N];
            
            for(int i=0; i<N; i++){ //재료정보
            	score[i] = sc.nextInt();
                calorie[i] = sc.nextInt();
            }
            
            int[] dp = new int[L+1]; // 0~L 
            
            for(int i=0; i<N; i++){
            	for(int j=L; j >= calorie[i]; j--){ // 1000 ~ calorie[i]
                	dp[j] = Math.max(dp[j], dp[j - calorie[i]] + score[i]);
                }
            }
            
            for(int i=0; i<dp.length; i++){
            	max = Math.max(max, dp[i]);
            }
            System.out.println("#"+test_case+" "+max);
		}
	}
}