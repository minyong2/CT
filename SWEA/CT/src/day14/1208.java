package day14;

import java.util.*;
// 1208. [S/W 문제해결 기본] 1일차 - Flatten

class Solution{

	public static void main(String args[]) throws Exception{
        //최고점과 최저점의 차이를 반환

		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++){
            List<Integer> list = new ArrayList<>();
            int num = sc.nextInt();
            int rst = 0;

            for(int i=0; i<100; i++){ // 각 상자의 높이 받기
                list.add(sc.nextInt());
            }
            int last = list.size()-1;
            for(int i=0; i<num; i++){ // 평탄화 작업
                Collections.sort(list); 

                // 가장 큰 값 -1 , 가장 작은 값 +1
                list.set(last, list.get(last) -1);
                list.set(0, list.get(0)+1);
            }

            Collections.sort(list);
            rst = list.get(last) - list.get(0);
            System.out.println("#"+test_case+" "+rst);
		}
	}
}