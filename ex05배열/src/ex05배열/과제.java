package ex05배열;

import java.util.Arrays;
import java.util.Random;

public class 과제 {
	public static void main(String[] args) {
		// 랜덤 도구 가져오기
		Random rd = new Random();
		// 정수형 데이터 5개를 저장하는 배열 선언
		int[] lize = new int[5];
		// 랜덤한 정수를 배열의 각 인덱스에 할당
		// 배열 데이터의 개수 5
		// 인덱스 번호 0~4
		// * 중복 제거
		for (int i = 0; i <= 4; i++) {
			lize[i] = rd.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				// 2번째 for문 : 중복 제거 -> 첫번째 데이터부터
				// 할당 받은 데이터까지 순차적으로 동일한지 비교
				if (lize[j] == lize[i]) {
					// 첫번째 데이터 -> 배열의 0번째 인덱스
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(lize));
	}
}

