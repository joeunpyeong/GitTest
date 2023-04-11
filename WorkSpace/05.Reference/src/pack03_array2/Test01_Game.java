package pack03_array2;

import java.util.Scanner;

public class Test01_Game {
	public static void main(String[] args) {

	while(true) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		System.out.println("고양이 찾기 게임이 시작되었습니다.");
		System.out.print("난이도를 입력 : ");
		int userNum = Integer.parseInt(sc.nextLine());
		System.out.println("난이도 : "+userNum);
		
		int[]array = new int[userNum];
		array[(int)(Math.random()*array.length)]=1;
		
		for(int i=0 ; i<userNum ; i++) {
			System.out.println("["+(i+1)+"번 상자]");
		}
		
	while(true) {
		System.out.print("상자번호를 입력하시오\n=>");
		int userAnswer= Integer.parseInt(sc.nextLine())-1;
		count+=1;
		
		if(userNum-1<userAnswer ||0>userAnswer) {
			System.out.println("재입력하세요.\n");
		}else if(array[userAnswer]==1) {
			System.out.println("고양이를 찾았습니다.\n");
			for(int i=0 ; i<userNum ; i++) {
				if(array[i]==1) {
					System.out.println("[고양이]");
					
				}else {
					System.out.println("["+(i+1)+"번 상자]");
				}
			}
			System.out.println("시도 횟수는 :"+ count +"번 입니다.\n\n\n\n");
			break;
		}else {
			System.out.println("고양이가 없습니다.\n");
			
		}
	}
		
	}
	}
}
