public class WhileLotto {
	public static void main(String[] args) {
		

		System.out.println("1~3까지의 수중 난수 발생.");
		boolean flag = true;
		int num1 = 0; 
		while(flag) { 
			num1 = (int)(Math.random() * 3) + 1; //1~3
			if(numb1 !=num2) {
			System.out.println("number ==" +number);
			} else {
			System.out.println("0이 발생(" + cnt + "번째)되어 프로그램 종료!!!!");
				flag= false;






		//int num1, num2, num3;
		int num1 = (int) (Math.random() * 3) + 1;
		int num2 = 0;
		int num3 = 0;
		for(;;) {
			num2 = (int) (Math.random() * 3) + 1;
			if(num1 != num2) {
				break;
			}
		}

		for(;;) {
			num3 = (int) (Math.random() * 3) + 1;
			if(num1 != num3 && num2 != num3) {
				break;
			}
		}
		System.out.println("금주 당첨 번호 : " + num1 + " " + num2 + " " + num3);
	}
}

        