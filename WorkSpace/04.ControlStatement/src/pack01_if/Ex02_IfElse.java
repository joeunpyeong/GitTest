package pack01_if;

import java.util.Scanner;

public class Ex02_IfElse {
	public static void main(String[] args) {
		//if문 : 단순 if(조건식을 주고 해당하는 조건식이 true인 경우의 블럭킹(지역{})을 만들어서 코드실행)
		//if-else문: 단순if문은 조건식이 true일때만 실행이되는 번거로움이 있음.
		//if의 조건식이 true가 아닌 false라면 else라는 키워드를 if문 뒤에 붙여서 false실행부를 만드는 것
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력 : ");
		int score = Integer.parseInt(sc.nextLine());
		
		if((score%2)==0) {
			System.out.println("짝수"); //true일 때 실행
		}else{
			System.out.println("홀수"); //false일 때 씰행
		}
		
		System.out.print("num1을 입력 :");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("num2를 입력 :");
		int num2 = Integer.parseInt(sc.nextLine());
		if(num1<num2) {
			System.out.println(num1 +"<"+ num2);
		}else {
			System.out.println(num1 +">"+ num2);
		}
		
		
	}
}
