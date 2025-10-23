package 상속;

public class parent {
	// *상속의 특징
	// 1) 동시에 다중 상속이 안된다
	// 2) 상속의 횟수에 제한이 없다
	// -> mp3클래스는 camera클래스의 자식 클래스이면서 phone클래스의 부모 클래스가 될 수 있다
	// 3) 모든 클래스는 object(최상위 클래스)를 상속받는다
	// object : 클래스 공통의 조상
	
	
	// 기존, 부모, 상위, 슈퍼 클래스
	// 한식당
	public void makekimchi() {
		System.out.println("보글보글 김치찌개를 만들어요");
	}
	public void makejjukkumi() {
		System.out.println("맵고 달콤한 쭈꾸미볶음을 만들어요");
	}
}
