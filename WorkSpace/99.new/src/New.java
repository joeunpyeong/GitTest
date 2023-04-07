import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 준비
		
		int st=0, st1=0; //스토리
		int power, agi, inte, nar, app, hp=1, money, fame=0; //능력치
		int cat=0; //장비,동물,도구
		String catName = null;
		//시작
		//if, hp가 0이면 break 을 해서 while(reStart==1)로 가도록
		// 1이상이면 continue(굳이 안써도 됨)
		while(true) {
			//while(hp>0) {  
				System.out.println("게임 이름 \n닉네임을 입력해주세요");
				System.out.print("사용자의 닉네임 : ");
				String userName = sc.nextLine(); //String userName  유저 닉네임	
		
				System.out.println("enter를 누르면 무작위 능력치와 골드를 획득합니다.");
				sc.nextLine();
		
				System.out.print("  힘 : ");
				power = (int)(Math.random()*10)+1;
				System.out.println(power);

				System.out.print("민첩 : ");
				agi = (int)(Math.random()*10)+1;
				System.out.println(agi);

				System.out.print("지능 : ");
				inte = (int)(Math.random()*10)+1;
				System.out.println(inte);

				System.out.print("화법 : ");
				nar = (int)(Math.random()*10)+1;
				System.out.println(nar);
		
				System.out.print("외모 : ");
				app = (int)(Math.random()*10)+1;
				System.out.println(app);
		
				System.out.print("체력 : ");
				hp = (int)(Math.random()*10)+1;
				System.out.println(hp);
				
				System.out.print("명성 : ");
				fame = (int)(Math.random()*10)+1;
				System.out.println(fame);

				System.out.print("보유한 금액 : ");
				money = ((int)(Math.random()*10)+1)*100;
				System.out.println(money+"gold");

				System.out.println("본 게임이 시작되면 선택지만을 고르셔야합니다.\n");
		
				//1
				System.out.println("찬 바람에 눈을 뜬 당신은 울창한 숲 속에서 나뭇잎을 헤치며 깨어났습니다.\n분명 집 안에서 깨어났어야하는데 말이죠.\n");
				System.out.println("1.여기저기 돌아다녀 본다. 2.나무 위에 올라가서 주위를 살핀다.");
			while(true) {
				System.out.print("=>");
				st = Integer.parseInt(sc.nextLine());
				if(st==1) { //1-1
					System.out.println("울창한 숲 속을 돌아다니던 중 사나운 고양이(힘:2 ,민첩 3)와 마주쳤습니다. 싸우시겠습니까?\n 1.싸운다(힘:2이상) 2.도망친다(민첩:3이상) 3.길들인다(지능:6이상)");
					System.out.print("=>");
					st1 = Integer.parseInt(sc.nextLine());
					if(st1==1) {//1-1-1
						if(agi>=4) {//1-1-1.1
							System.out.println("사나운 고양이를 쫓아냈습니다.");
							System.out.print("당신은 의기양양하게 길을 나섭니다. 걷다보니 ");
						}else {//1-1-1.2
							System.out.println("허약한 당신은 고양이 고양이에게 물렸습니다.");
							hp-=2;
							System.out.println("(체력이 2 감소했습니다. 현제 체력 :"+hp+")");
							System.out.print("당신은 지친 몸을 이끌며 걷다보니 ");
						}
						break;
					}else if(st1==2) { //1-1-2
						if(agi>=4) {//1-1-2.1
							System.out.println("당신은 무사히 도망쳤습니다.");
							System.out.println("도망친 당신은 우연히 ");
						}else {//1-1-2.2
							System.out.println("도망치는 도중 뒤를 쫓아오던 고양이에게 물렸습니다.");
							hp-=2;
							System.out.println("(체력이 2 감소했습니다. 현제 체력 :"+hp+")");
							System.out.print("당신은 지친 몸을 이끌며 걷다보니 ");
						}
						break;
					}else if(st1==3) {
						System.out.print("고양이에게 다가가 길들이기를 시도합니다.");
						if(inte>=6) {//1-1-2.1
							System.out.println("오래전 TV에서 본 지식을 통해 고양이를 길들일 수 있었지만 길들이는 과정에서 고양이에게 긁혔습니다.");
							hp--;
							System.out.println("(체력이 1 감소했습니다. 현제 체력 :"+hp+")");
							cat++;
							System.out.print("우여곡절 끝에 당신은 고양이를 길들였습니다. 앞으로 당신과 함께 있을 고양이의 이름을 지어주세요.\n=>");
							catName = sc.nextLine();
							System.out.println("당신은 고양이와 같이 길을 나서기 시작하자 ");
						}else {//1-1-2.2
							System.out.println("서툰 손길에 고양이가 흥분하며 당신을 할큅니다.");
							hp-=6;
							System.out.println("(체력이 6 감소했습니다. 현제 체력 :"+hp+")");
							System.out.print("당신은 지친 몸을 이끌며 걷다보니 ");
						}
						System.out.println("작은 마을을 발견했습니다.");
						break;
					}
					}else if(st==2){//1-2
						System.out.println("나무 위에서 내려다보니 몇 미터 안되는 곳에 작은 마을이 보입니다.");
						break;
					}else {
						System.out.println("존재하지 않는 선택지입니다. 다시 입력해 주세요.");
					}
				}
				//2
				System.out.print("\n당신은 마을 입구에 도착했습니다. 마을로 들어가려던 찰나\n피리를 든 사람이 당신에게 걸어오며 말을 겁니다.\n\"외지인이여 넌 누구지?\""
								+ "알려주고 싶은 이름을 입력하세요. \n 내 이름은  ");	
				String sSay = sc.nextLine();
				if(!userName .equals(sSay)) {  //   .equals()    ->문자열 비교 
					System.out.println("낯선 사람이 얼굴을 찌뿌리며 창을 들이댑니다. 그리고 서서히 입을 열기 시작했습니다. \"넌 지금 거짓말을 하고 있군\"");  
					fame--;
					System.out.println("(명성이 1 감소했습니다. 현제 체력 :"+fame+")");
				}
				System.out.print("\"너의 이름을 물어본게 아니다.");
				if(cat>1) {
					System.out.println("어찌 됐ㄷ..\"/n"+ "낯선 사람은 "+catName+"");
					
				}else {
					System.out.println("어찌 됬든.. 이 숲에서 당장 나가라. 경고는 여기까지다 한번 더 눈에 보인다면...\"");
				}
		
			
		
			//}
		}
	}
}
//int random = (int)(Math.random()*6)+1;   언젠가 사용할 랜덤함수

//능력치 힘power, 자본money, 민첩agi, 지능inte, 화법nar, 외모app, 건강helth
//sSay(마을사람에게 알려준 이름), 코인coin(게임 플레이 횟수), st숫자(플레이어가 선택한 숫자)
//String userName  유저 닉네임