package ex05배열;

import java.util.Scanner;

public class 메서드실습4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int kinji = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int kirara = sc.nextInt();
		
		int result = close10(kinji, kirara);
		
		System.out.println("10에 가까운 수 : " + result);
	}

	private static int close10(int kinji, int kirara) {
		// 10과의 거리를 계산해야하기 때문에 10을 기준으로 차이값 구하기
		// 차이값이 음수일때는 양수로 바꿔줘야 한다
		
		int hajime = 10 - kinji;
		int hiromi = 10 - kirara;
		
		if(hajime < 0) {
			hajime = hajime * (-1);
		}
		if(hiromi < 0) {
			hiromi = hiromi * (-1);
		}
		else if(hajime < hajime) {
			return kinji;
		}
		else if(hajime < hajime) {
			return kirara;
		}
		return 0;
	}
	
	
}
