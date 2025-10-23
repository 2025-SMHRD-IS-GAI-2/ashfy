package ex05배열;

public class Person {
	
	// 설계도 용도 -> 객체 설계용
	// 나만의 자료형을 만들기 위함.
	// 1. field(속성, 데이터)
	// -> 공통적인 특성
	// 변수 선언만 한다 -> 할당 X
	// 공통적인 속성의 개별 데이터가 들어갈 공간만 만든다
	int age;
	String name;
	String gender;
	// 여러분이 만든 모든 필드값을 한번에 초기화 시켜주는 성
	public Person(int age, String name, String gender) {
		// 메인 클래스에서 전달한 데이터를 이용해서
		// 초기화 필요(할당) -> p1.age = 30;
		// 동일한 변수명이 있는 경우, 가장 근접한 곳의 변수로 인식한다
		// -> this. 키워드 추가하면 해당 클래스의 변수로 인식한다
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	// 기즌 생성자 메소드
	// 1. 리턴 타입 x
	// 2. 메소드명이 클래스(설계도랑 똑같음);
	//3 3. 생성자는 new 키워드를 통해서만 이루어진다
	// 객체를 생성할때 한번만 호 
	
	// 2. method(기능, 로직)
	public void jujutsu() {
		System.out.println("어주자, 적혈조술");
		
		
		
		
		
		
		
		
	}
	
}
