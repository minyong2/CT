import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
			int[][] arr = new int[N][N];
            for(int i=0; i<N; i++){
            	for(int j=0; j<N; j++){
                	arr[i][j] = sc.nextInt();
                }
            }
            int arr90[][] = rotate90(arr);
            int arr180[][] = rotate90(arr90);
            int arr270[][] = rotate90(arr180);
            System.out.println("#"+test_case);
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(arr90[i][j]);
                }
                System.out.print(" ");
                 for(int j=0; j<N; j++){
                    System.out.print(arr180[i][j]);
                }
                System.out.print(" ");
                 for(int j=0; j<N; j++){
                    System.out.print(arr270[i][j]);
                }
                System.out.println();
            }
		}
	}
    
    static int[][] rotate90(int[][] arr){
        int N = arr.length;
        int[][] result = new int[N][N];
    	for(int i=0; i<N; i++){
        	for(int j=0; j<N; j++){
            	result[j][N-1-i] = arr[i][j];
            }
        }
        
        return result;
    }
}