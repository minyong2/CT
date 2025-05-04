package day5;
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int length = sc.nextInt();
            sc.nextLine();
            int cnt = 0;
            
            String s = sc.nextLine();
            String answer = sc.nextLine();
            
            for(int j=0; j<length; j++){
            	 if(s.charAt(j) == answer.charAt(j)){
                	cnt ++;
                }
            }
			System.out.println("#"+test_case+" "+cnt);  
		}
	}
}