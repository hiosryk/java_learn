public class IfElseTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		/*
		if(x > y) {
			System.out.println(x + "�� " + y + "���� ũ��.");
		} else {
			System.out.println(x + "�� " + y + "���� �۴�.");
		}
		*/
		String ds;
		if(x == y) {
			ds = "����.";
		} else {
			if(x > y) {
				ds = "ũ��.";
			} else {
				ds = "�۴�.";
			}
		}
		System.out.println(x + "�� " + y + "���� " + ds);


		//���� ���� if ~ else


		System.out.println("���α׷� ����!!!!");
	}
}