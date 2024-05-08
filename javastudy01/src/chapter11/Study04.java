package chapter11;

public class Study04 {

	public static void main(String[] args) {

		//배열의 장, 단점
		//장점 : 배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근 시간, access time)이 짧음
		//단점 : 
		//1. 크기를 변경할 수 없음(실행중)
		//-크기를 변경해야 하는 경우 새로운 배열을 생성 후 데이터를 복사
		//※ 더 큰 배열을 생성 -> 기존 배열을 새로 만든 배열에 복사 -> 참조 변경
		//-크기 변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리가 낭비
		//2. 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸림
		//-데이터 추가, 삭제를 위해 다른 데이터를 옮겨야함
		//-순차적인 데이터 추가(끝에 추가)와 삭제(끝부터 삭제)는 빠름
		
		//LinkedList - 배열의 단점(크기 변경X, 추가, 삭제 시간 ↑)을 보완
		//장점
		//배열과 달리 LinkedList는 불연속적으로 존재하는 데이터를 연결(link)
		//배열은 삭제, LinkedList 기차에 비유
		//데이터 삭제 : 단 한 번의 참조변경만으로 가능
		//데이터 추가 : 한 번의 Node 객체생성과 두 번의 참조변경만으로 가능
		//단점
		//데이터 접근성이 나쁨
		//=> doubly linked list(더블리 링크드 리스트) 이중 연결리스트, 접근성 향상
		//=> doubly circular linked list : 이중 원형 연결리스
		
		//ArrayList와 LinkedList 성능비교
		//순차적으로 데이터를 추가/삭제 => ArrayList가 빠름
		//비순차적으로 데이터를 추가/삭제 => LinkedList가 빠름
		//접근시간(access time) => ArrayList가 빠름//(인덱스가 n인 데이터의 주소 = 배열의 주소 + n * 데이터타입의 크기 (n번째 요소))
		//ArrayList 배열 기반(연속), LinkedList 연결 기반(불연속)
		
		
		
		
	}
	
}
