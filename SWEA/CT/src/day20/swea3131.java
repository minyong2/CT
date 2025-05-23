package day20;

import java.util.*;
import java.io.FileInputStream;

class Solution{
    static boolean isPrime(int n){
        if (n<2) return false;
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if (n%i == 0) return false;
        }
        return true;
    }
	public static void main(String args[]) throws Exception{
        // 1 이상 100만 이하

		for(int i=1; i<=1000000; i++){
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
	}
}