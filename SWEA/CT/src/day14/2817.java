package day14;

import java.util.*;

class Solution{
    /* 각 테스트 케이스의 첫 번째 줄에는 2개의 자연수 N , K가 주어진다.
     * 두 번째 줄에는 N개의 자연수 수열 A가 주어진다. 
     * 수열 A 중 1개 이상의 수를 택하여 그 합이 K가 되는 경우의 수
     */
    static int N,K,cnt;
    static List<Integer> listA;

    static void dfs(int index , int sum){
        if (sum > K) return;
        if (index == N) { // 마지막까지 다 확인했다면
            if (sum == K) {
                cnt++;
            }
            return;
        }
        dfs(index+1, sum+listA.get(index));
        dfs(index+1,sum);
    }
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            listA = new ArrayList<>();
            N = sc.nextInt();
            K = sc.nextInt();
            cnt = 0;

            for(int i=0; i<N; i++){
                listA.add(sc.nextInt());
            }
            dfs(0,0);

            System.out.println("#"+test_case+" "+cnt);
		}
	}
}