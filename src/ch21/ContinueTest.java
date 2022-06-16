package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		for( num = 1; num <= 100; num++) {
			
			if( (num % 3) != 0)  continue;
			//조건이 맞는 경우(true 이면) 이후 반복문 블럭 내부의 다른 수행문들을 수행하지 않음
			
			System.out.println(num);
			
		}

	}

}
