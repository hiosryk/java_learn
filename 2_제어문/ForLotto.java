/*
* Lotto
1 - 3까지의 서로다른 난수 3개 발생.
*/

public class ForLotto {
	public static void main(String[] args) {
		int num1= 0, num2= 0, num3= 0;
		num1 = (int)(Math.random() * 3) + 1;
		
		System.out.println(num1);

		if(num2 == num1){ 
					 num2 = (int)(Math.random() * 3) + 1;
		System.out.println(num2);

		} 
		
		if (num3 == num1 || num3 == num2){
			 num3 = (int)(Math.random() * 3) + 1;
		
		System.out.println(num3);

		}





	}



}