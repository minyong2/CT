package day5;
import java.util.Scanner;


class Solution
{
	public static void main(String args[]) throws Exception{
        // N 전체크기 M파리채 크기
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int max = 0;
            int[][] grid = new int[N][N];
            for(int i=0; i<N; i++){ //배열 자체의 크기 순회
                for(int j=0; j<N; j++){
                	grid[i][j] = sc.nextInt();
                }
            }
                  for(int i=0; i<= N-M; i++){
                      for(int j=0; j<= N-M; j++){
                          int sum = 0;
                      	  for(int x=0; x<M; x++){// 파리채 크기 순회
                        	for(int y=0; y<M; y++){
                            
                        		sum += grid[i+x][j+y];
                       	 }
                    	}
                                      max = Math.max(max,sum);
                      }
                    }
          
            System.out.println("#"+test_case+" "+max);  
		}
	}
}