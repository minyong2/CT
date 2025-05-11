package day12;
import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++){
            int max = 0;
            int diag1 = 0; // 좌상우하
            int diag2 = 0; // 우상좌하

            int[][] arr = new int[100][100];
            int num = sc.nextInt();

            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            //행의 합
            for(int i=0; i<100; i++){
                int sum = 0;
                for(int j=0; j<100; j++){
                    sum += arr[i][j];
                }
                max = Math.max(max, sum);
            }

            //열의 합
            for(int i=0; i<100; i++){
                int sum = 0;
                for(int j=0; j<100; j++){
                    sum += arr[j][i];
                }
                max = Math.max(max, sum);
            }

            //대각의 합
            for(int i=0; i<100; i++){
                diag1 += arr[i][i];
                diag2 += arr[i][99-i];
            }
                max = Math.max(max, Math.max(diag1, diag2));

                System.out.println("#"+test_case+" "+max);
		}
	}
}