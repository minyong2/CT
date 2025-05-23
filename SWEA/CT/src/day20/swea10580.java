package day20;

import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int lines = sc.nextInt();
            int[][] arr = new int[lines][2];
            int cnt = 0;

            for(int i=0; i<lines; i++){
                int a = sc.nextInt();
                arr[i][0] = a; //왼
                int b = sc.nextInt();
                arr[i][1] = b; //오
            }

            for(int i=0; i<lines-1; i++){ //두 전선을 비교
                for(int j=i+1; j<lines; j++){
                    if (arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1] ||
                        arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1]) {
                        cnt++;
                    }
                }
            }
            System.out.println("#"+test_case+" "+cnt);
		}
	}
}