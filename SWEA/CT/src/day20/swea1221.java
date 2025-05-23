package day20;
import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

        String[] nums = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		for(int test_case = 1; test_case <= T; test_case++){
            String S = sc.next();
            int N = sc.nextInt();
            int[] cnt = new int[10]; // 0~9
            for(int i=0; i<N; i++){
                String num = sc.next();
                for(int j=0; j<nums.length; j++){
                    if (num.equals(nums[j])) {
                        cnt[j]++;
                        break;
                    }
                }
            }

            System.out.println("#"+test_case);
            for(int i=0; i<10; i++){
                for(int j=0; j<cnt[i]; j++){
                    System.out.print(nums[i]+" ");
                }
            }
            System.out.println();
		}
	}
}