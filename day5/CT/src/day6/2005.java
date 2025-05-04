package CT.src.day6;

import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
            int line = sc.nextInt();
            int[][] tri = new int[line][line];
		//triangle[i][0]
    /*  1 triangle[0][0] i=0 j=0
		1 1 triangle[1][0] triangle[1][1]
		1 2 1 triangle[2][0] triangle[2][1] triangle[2][2]
		1 3 3 1 triangle[3][0] triangle[3][1] triangle[3][2] triangle[3][3]  */
            
            tri[0][0] = 1;
            for(int i=1; i<line; i++){
            	tri[i][0] = 1; // 삼각형의 맨 위 꼭짓점은 항상 1
                for(int j=1; j<=i; j++){
                    tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
                }
            }
            
            System.out.println("#"+test_case);
            for(int i=0; i<line; i++){
            	for(int j=0; j<=i; j++){
                	 System.out.print(tri[i][j] + " ");
                }
                System.out.println();
            }
		}
	}
}