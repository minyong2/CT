import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine(); //개행 처리

		for(int test_case = 1; test_case <= T; test_case++){
            String answer = null;
            String str = sc.nextLine();
	
            StringBuilder sb = new StringBuilder(str);
            String rev = sb.reverse().toString();
            
            if(str.equals(rev)){
            	answer = "1";
            }else{
            answer = "0";}
			 System.out.println("#" + test_case + " " + answer);

		}
	}
}