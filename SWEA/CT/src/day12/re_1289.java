package day12;
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.nextLine());
        //sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++){
            String target = sc.nextLine();
            char pre = '0';
            int cnt = 0;

            for(int i=0; i<target.length(); i++){
                if (pre != target.charAt(i)) {
                    cnt++;
                    pre = target.charAt(i);
                }
            }
            System.err.println("#"+test_case+" "+cnt);
		}
	}
}