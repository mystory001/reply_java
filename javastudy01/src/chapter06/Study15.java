package chapter06;

public class Study15 {

	public static void main(String[] args) {
		
		//static 메서드와 인스턴스 메서드
		//static이 붙지 않은 것 => 인스턴스 메서드
		//static이 붙은 것 => static 메서드(클래스 메서드)
		//iv 사용 여부
		
		//인스턴스 메서드
		//인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
		//인스턴스 멤버(iv)와 관련된 작업을 하는 메서드
		//메서드 내에서 인스턴스 변수(iv) 사용 가능
		
		//static 메서드(클래스 메서드)
		//객체생성없이 '클래스이름.메서드이름()'으로 호출
		//인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
		//메서드 내에서 인스턴스 변수(iv) 사용 불가
		
		//static을 붙어야 할 때, 언제 사용?
		//속성(멤버 변수) 중에서 공통 속성에 static을 붙임
		//인스턴스 멤버(iv, im)을 사용하지 않는 메서드에 static을 붙힘
		
		//메서드 간 호출과 참조
		//static 메서드는 인스턴스 변수를 사용할 수 없음
		//static 메서드는 인스턴스 메서드를 호출할 수 없음

		//static 메서드는 인스턴스 멤버(iv, im)을 사용할 수 없는지?
		//->static 메서드 호출 시 객체(iv 묶음)가 없을 수도 있기 때문
		
	}

}