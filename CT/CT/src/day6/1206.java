package day6;
import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++){
            int building = sc.nextInt();
            int[] arr = new int[building];
            int higher = 0;
            int answer = 0;
            for(int i=0; i<building; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=2; i<building-2; i++){
                higher = Math.max(Math.max(arr[i+1], arr[i+2]) , Math.max(arr[i-1], arr[i-2]));     
                if(arr[i] > higher){
                	answer += arr[i]-higher;
                }
            }
            System.out.println("#"+test_case+" "+answer);
		}
	}
}