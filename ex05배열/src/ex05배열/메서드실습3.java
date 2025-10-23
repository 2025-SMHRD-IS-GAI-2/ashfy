package ex05배열;

import java.util.Scanner;

public class 메서드실습3 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int satoru = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int suguru = sc.nextInt();
		
		int shoko = largerNumbers(satoru, suguru);
		System.out.println("큰 수 확인 : " + shoko);
	}

	private static int largerNumbers(int satoru, int suguru) {
		// 비교연산자를 사용해서 satoru(num1)와 suguru(num2) 중 더 큰 수를 판별하기
		// satoru(num1)가 더 크다면 satoru(num1) 반환
		// suguru가(num2) 더 크다면 suguru(num2) 반환
		// 조건식 사용하기
		if(satoru > suguru) {
			return satoru;
		}
		else if(satoru < suguru) {
			return suguru;
		}
		else{	
			return 0;
		} 
	}
}
