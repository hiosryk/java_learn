package com.kitri.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		Car car[] = new Car[6];
		//System.out.println(car[0].getCarName()); //�� �տ��� null�̴�. �� ī��0��°�� ������? ��簴ü�� �����ڰ�ȣ��Ǿ��ϴ°�.
		//�ڵ����� ������ִ� �������� ������ϻ�. 
		car[0]= new Car("�Ÿ", "��", "����");
		car[1]= new Car("K5", "���", "���");
		car[2]= new Car("SM5", "����", "�Ｚ");
		car[3]= new Car("�ƹݶ�", "���", "����");
		car[4]= new Car("�Ͼ��", "��ѱ��", "���");
		car[5]= new Car("��Ÿ��", "������", "����");
//		System.out.println(car[0].getCarName());
		int len = car.length;
		for(int i=0;i<len;i++) {
			System.out.println(i + 1 + "��°���� : " + car[i]);
		}
		//�����忡������ �Ͼ�� ������� ��ã�پ� �Ͼ�� ���°�ִ���
		//		Q.��ѱ�� �Ͼ��(���)�� 5��°�� �ֽ��ϴ�. ������ �غ���.
		//		
//		String name = "�Ͼ��";
		String name = "QM5";
//		for(int i=0; i<len; i++) {
			//QM5�� �����ϴ�.
//			if(name.equals(car[i].getCarName())) { //���ڿ��񱳴� equals�� 
//				System.out.println(car[i].getColor() + " " + car[i].getCarName() +  "(" + car[i].getMaker() + ")�� " + 
//						(i + 1) + "��° ������ �ֽ��ϴ�.") ;
//				break;
//		
				Car findCar = null;
				int count = 0;
				for(int i=0;i<len;i++) {
					//QM5�� �����ϴ�.�� �̾ƺ���. �ð������ֽ�. �ڹٿ��������°Ծƴϴ�. �̷�����.
					//���ϴ� �����͸� �迭�̳� �÷��ǿ��� ���ϴµ����͸� �̾Ƴ��°�. �ִ���. �̾ƺ�����.
					//
					if(name.equals(car[i].getCarName())) { //���ڿ��񱳴� equals�� 
//						System.out.println(car[i].getColor() + " " + car[i].getCarName() +  "(" + car[i].getMaker() + ")�� " + 
//								(i + 1) + "��° ������ �ֽ��ϴ�.") ;
						findCar= car[i];
						count = i + 1 ;
						break;
					}	 
				}
				if ( findCar != null ) {
					System.out.println(findCar.getColor() + " " +
							findCar.getCarName() + "(" + findCar.getMaker() + ")��" +
							count + "��°������ �ֽ��ϴ�.");
				} else {
					System.out.println( name + "�� �����ϴ�.");
				}
						
		//������ ��û����. �÷��� �迭. ���ϴ� ��ü�� ã�Ƴ���. ��û���� ���� �ҰŴ�. 
	}

}
