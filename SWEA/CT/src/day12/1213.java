package day12;
import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++){
            int num = Integer.parseInt(sc.nextLine());
            String pattern = sc.nextLine();
            String full = sc.nextLine();
            int cnt = 0;

            for(int i=0; i<=full.length()-pattern.length(); i++){
                if(full.substring(i, pattern.length()+i).equals(pattern)){
                    cnt++;
                }
            }

            System.out.println("#"+test_case+" "+cnt);

		}
	}
}