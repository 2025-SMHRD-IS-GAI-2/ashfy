package ex05배열;

import java.util.Scanner;

public class Ex03점수계산 {

	public static void main(String[] args) {
		// 5개 과목의 점수를 입력받아 평균값을 구하세요
		// *5개 과목의 점수를 배열에 저장한 다음 평균값을 구하세요
		Scanner sc = new Scanner(System.in);
		int[] tabi = new int[5];

		int sum = 0;

		for (int i = 0; i <= 4; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			tabi[i] = sc.nextInt();
			sum = sum + tabi[i];
		}
		System.out.print("배열의 데이터 : ");
		for (int i = 0; i <= 4; i++) {
			System.out.print(tabi[i] + " ");
		}

		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum);
	}
}
