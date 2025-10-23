package ex05배열;

import java.util.Random;

public class ex05연습 {
	public static void main(String[] args) {
		int [] hle = new int [5];
		System.out.println(hle);
		
		Random rd = new Random();
		
		for(int i =0; i<=4; i++) {
		hle[i] = rd.nextInt(100)+1;
		
		System.out.println("랜덤한 정수 중에서 홀수");
			if(hle[i]%2==1){
				System.out.print(hle[i]+" ");
			}
			}
		
		System.out.println(hle[0]);
		System.out.println(hle[1]);
		System.out.println(hle[2]);
		System.out.println(hle[3]);
		System.out.println(hle[4]);
	
		
		System.out.println("=============");
	/*	System.out.println("랜덤한 정수 중에서 홀수");
		// 홀수 찾는 조건문을 5번 반복하는 for문
		for(int i=0; i<=4; i++) {
			// i: 0,1,2,3,4 -> 총 5번 반복
			if(hle[i]%2==1){
				System.out.print(hle[i]+" "); */
	}
	
	
		
	
}

