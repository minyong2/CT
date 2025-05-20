package day16;
import java.util.*;
import java.io.FileInputStream;

class Solution{
    static boolean increase(int mul){
        String s = Integer.toString(mul);
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){ // 단조증가 X
                return false;
            }
        }
        return true;
    }
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int mul = 0;
            int max = -1;

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if (i==j) continue;
                    mul = arr[i] * arr[j];

                   if(increase(mul)){ // 단조증가 OK
                    max = Math.max(max, mul);
                    }
                   if(!increase(mul)){
                     max = -1;
                    }
                }
            }

            System.out.println("#"+test_case+" "+max);
		}
	}
}