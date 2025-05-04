package day5;
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++){
		/* L > a = a/a+b
           R > b = a+b/b
        */
            int a = 1;
        	int b = 1;
            String  dir = sc.nextLine();
            for(char s : dir.toCharArray()){
            	if(s =='L'){
            	b = a+b;
            	}
            	else if(s =='R'){
            	a = a+b;
            	}
            }
		System.out.println("#"+test_case+" "+a+" "+b); 
		}
	}
}