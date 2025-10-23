package 닌텐도;

public class main {

	public static void main(String[] args) {
		// 4개의 클래스에 대한 객체 생성 --> 닌텐도의 게임칩 꺼내옴
		// (dongmul, pokemon, kirby, mario)
		// * 부모 클래스 : gamechip
		// 자식 클래스 : pokemon, kirby, mario, dongmul
		// 공통된 메서드 gamestart 실행 희망 -> on 메서드 이용
		
		gamechip dong = new dongmul(); 
		on(dong);
		gamechip kir = new kirby();
		on(kir);
		gamechip poke = new pokemon();
		on(poke);
		gamechip mar = new mario();
		on(mar);
		
		
	}
	// 게임칩을 꺼내서 기기(on메서드)에 장착
	private static void on(gamechip gc) {
		// pokemon, mario, kirby, dongmul 모두 상속받는 
		// gamechip을 매개변수로 기입
		gc.gamestart();
	}

}
