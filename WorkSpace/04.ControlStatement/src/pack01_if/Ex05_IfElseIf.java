package pack01_if;

import java.util.Scanner;

public class Ex05_IfElseIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력 : ");
		int score = Integer.parseInt(sc.nextLine());
		
//		if(score >=90) {
//			System.out.println("A등급");
//		}
//		if(score >=80 && score <90) {
//			System.out.println("B등급");
//		}
//		if(score >=70 && score <80) {
//			System.out.println("C등급");
//		}
//		if(score <70) {
//			System.out.println("D등급");
//		}
		
		if(score>=90) {
			System.out.println("A등급");
		}else if(score>=80) {
			System.out.println("B등급");
		}else if(score>=70) {
			System.out.println("C등급");
		}else {
			System.out.println("D등급");
		}
		
	}
}
