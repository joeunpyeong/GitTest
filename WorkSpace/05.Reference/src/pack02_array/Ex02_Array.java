package pack02_array;

public class Ex02_Array {
	public static void main(String[] args) {
		//1.크기가 10의 크기를 가진 int형 배열을 만들고 값을 1에서 10까지 할당하고 출력하기.
		
		int[] array = new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			array[i]= (i+1)*10;
			System.out.println("array["+i+"]="+array[i]);
			sum+=array[i];
		}
		System.out.println("array의 합"+sum);
		int avg=sum/10;
		System.out.println("array의 평균"+avg);
		
	}
}
