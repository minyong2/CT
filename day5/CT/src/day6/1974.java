package CT.src.day6;

import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int rst = 1;
			int[][] sudoku = new int[9][9];
            
            for(int i=0; i<9; i++){
            	for(int j=0; j<9; j++){
                	sudoku[i][j] = sc.nextInt();
                }
            }
            // 가로행 체크
            for(int i=0; i<9; i++){
                boolean[] chk = new boolean[10];
            	for(int j=0; j<9; j++){
                    int num = sudoku[i][j];
                    if(chk[num]){
                        rst = 0; break;
                    }else chk[num] = true;
                }
            }
            if(rst == 1){
            	 //세로행 체크
             for(int j=0; j<9; j++){
                    boolean[] chk = new boolean[10];
                    for(int i=0; i<9; i++){
                        int num = sudoku[i][j];
                        if(chk[num]){
                            rst = 0; break;
                        }else chk[num] = true;
                    }
                }
            }
            
            if(rst == 1){
                        //3x3 체크
                for(int row=0; row<9; row+=3){
                    for(int col=0; col<9; col+=3){
                		boolean[] chk = new boolean[10];
                       	for(int i=0; i<3; i++){
                        	for(int j=0; j<3; j++){
                            	int num = sudoku[row+i][col+j];
                                if(chk[num]){
                                    rst = 0; break;
                                }else chk[num] = true;
                            }
                           // if (rst == 0) break;
                        }
                	}
            	}
            }
			System.out.println("#" + test_case + " " + rst);
		}
	}
}