import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
			int before = sc.nextInt();
            int after = sc.nextInt();
            int result = 0;
            
            if(before + after > 24){
            	result = before + after - 24;
            }else if(before + after < 24){
            	result = before + after;
            }
			System.out.println("#"+test_case+" "+result); 
		}
	}
}