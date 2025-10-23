package ex05배열;

public class 메서드2 {
	public static void main(String[] args) {
		int nana=shibuki(4,4)+shibuki(100,4);
		System.out.println(nana);
	}
	// void의 위치
	// 메서드 호출시에 되돌려주는 결과의 자료형 자리
	// void : 출력문이 결과인 경우
	private static int shibuki(int i, int j) {
		int mashiro = i+j;
		// 메서드 생성시에 작성한 리턴값의 자료형과
		// 실제 return 키워드를 통해 돌려주는 데이터의
		// 자료형은 무조건 일치해야 한다
		// 메서드 생성시에 마지막 코드는 언제나 return
		return mashiro;
		
	}
}
