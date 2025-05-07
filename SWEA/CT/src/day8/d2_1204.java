package day8;

import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int cnt = 0;
            int max = 0;
            int[] arr = new int[101]; // 0~100점까지
            int num = sc.nextInt();
            for(int i=0; i<1000; i++){ // 점수 1000개 입력
            	int score = sc.nextInt();
                arr[score]++;
            }
            
            for(int i=0; i<=100; i++){
                if(arr[i] > cnt || (arr[i] == cnt && i > max)){
                	cnt = arr[i];
                    max = i;
                }

            }
            System.out.println("#"+test_case+" "+max);
		}
	}
}