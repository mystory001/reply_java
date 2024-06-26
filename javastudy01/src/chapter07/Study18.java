package chapter07;

public class Study18 {
	
	public static void main(String[] args) {

		//인터페이스(interface)
		//추상 메서드의 집합
		//구현된 것이 전혀 없는 설계도. 모든 멤버가 public
		//cf) 추상 클래스와 인터페이스 비교
		//=> 추상 클래스는 일반 클래스에 추상 메서드를 가지고 있음, 인터페이스는 추상 메서드만 가지고 있음
		//interface 인터페이스이름{
		//	public staic final 타입 상수이름 = 값;  //상수. 변수를 가질 수 없음
		//	public abstract 메서드이름(매개변수목록); //추상메서드
		//}
		
		//인터페이스의 상속
		//인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상이 아님)
		//다중 상속(조상이 여러 개)이 가능(추상 메서드는 충돌해도 문제 없음)
		// ㄴ선언부가 다르면 둘 다 상속받으면 됨, 선언부가 같고 구현부가 다르면 어느쪽을 상속받을지 결정할 수 없음
		
		//인터페이스(미완성 설계도 => 완성)의 구현
		//인터페이스에 정의된 추상 메서드를 완성하는 것
		//추상클래스 완성과 동일(implements 키워드만 사용한다는 점과 차이)
		//class 클래스이름 implements 인터페이승름{
		//  인터페이스에 정의된 추상메서드를 모두 구현해야함
		//}
		//일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함
		
		//※구현 => 미완성을 완성된 설계도로 만드는 것. 구현부를 만드는 것
		//추상 클래스와 인터페이스의 차이? => 인터페이스는 iv를 가질 수 없음
		
	}

}
