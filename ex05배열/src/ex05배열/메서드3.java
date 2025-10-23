package ex05배열;

import java.util.Scanner;

public class 메서드3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별 입력 >> ");
		String gender = sc.next();
		printGen(gender);
		todayWeather();
		System.out.println(getName());	
}
private Static Stiring getName() {
	return "omg";
}	
private Static void todayWeather() {
	System.out.println("오늘 날씨 맑음");
}	
private Static void printGen(String gender) {
	System.out.println("성별은 "+ gender);
	}
}
// 접근 제한자 : 타 클래스, 패키지 등에서 접근 가능 여부
// 1) public : 모든 패키지에서 접근 가능
// 2) private : 같은 클래스에서만 접근 가능
// 3) default : 다른 패키지에서 접근 불가
// 4) protected : 다른 패키지에서 접근 불가, 상속시에는 가능