package day14;
import java.util.*;
/*
 *  N명의 사람
 *  M초의 시간을 들이면 K개의 붕어빵
 */
/* 조건
    1. 처음 방문하는 손님이 M초 이후에 와야한다.
    2. 두번째 손님은 2M초에 와야한다. -> i*M초 (그래야 붕어빵이 있으니까)
 */

class Solution{

	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            List<Integer> list = new ArrayList<>();
            list.add(0);
            String rst = "Possible";
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            for(int i=1; i<=N; i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list.subList(1, list.size())); //1~마지막까지만 sort

            for(int i=1; i<=N; i++){
                int time = list.get(i);
                int bread = (time/M)*K;

                if(bread < i){
                    rst = "Impossible";
                    break;
                }
             
            }
            System.out.println("#"+test_case+" "+rst);
		}
	}
}