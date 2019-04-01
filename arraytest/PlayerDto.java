package com.kitri.array;

//Dto : Data Transfer Object 
//Vo	:	Value Object
//Bean 
public class PlayerDto {
	//���� �ϳ��� ���̶���.												�ʵ�
	private int number; //primary Ű�� �ǰ���.							���ȣ
	private String name;  //�׻� �ܺο��� �������ϰ�  					������
	private int position;  //�׻� �ܺο��� �������ϰ�  					����
	private double grade;										//				����
	private String positionStr [] = {"����Ÿ��","����","����","1���","2���","3���","���ݼ�","���ͼ�","�߰߼�","���ͼ�"};
	
	
	public PlayerDto(int number, String name, int position, double grade) {//������ ������ �ȸ����.
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PlayerDto [���ȣ=" + number + ", \t������=" + name + 
				",\t������=" + positionStr[position] + ",\t" +	(position != 1 ? "Ÿ��" : "����") + "=" + grade +"]";
	}
	
	
	
	
}
//
////�޼ҵ��������ƴ� 
//String name = "��ȿ��"
//String id = "jav"
//String pass = "2134"
//String email = "qwes"
//int age = 30;


//xx.register(n , id ,pass, em....);

//public int register(S n S id S) {
	

