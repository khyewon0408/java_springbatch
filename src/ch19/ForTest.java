package ch19;

public class ForTest {

	public static void main(String[] args) {
		int count =1;
		int sum = 0;
		
		for( int i = 0 ; i<20; i++, count++) {  //10¹ø
			sum += count;
			//count++;
		}
		System.out.println(sum);
		
		
		int num = 1;
		int total = 0;
		
		while( num <= 20) {
			total += num;
			num++;
		}
		System.out.println(total);

	}

}
