package day7;

import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++){
			int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int cnt = 0;

			for(int i=0; i<n; i++){
            	for(int j=0; j<n; j++){
                	arr[i][j] = sc.nextInt();
                }
            }
            
            for(int j=0; j<n; j++){
                boolean magN = false;
            	for(int i=0; i<n; i++){
                	if(arr[i][j] == 1) magN = true;
                    else if(arr[i][j] == 2){
                        if(magN){
                        	cnt++;
                            magN = false;
                        }
                    } 
                }
            }
				System.out.println("#"+test_case+" "+cnt);   
		}
	}
}