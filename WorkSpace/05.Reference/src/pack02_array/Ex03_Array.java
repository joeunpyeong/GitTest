package pack02_array;

public class Ex03_Array {
	public static void main(String[] args) {
		//argumets(인수,파라미터) : main메소드 실행 전 필요한 것
		//예)버전정보
		//System.out.println(args[0]);
		
		//데이터타입[]배열이름=new 데이터타입[크기]
		//내가 알고 있는 모든 것들 < =
		//String 타입을 가지는 배열 크기는 10으로 만들어보기
//		String[]sArr = new String[1];
//		System.out.println(sArr[0]);
		//args=new String[1];//코드로 푸는 방법
		System.out.println(args[0]);
		
		//int[0]초기값 0 <-숫자형태의 변수타입은 전부 0
		//String초기값 null <-참조형 변수들의 초기값
		
		//String[]animals = new String[3];
		
		String[]animals= {"강아지","고양이","비둘기"};
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		
		int[] intArray= {1,2,3,4,5,6,7,8,9};
		
		
		
		
		//{}< = 배열을 초기화하는 방법중에 값의 갯수에 따라서 배열의 크기를 가변적으로 사용가능한
		// 		방법이 있다. 이 방법은 많이 사용이 안됨. 이유가 뭘까?
		
		
	}
}
