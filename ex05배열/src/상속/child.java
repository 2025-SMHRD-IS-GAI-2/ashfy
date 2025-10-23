package 상속;

public class child extends parent{
	// 자식, 하위, 서브 클래스
	// 한식당 2호점
	
	// extends : 상속을 받는 키워드
	// -> class를 선언하는 구간에 작성한다
	// extends : 연장, 확장하다의 의미
	// makekimchi : 부모 클래스에서 상속받아서 재정의한 메서드
	// 메서드 오버라이딩(method overriding)
	// : 상속이 전제되어야 함
	// - 부모 클래스에서 선언한 메서드의 틀을 그대로 가지고 와서
	// *메서드의 틀(리턴타입, 메서드명, 매개변수)
	// 중괄호 안쪽(바디)의 로직만 재정의하는 기법
	// 오버로딩-중복정의, 오버라이딩-재정의
	//* 오버라이딩된 메서드의 좌측을 확인하면 초록색 세모 아이콘이 존재한다
	@Override // 어노테이션
	public void makekimchi(){
		System.out.println("삼겹살을 넣은 김치찌개를 만들어요");
		
	}
	
	
	public void makejeyuk() {
		System.out.println("담백하고 매운 제육볶음을 만들어요");
	}
}
