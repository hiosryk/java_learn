/* 
 lotto 
 1-3������ ���δٸ� ���� 3���߻�.

*/
public class ForLotto2 {
	public static void main(String[] args) {
	//	int num1, num2, num3;
	int num1 = (int) (Math.random()*3+1);
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	int num5 = 0;
	int num6 = 0; 
	

	for(;;) {
		num2 = (int) (Math.random()*3+1);
		if(num1 != num2) {
			break;
		}
	
	}

	for(;;) {
		num3 = (int) (Math.random()*3+1);
		if(num1 != num3 && num2 != num3) {
			break;
		}

	}

	for(;;) {
		num4 = (int) (Math.random()*3+1);
		if(num1 != num3 && num2 != num3) {
			break;
		}

	}
	System.out.println("���� ��÷ ��ȣ " + num1 + " " + num2 + " " +  num3);
	}
}