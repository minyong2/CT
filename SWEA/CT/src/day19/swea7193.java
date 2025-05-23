package day19;

import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
        /* N진법의 수 X
         * N진법의 수 X가 주어졌을 때 , X를 (N-1)로 나눈 나머지 계산
         * 9진법의 수 234가 주어졌을때 , 234를 8로 나눈 나머지 계산
         */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt(); //진법
            String X = sc.next(); 
            int sum = 0;

            for(int i=0; i<X.length(); i++){
                sum += X.charAt(i) - '0'; // 문자 > 숫자
            }
            int rst = sum % (N-1);
            System.out.println("#"+test_case+" "+rst);

		}
	}
}