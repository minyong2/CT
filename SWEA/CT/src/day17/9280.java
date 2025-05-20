package day17;

import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> waitQueue = new LinkedList<>();

            int n = sc.nextInt(); // 주차 공간 수 , 공간의 kg당 요금
            int m = sc.nextInt(); 
            int[] Ri = new int[n+1];
            int[] Wi = new int[m+1];
            boolean[] parking = new boolean[n+1]; // 주차중 false , 주차가능 true
            int[] carNum = new int[n+1];
            int rst = 0;

            for(int i=1; i<=n; i++){ // 주차공간 단위 무게당 요금 (1kg 당)
                Ri[i] = sc.nextInt();
            }
            for(int i=1; i<=m; i++){ // 차량의 무게
                Wi[i] = sc.nextInt();
            }

            for(int i=0; i<2*m; i++){
                queue.add(sc.nextInt()); // 차량 입출차
            }
            for(int i=1; i<=n; i++){
                // true = 주차 가능 , false = 주차 불가
                parking[i] = true;
                carNum[i] = 0;
            }

            while (!queue.isEmpty()) {
                boolean parked = false;
                int car = queue.poll();
                if(car > 0){ //입차시
                    for(int i=1; i<=n; i++){
                        if(parking[i]){
                            parking[i] = false; //주차중 상태변경
                            rst += Ri[i] * Wi[car]; // i번째 요금 * 차 무게
                            carNum[i] = car;
                            parked = true;
                            break;
                        }
                    }
                    if (!parked) {
                        waitQueue.add(car);
                    }
                }else if(car < 0){ //출차시
                    int carAbs = Math.abs(car);
                    for(int i=1; i<=n; i++){
                        if (carNum[i] == carAbs) {
                            parking[i] = true; //주차가능 상태변경
                            carNum[i] = 0;

                            if (!waitQueue.isEmpty()) {
                                int waitingCar = waitQueue.poll();
                                parking[i] = false;
                                 rst += Ri[i] * Wi[waitingCar]; 
                                 carNum[i] = waitingCar;
                            }
                            break;
                        }
                    }
                }    
            }    
            System.out.println("#"+test_case+" "+rst);        
		}
	}
}