package pack01_if;

public class Ex03_Ifif {
	public static void main(String[] args) {
		// 블럭킹 => {   } ( 지역 )
		// int num1 = 10; (변수를 초기화 시키면 메모리 어느 부분에 값이 저장되고 우리는 변수명으로 찾아서쓴다.)
		// 변수는 언제까지 메모리에 저장이 되어있을까?
		int num1 = 10;
		System.out.println(num1);
		if ( num1 == 10) {
			//int num1 = 10; // 1. 여기는 왜 오류일까?	//1.main에서 선언 되었고 사라지지 않았기 때문에
			
			int num2 = 10;// 2.언제까지 사용이 가능할까?	//2.언급된 if안에서만 사용이 가능
			System.out.println(num2);
		}
		
		// Java의 모든 개념(98%)은 블럭킹을 기준으로 설명이 가능하다.
		
		{
			//main내부에 다른 지역을 만듬.
			//num2라는 변수는 이미 같은 이름으로 사용이 된 적이 있음.
			//그렇다면 변수 선언이 오류가 나야하는데 안나오고있음. 왜일까?	
			int num2 = 10;//<=3. 이거는 왜 오류아님???	//3.if안에서 선언되어 if가 끝남과 동시에 사라졌기 때문에
		}
		
		
		
	}
} 



