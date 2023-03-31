

public class Test {
	public static void main(String[] args) {
		//변수 : 어떤 값을 저장해놓기 위한것(메모리)
		//변수는 타입이 있음:
		//1.숫자 - int(정수)※<long(정수)
		//		  float(실수) < double(실수)※
		//변수 규칙:
		//1.선언  : 변수타입 변수명;
		//2.할당  : 변수명 = 변수타입에 담을 수 있는 값;
		//3.초기화 :＾두가지를 한 번에 하는 것
		//변수타입 변수명 = 값;
		
		
	int iNum = 1;
	long lNum = 2L;
	
	float fNum = 1.1F;
	double dNum =2.2;
	
	System.out.println(iNum);
	//왜 오류일까? : 변수가 초기화가 되어야지만 사용이 가능
	//initialized(초기화)
	System.out.println(lNum);
	System.out.println(fNum);
	System.out.println(dNum);
	
	/*1.JavaProject의 왜 만드는지?
			
			2.java파일 만드는 이유?
					
			3.변수 타입과 변수의 전체적인 이해?
				
			4.변수 타입 변경(형변환,캐스팅)의 이해?
					
			5.Scanner로 입력 받은 데이터 타입 변경의 이해? */
	}
}
