package api02.util.vector;

import java.util.Vector;

/*
 java.util.Vector
 - 컬렉션 프레임웍에서 가장 많이 사용되는 컬렉션 클래스
 - 객체만 저장할 수 있으면, 기본데이터타입은 저장 불가능
 - 배열의 단점인 메모리 낭비를 피할 수 있는 구조
 - Thread 에 안정적인 컬렉션 클래스
 - 동적 크기 변경이 가능
 */
public class AddDemo {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		String admin = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("password"));
		vec.add(String.valueOf(23));   // valueOf() 는 숫자를 문자열화 시킴
		vec.add(String.valueOf(gender));
		vec.add(admin);
		
		System.out.println("백터에 담긴 내몸 출력");
		/*
		 for loop 에서 limit 부분을 보시면
		 배열에서 쓰는 length() 가 아니라
		 size() 를 쓴 것에 주의 !!!
		 */
		/*
		 배열이 인댁스가 0부터 시작하는 것처럼
		 백터도 인댁스가 0부터 시작합니다.
		 그래서 아래 예제에서 i+1 로 줌.
		 */
		for(int i=0;i<vec.size();i++){
			System.out.println("백터에 들어있는"
					+(i+1)+"번째 요소는"
					+ vec.elementAt(i)
					+ "입니다.");
		}
		/*
		 출력시키는 메소드도 elementAt()
		 인 것에 주의 !!!
		 배열과 다릅니다.
		 */
	}
}











