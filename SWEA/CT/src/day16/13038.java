package day16;

import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int n = sc.nextInt();
            int[] arr = new int[7];
            int minDays = Integer.MAX_VALUE;
            // 일 ~ 토
            for(int i=0; i<7; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i=0; i<7; i++){
                if (arr[i] == 0) continue;
                int days = 0;
                int study = 0;
                int idx = i;

                while (study < n) {
                    if (arr[idx%7] == 1) {
                        study++;
                    }
                    days++;
                    idx++;
                }
                minDays = Math.min(minDays, days);
            }
            System.out.println("#"+test_case+" "+minDays);
		}
	}
}