package ex05배열;

public class 메서드 {

	public static void main(String[] args) {
		kanna(3,7); // 메서드 호출 : 메인 안쪽
		// 메서드 호출시에 소괄호 안 데이터
		// -> 전달인자(argument)
	}
	// 메서드 생성 : 메인 바깥쪽
	private static void kanna(int i, int j) {
		// (int i, int j)
		// -> i,j에 어떤 정수가 들어올지 모르지만 정수 2개를 사용할거다 선언
		int riko = i+j;
		System.out.println(riko);
		
		
	}
	
	// int sum; 변수 선언
	// num=0; 변수에 데이터 대입(할당)
	// int num =0; 변수 선언과 동시에 할당
	
	
	
	
	
	
	
	
}
		//메서드(method), 메소드 -> 함수
		// 1) 자주 사용하는 코드를 메서드로 만들어서 이름만 가져와서 호출
		// 2) "객체"의 행위, 기능
		// 3) 기능을 수행하기 위해 클래스내에 정의
		// 메서드 호출법: 메서드 명(메서드 실행시에 필요한 데이터)
		// sum메서드 : 2개의 정수를 더해서 결과값