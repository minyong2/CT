package day14;
// 4615. 재미있는 오셀로 게임
import java.util.*;

class Solution{
    public static void flip(int x, int y , int color , int[][] arr , int N){
        //↖↑↗→↘↓↙← (8방향)
        int[] dx = {-1,0,1,1,1,0,-1,-1};
        int[] dy = {-1,-1,-1,0,1,1,1,0};

        int enemy = (color==1)?2:1;

        for(int d=0; d<8; d++){
            List<int[]> toFlip = new ArrayList<>();
            int nx = x+dx[d];
            int ny = y+dy[d];

            while (nx >=0 && nx < N && ny >=0 && ny < N && arr[ny][nx] == enemy) {
                toFlip.add(new int[]{nx,ny});
                // 칸 이동
                nx += dx[d];
                ny += dy[d];
            }
            if(nx >=0 && nx < N && ny >=0 && ny < N && arr[ny][nx] == color){
                for(int[] pos : toFlip){
                    arr[pos[0]][pos[1]] = color;
                }
            }
            
        }

    }
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt(); // 한 변의 길이
            int[][] arr = new int[N][N];
            int M = sc.nextInt(); // 돌을 놓는 횟수


            //4기준  (1,1)W (1,2)B (2,1)W (2,2)B
            for(int i=N/2-1; i<=N/2; i++){
                for(int j=N/2-1; j<=N/2; j++){
                    if(i==j) arr[i][j] = 2;
                    else arr[i][j] = 1;
                }
            }

            for(int i=0; i<M; i++){
                int x = sc.nextInt() -1; // 0-based라서 -1
                int y = sc.nextInt() -1;
                int color = sc.nextInt(); //1흑 ,2백

                arr[y][x] = color; // x,y좌표에 돌 놓음

                flip(x,y,color,arr,N);
            }

            int b = 0;
            int w = 0;

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(arr[i][j]==1) b++;
                    else if(arr[i][j]==2) w++;
                }
            }

            System.out.println("#"+test_case+" "+b+" "+w);


		}
	}
}