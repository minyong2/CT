package day10;
import java.util.*;


class Solution{
    static int n;
    static int cnt;
    static int[] col;
    static void solve(int row){
        if (row == n) {
            cnt++;
            return;
        }
        for(int i=0; i<n; i++){
            col[row] = i; // row행 i열에 퀸 놓음
            if(isPossoble(row)){
                solve(row+1); // 다음 행 이동
            }
        }
    }

    static boolean isPossoble(int row){
        for(int i=0; i<row; i++){
            if (col[i] == col[row] || Math.abs(row-i) == Math.abs(col[row] - col[i])) {
                return false;
            }
        }
        return true;
    }
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++){
            cnt = 0;
            n = sc.nextInt();

            col = new int[n];
            solve(0); //0번 째 줄
            System.out.println("#"+test_case+" "+cnt);



		}
	}
}