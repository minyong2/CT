package day9;

import java.util.Scanner;
import java.util.*;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++){
            List<Integer> list = new ArrayList<>();
            int sum = 0;
			for(int i=0; i<10; i++){
            	int num = sc.nextInt(); 
                list.add(num);
            }
            Collections.sort(list);
            
            // 가장 크고 가장 작은 것 삭제
            list.remove(list.size()-1);
            list.remove(0);
            
            sum = list.stream().mapToInt(Integer::intValue).sum();
            int avg = Math.round((float) sum /list.size());
            System.out.println("#"+test_case+" "+avg); 

		}
	}
}