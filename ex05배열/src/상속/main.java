package 상속;

public class main {
	public static void main(String[] args) {
		// 1. 부모 클래스의 객체 생성하기
		// parent 클래스의 메서드를 사용하기 위함
		// 1,2번 완료시 -> parent 클래스의 메서드 호출
		parent p1 = new parent();
		p1.makekimchi();
		p1.makejjukkumi();
		// 형변환(자료형 변환, data type casting)
		// 하나의 데이터 타입을 다른 타입으로 변경하는 것
		parent p2 = new child();
		p2.makekimchi();
		p2.makejjukkumi();
		// 자식 클래스의 생성자를 활용해서 객체 생성하여
		// 부모 자료형의 p2 객체에 할당한다
		// int num = 10;
		// + 부모 클래스를 만드는데 자식의 설계도를 가지고 와서 만든다
		
		// 1) 업캐스팅(UpCasting) 	
		// 자식(서브)클래스가 부모(슈퍼)클래스 타입으로 자동 형변환하는 것
		// + 자식이 재정의한 삼겹살 김치찌개를 부모도 사용하고 싶음
		
		// 2) 다운캐스팅
		// - 전제 조건 : 업캐스팅된 객체만 다운캐스팅 가능하다
		// *업캐스팅된 객체를 강제 형변환하여 본래의 자료형으로 되돌리는 것
		child c2 = (child)p2;
		// --> 업캐스팅된 객체만 다운캐스팅 가능한데
		// 자식 클래스의 생성자를 이용해서 객체 생성했기에
		// 본래의 자식 클래스로 돌아간다
		// *오버라이딩된 메서드가 있는 경우
		// 부모 클래스의 메서드가 아닌 오버라이딩된 메서드가 호출된다
		// 업캐스팅된 객체 : p2, 다운캐스팅 객체 : c2
		// 목적 : 자식 클래스에서만 정의한 메서드를 활용하기 위함
		// 업캐스팅을 한 경우에는 자식 클래스에서만 정의한 메서드 접근 불가
		System.out.println("===== 다운캐스팅 이후");
		p2.makekimchi();
		c2.makejeyuk();
		
		// child c2 = new parent();
		
		// 자식 클래스의 생성자를 활용한다고 해서
		// 자식 클래스의 모든 메서드 접근 가능 X
		// -> 자식 클래스의 오버라이딩된 메서드 접근, 호출 가능
		
		
		
		// 2. 자식 클래스의 객체 생성하기
		// child 클래스의 메서드를 사용하기 위함
		child c1 = new child();
		c1.makekimchi();
		c1.makejjukkumi();
		c1.makejeyuk();
		
	}
}
