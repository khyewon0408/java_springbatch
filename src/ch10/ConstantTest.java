package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		//MAX_NUM =20; final ����� ���� ������ �� ����. 
		final int MIN_NUM ;
		
		System.out.println(MAX_NUM);
		//System.out.println(MIN_NUM); ��� ���� �� ���� �޵�� ��������� ��.
		
		MIN_NUM =10;
		System.out.println(MIN_NUM);
		
	}

}
