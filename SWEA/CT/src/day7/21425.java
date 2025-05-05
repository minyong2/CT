package day7;
import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	// 조건1. x,y,n 중 n이 가장 커야한다.
    // 조건2. x나 y 둘 중 하나 이상에 저장된 값이 N 초과가 되게 하기 위해 “x += y”, “y += x” 연산을 최소 몇 번 수행해야 하는지 출력한다.
		for(int test_case = 1; test_case <= T; test_case++){
            int cnt = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int N = sc.nextInt();
         
              while (x <= N && y<= N){
                  if(x < y){
                    x += y;
                  }else{
                   y+=x;
                  }
                    cnt ++;
                }
            System.out.println(cnt);
		}
	}
}