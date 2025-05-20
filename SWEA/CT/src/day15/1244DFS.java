package day15;

import java.util.*;
import java.io.*;

class Solution{
    static int swap; //총 교환 수
    static char[] numArr;
    static int answer;
    static Set<String>[] visited;

    static void dfs(int cnt){
        String cur = new String(numArr);

        // 이미 같은 숫자 상태를 본 적 있으면 중복 탐색 방지
        //HashSet은 Contains 사용 가능
        if(visited[cnt].contains(cur)) return;
        visited[cnt].add(cur);

        if(cnt == swap){
            answer = Math.max(answer, Integer.parseInt(cur));
            return;
        }

        int n = numArr.length;
        for(int i=0; i<n-1; i++){
            //j 비교
        }
    }

	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            String num = sc.next();
            swap = sc.nextInt();
            numArr = num.toCharArray();
            answer = 0;

            visited = new HashSet[swap+1];
            for(int i=0; i<=swap; i++){
                visited[i] = new HashSet<>();
            }



		}
	}
}