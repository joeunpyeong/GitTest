package pack08_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10; // ������ ���� a�� �ʱ�ȭ �ϰ� 10�� ��Ƶ�
		double dNum = iNum; //�� ū Ÿ�Կ� ���� Ÿ���� ������ �ڵ�
							//��ȯ�� �Ͼ(�ڵ� ����ȯ)
		System.out.println(iNum);
		System.out.println(dNum);
		//�ڵ�����ȯ�� �߻��� ���� Ÿ��(int) => ū Ÿ��(double)
		//������ ����ȯ , Upcasting
		double dNum2 = 30.5;
		//int iNum2 = dNum2;  ūŸ�� => ���� ������ Ÿ��
		//������ ����ȣ�� , DownCasting ==> Casting�� �Ϲ����� �ǹ�
		int iNum2 = (int) dNum2;
		System.out.println(dNum2);
		System.out.println(iNum2);
		//DownCasting�� ������ �߻���. ǥ���� �� ���� �����͸� ��������.
		//�������� �ŷڼ�, ���ռ��� ������ ���ɼ��� ũ�⶧���� ����
		
		//long => int , int =>float
		//���� ���ڸ� ǥ���ϴ� ������ Ÿ�Գ����� ������.
		//byte < int
		
		int a = 10;
		byte b = (byte)a;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}
}