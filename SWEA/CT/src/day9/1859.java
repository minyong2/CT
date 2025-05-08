package day9;
import java.util.Scanner;
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	// 테스트케이스 수 , 몇일동안 모니터링 할 건지 , 각 날의 가격
		for(int test_case = 1; test_case <= T; test_case++){
            List<Integer> price_list = new ArrayList<>();
            int days = sc.nextInt();
            long benefit = 0;
            int max = 0;
            for(int i=0; i<days; i++){
            // 각 날의 가격
                int price = sc.nextInt();
                price_list.add(price);
            }
       		for(int j=price_list.size()-1; j>=0; j--){
            	if(price_list.get(j) > max){ //값이 최고가보다 크면 최고가 갱신
                    max = price_list.get(j);
                }else{ //값이 최고가보다 작으면 이득
                    benefit += max-price_list.get(j);
                }
            }    
		System.out.println("#"+test_case+" "+benefit);
		}
	}
}