package day8;

import java.util.*;

    /*
     * 각 칸의 들어가는 글자는 'A', 'B', 'C' 중 하나이다.
        ABA도 회문이며, ABBA도 회문이다. A 또한 길이 1짜리 회문이다.
        가로 또는 세로로 이어진 회문의 개수만 센다 (팰린드롬)

        8x8 배열

     */
   public class d3_1215{
        public static void main(String args[]) throws Exception{
            Scanner sc = new Scanner(System.in);
            int T;
            T=10;

            for(int test_case = 1; test_case <= T; test_case++){
                int p = sc.nextInt();
                sc.nextLine();

                int total = 0;

                String[][] arr = new String[8][8];

                for (int i = 0; i < 8; i++) {
                    String line = sc.nextLine();
                    for (int j = 0; j < 8; j++) {
                        arr[i][j] = String.valueOf(line.charAt(j));
                    }
                }

                for(int i=0; i<8; i++){//가로 확인
                    for(int j=0; j<=8-p; j++){
                        boolean palin = true;
                        for(int k=0; k<p/2; k++){
                            if (!arr[i][j+k].equals(arr[i][j+p-1-k])) {
                                palin = false;
                                break;
                            }
                        }
                        if (palin) total++;
                    }
                }

                for(int j=0; j<8; j++){ //세로 확인
                    for(int i=0; i<=8-p; i++){
                        boolean palin = true;
                        for(int k=0; k<p/2; k++){
                            if(!arr[i+k][j].equals(arr[i+p-1-k][j])){
                                palin = false;
                                break;
                            }
                        }
                        if (palin) total++;
                    }
                }

                System.out.println("#"+test_case+" "+total);
            }
        }
    }