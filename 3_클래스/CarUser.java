public class CarUser {
	public static void main(String[] args) {
		 //null �� �޸𸮿��ø����ʾҴ�. �������ʾҴ�. �ּҰ��̾���.
		Car car1 = new Car(); //���������� �ʱ�ȭ���ϸ� �ڵ����� null�� �ʱ�ȭ�ȴ�. ���ڴ� 0���� �ʱ�ȭ�ȴ�.
		
		System.out.println(" 1. ���̸� : " + car1.carName + " " + car1.speed + " ���� " + car1.color + " ������ "+ car1.maker );
		car1.carName = "�Ÿ";
		car1.color = "������";
		car1.maker = "����";
		
		System.out.println(" 2. ���̸� : " + car1.carName + " " + car1.speed + " ���� " + car1.color + " ������ "+ car1.maker );
		
		Car car2 = new Car(); //null �� ���� �ؾ �������ϱ� �ٽ� ��� �� �־�߰���?
		System.out.println(" Z. ���̸� : " + car2.carName + " " + car2.speed + " ���� " + car2.color + " ������ "+ car2.maker );
		car2.carName = "K5";
		car2.color = "���";
		car2.maker = "���";
		System.out.println(" ZZ. ���̸� : " + car2.carName + " " + car2.speed + " ���� " + car2.color + " ������ "+ car2.maker );
		
	}
}
