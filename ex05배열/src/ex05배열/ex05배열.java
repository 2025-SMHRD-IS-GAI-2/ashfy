package ex05배열;

public class ex05배열 {
	public static void main(String[] args) {
		// - 배열(Array) : 같은 자료형의 데이터를 하나의 묶음으로 다루는 자료구조
		// - 자료 구조(Data Structure) : 대형 데이터를 효율적으로 관리하기 위한 메커니즘
		// * 여러 데이터들의 묶음을 저장하고 사용하는 방법 정의
		// 정수형 데이터를 저장하는 배열 arr
		// 1.배열 선언
		// 자료형 [] 배열명 = new 자료형[데이터 개수]
		int [] arr = new int[3];
		// 정수형 데이터 저장하는 배열 arr
		// 총 3개의 정수형 데이터를 저장한다
		System.out.println(arr); // 주소값
		// - 배열의 실제 데이터에 접근하는 법
		// 배열명[정수] -> 인덱스(index)
		// *인덱스는 0번부터 시작한다
		// 현재 데이터의 개수 : 3개
		// 인덱스 번호는 [0], [1], [2]
		// 기본값이 할당되어있다
		// 정수 : 0
		// boolean : false, String : null
		System.out.println("데이터 할당 전" + arr[0]);
		arr[0]= 1;
		System.out.println("데이터 할당 후" + arr[0]);
		System.out.println(arr.length);
		// @ -> 저장되어있는 주소값
		// 배열 -> 레퍼런스(참조) 자료형
		// * 레퍼런스 자료형은 실제 저장되는 크기는 변수/배열 선언시에 알 수 있다
		// stack: 상대적으로 작은 크기의 데이터 저장공간
		// heap: 상대적으로 큰 크기의 데이터 저장공간(실제 데이터 저장공간의 주소값)
		// -> 실제 데이터를 저장
	}
}
