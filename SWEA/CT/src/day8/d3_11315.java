package day8;

import java.util.Scanner;
/*
 * N X N 크기의 판이 있다. 판의 각 칸에는 돌이 있거나 없을 수 있다. 
 * 돌이 가로, 세로, 대각선 중 하나의 방향으로 다섯 개 이상 
 * 연속한 부분이 있는지 없는지 판정하는 프로그램을 작성하라.

[입력]
첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
각 테스트 케이스의 첫 번째 줄에는 하나의 정수 N(5 ≤ N ≤ 20)이 주어진다.
다음 N개의 줄의 각 줄에는 길이 N인 문자열이 주어진다.
각 문자는 ‘o’또는 ‘.’으로, ‘o’는 돌이 있는 칸을 의미하고, ‘.’는 돌이 없는 칸을 의미한다.

[출력]
각 테스트 케이스 마다 돌이 다섯 개 이상 연속한 부분이 있으면 “YES”를, 아니면 “NO”를 출력한다.
 */
class Solution{
	public static void main(String args[]) throws Exception{	
        //실행 시간 : 0.09303s
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int n = sc.nextInt();
            sc.nextLine();
            String[][] arr = new String[n][n];

            for(int i=0; i<n; i++){
                String s = sc.nextLine();
                for(int j=0; j<n; j++){
                    arr[i][j] = String.valueOf(s.charAt(j));
                }
            }
            // 오 아 왼대 오대
            int[] dx ={1,0,1,-1};
            int[] dy ={0,1,1,1};

            String found = "NO";

            outer:
            for(int y=0; y<n; y++){
                for(int x=0; x<n; x++){
                    if (!arr[y][x].equals("o")) continue;
                    for(int d=0; d<4; d++){
                        int cnt = 1;

                        for(int k=1; k<5; k++){
                            int ny = y+dy[d]*k;
                            int nx = x+dx[d]*k;

                            if (ny>=0 && ny < n && nx >= 0 && nx < n 
                                && arr[ny][nx].equals("o")) {
                                cnt++;
                            }else {
                                break;
                            }

                            if (cnt == 5) {
                                found = "YES";
                                break outer;
                            }
                        }

                    }
                }
            }
            System.out.println("#"+test_case+" "+found);
		}
	}
}

