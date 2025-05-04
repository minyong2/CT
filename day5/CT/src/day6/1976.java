package CT.src.day6;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++){
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            
            int sumH = h1+h2;
            int sumM = m1+m2;
            
         	sumH += sumM/60;
            int min = sumM%60;
            int hour = sumH % 12;
            if(hour == 0) hour = 12;
            
            System.out.println("#"+test_case+" "+hour+" "+min);
		}
	}
}