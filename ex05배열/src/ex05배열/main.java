package ex05배열;

public class main {
	public static void main(String[] args) {
		// 객체 생성 공간 - 메인 메서드 앞에
		// 객체 생성 방법
		//  설계도의 이름 객체명 = new 설계도의 이름
		Person p1 = new Person();
		System.out.println(p1);
		// 객체 -> 레퍼런스 자료형
		// 1) 객체의 실제 데이터 접근법
		p1.age = 15;
		p1.name = "이타도리 유지";
		p1.gender = "남자";
		p1.jujutsu();
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.gender);
		
		// 초기화 시킬 필드의 개수에 따라서
		// 메인 클래스의 코드의 줄이 비례하는
		// 방식이 아닌 다른 방식
		// person() -> Constructor(생성자)
		// -> 객체를 생성하는 생성자이면서 메서드의 한 종류
		// = 기본 생성자 : 객체를 생성
		// * 일반적으로 클래스 생성시, 기본 생성자 자동생성
		// 다만 명시되지 않는다
		// person(16,"후시구로 메구미");
		// = 객체 생성 + 필드값 초기화
		// 전달 인자가 있는 생성자 -> person 클래스에서 새롭게 생성
		Person p2 = new Person(16,"후시구로 메구미","남자");
		
		age = age;
		name = name;
		gender = gender;
	}
	
}
