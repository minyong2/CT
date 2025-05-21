package day18;

import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

        /* 1~N
         * Q회 동안 i번째 작업에 대해 L~R은 i로 변경
         * ex) 2회 동안 1번째 작업에 대해 2~3은 1로 변경
         * index는 1부터 시작
         */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int Q = sc.nextInt();
            int L = 0;
            int R = 0;

            int[] arr = new int[N+1];
            for(int i=1; i<=N; i++){ // 배열 0 초기화
                arr[i] = 0;
            }

            for(int i=1; i<=Q; i++){
                L = sc.nextInt();
                R = sc.nextInt();

                for(int j=L; j<=R; j++){
                    arr[j] = i;
                }
            }
            System.out.print("#"+test_case+" ");
            for(int i=1; i<=N; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
		}
	}
}