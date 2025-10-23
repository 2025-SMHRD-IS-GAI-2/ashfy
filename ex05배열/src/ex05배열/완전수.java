package ex05배열;

import java.util.Scanner;

public class 완전수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		System.out.println(getSum(7));
		System.out.println(isPerfect(6));
	}

	private static boolean isPerfect(int y) {
			if(getSum(y) == y) {
				return true;
			}
		return false;
	}

	private static int getSum(int i) {
		// 매개 변수로 들어온 정수의 약수를 구하는데
		// 자기 자신을 제외한 약수의 합을 리턴값
		// -> 약수를 누적해서 결과 도출
		int result = 0;
		for (int s = 1; s < i; s++) {
			if (isDivisor(i,s)==true) {
				result = result + s;
			}
		}
		return result;
	}

	private static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		}
		return false;
	}
}