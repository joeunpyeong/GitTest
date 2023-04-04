package pack01_if;

import java.util.Scanner;

public class TestIf {
	public static void main(String[] args) {
		//민증--------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("민증 앞자리 : ");
		int code = Integer.parseInt(sc.nextLine());
		
		System.out.print("민증의 사용자의 성별은 ");
		if(code==1 || code==3) {
			System.out.println("남자입니다");
		}else if(code==2 || code==4) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("알 수 없습니다.");
		}
		//-주사위 값-----------------------------------------
		int random = (int)(Math.random()*6)+1;
		System.out.print("랜덤값 = ");
		if(random==1) {
			System.out.println("1");
		}else if(random==2) {
			System.out.println("2");
		}else if(random==3) {
			System.out.println("3");
		}else if(random==4) {
			System.out.println("4");
		}else if(random==5) {
			System.out.println("5");
		}else if(random==6) {
			System.out.println("6");
		}
		//-주사위 대결----------------------------------------
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그 외에는 시작");
		int dice1 = Integer.parseInt(sc.nextLine());
		
		if(dice1 == -1) {
			System.out.println("\n게임이 종료됩니다.");
		}else {
			System.out.println("게임 시작!");
			System.out.println("사용자가 주사위를 굴릴 차례입니다(굴리기 ENTER)");
			sc.nextLine();
			int dice0 = (int)(Math.random()*6)+1;
			System.out.println("사용자의 주사위 : " + dice0);
			System.out.print("컴퓨터의 주사위 : ");
			int dice2 = (int)(Math.random()*6)+1;
			System.out.println(dice2);
		
			if(dice1 > dice2 ) {
				System.out.println("결과 : 사용자가 이겼습니다.");
			}else if(dice1 < dice2) {
				System.out.println("결과 : 컴퓨터가 이겼습니다.");
			}else {
				System.out.println("결과 : 무승부입니다.");
			}
		
		}
	}
}
