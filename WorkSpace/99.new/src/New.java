import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //��ĳ�� �غ�
		
		int power, agi, inte, nar, app, hp=1, money, st, st1;
		//����
		//if, hp�� 0�̸� break �� �ؼ� while(reStart==1)�� ������
		// 1�̻��̸� continue(���� �Ƚᵵ ��)
		while(true) {
			//while(hp>0) {  
				System.out.println("���� �̸� \n�г����� �Է����ּ���");
				System.out.print("������� �г��� : ");
				String userName = sc.nextLine(); //String userName  ���� �г���	
		
				System.out.println("enter�� ������ ������ �ɷ�ġ�� ��带 ȹ���մϴ�.");
				sc.nextLine();
		
				System.out.print("  �� : ");
				power = (int)(Math.random()*10)+1;
				System.out.println(power);

				System.out.print("��ø : ");
				agi = (int)(Math.random()*10)+1;
				System.out.println(agi);

				System.out.print("���� : ");
				inte = (int)(Math.random()*10)+1;
				System.out.println(inte);

				System.out.print("ȭ�� : ");
				nar = (int)(Math.random()*10)+1;
				System.out.println(nar);
		
				System.out.print("�ܸ� : ");
				app = (int)(Math.random()*10)+1;
				System.out.println(app);
		
				System.out.print("ü�� : ");
				hp = (int)(Math.random()*10)+1;
				System.out.println(app);

				System.out.print("������ �ݾ� : ");
				money = ((int)(Math.random()*10)+1)*100;
				System.out.println(money+"gold");

				System.out.println("�� ������ ���۵Ǹ� ���������� ���ž��մϴ�.\n");
		
				//1
				System.out.println("�� �ٶ��� ���� �� ����� ��â�� �� �ӿ��� �������� ��ġ�� ������ϴ�.\n�и� �� �ȿ��� �������ϴµ� ������.\n");
				System.out.println("1.�������� ���ƴٳ� ����. 2.���� ���� �ö󰡼� ������ ���ɴ�.");
		
				System.out.print("= >");
				st = Integer.parseInt(sc.nextLine());
				if(st==1) { //1-1
					System.out.println("��â�� �� ���� ���ƴٴϴ� �� �糪�� �����(��:2 ,��ø 3)�� �����ƽ��ϴ�. �ο�ðڽ��ϱ�?\n 1.�ο�� 2.����ģ��");
					System.out.print("= >");
					st1 = Integer.parseInt(sc.nextLine());
					if(st1==1) {//1-1-1
						if(agi>=4) {//1-1-1.1
							System.out.println("�糪�� ����̸� �ѾƳ½��ϴ�.");
							System.out.print("����� �Ǳ����ϰ� ���� �����ϴ�. �ȴٺ��� ");
						}else {//1-1-1.2
							System.out.println("����� ����� ����� ����̿��� ���Ƚ��ϴ�.");
							hp-=2;
							System.out.println("(ü���� 2 �����߽��ϴ�. ���� ü�� :"+hp+")");
							System.out.print("����� ��ģ ���� �̲��� �ȴٺ��� ");
						}
					}else if(st1==2) { //1-1-2
						if(agi>=4) {//1-1-2.1
							System.out.println("����� ������ �����ƽ��ϴ�.");
							System.out.println("����ģ ����� �쿬�� ");
						}else {//1-1-2.2
							System.out.println("����ġ�� ���� �ڸ� �Ѿƿ��� ����̿��� ���Ƚ��ϴ�.");
							hp-=2;
							System.out.println("(ü���� 2 �����߽��ϴ�. ���� ü�� :"+hp+")");
							System.out.print("����� ��ģ ���� �̲��� �ȴٺ��� ");
						}
					}
					System.out.println("���� ������ �߰��߽��ϴ�.");
				}else if(st==2){//1-2
					System.out.println("���� ������ �����ٺ��� �� ���� �ȵǴ� ���� ���� ������ ���Դϴ�.");
				}
			
				//2
				System.out.print("\n����� ������ �����߽��ϴ�. ������ ���ƴٴϷ��� ����\n�ΰ����� ���� ���� ����� ����� �̸��� �����ϴ�."
								+ "�˷��ְ� ���� �̸��� �Է��ϼ���. \n �� �̸���");	
				String sSay = sc.nextLine();
				if(userName == sSay) {//2-1
					System.out.println("");  
				}else {  //2-2
					System.out.println("");  
				}
		
			
		
			//}
		}
	}
}
//int random = (int)(Math.random()*6)+1;   ������ ����� �����Լ�

//�ɷ�ġ ��power, �ں�money, ��øagi, ����inte, ȭ��nar, �ܸ�app, �ǰ�helth
//sSay(����������� �˷��� �̸�), ����coin(���� �÷��� Ƚ��), st����(�÷��̾ ������ ����)
//String userName  ���� �г���