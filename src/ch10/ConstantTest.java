package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		//MAX_NUM =20; final 상수는 값을 변경할 수 없다. 
		final int MIN_NUM ;
		
		System.out.println(MAX_NUM);
		//System.out.println(MIN_NUM); 상수 선언 후 값을 받드시 지정해줘야 함.
		
		MIN_NUM =10;
		System.out.println(MIN_NUM);
		
	}

}
