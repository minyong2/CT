package day7;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int test_case = 1; test_case <= T; test_case++) {
            int money = sc.nextInt();
            int[] counts = new int[unit.length];

            for (int i = 0; i < unit.length; i++) {
                counts[i] = money / unit[i];     
                money %= unit[i];               
            }

            System.out.println("#" + test_case);
            for (int count : counts) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}