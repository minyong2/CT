package day20;
import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int D = sc.nextInt();
            int K = (D*2)+1;

            int cnt = 0;

            for(int i=0; i<N; i += K){
                cnt++;
            }

            System.out.println("#"+test_case+" "+cnt);
		}
	}
}