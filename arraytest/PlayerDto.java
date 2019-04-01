package com.kitri.array;

//Dto : Data Transfer Object 
//Vo	:	Value Object
//Bean 
public class PlayerDto {
	//팀은 하나의 팀이라가정.												필드
	private int number; //primary 키가 되겟지.							등번호
	private String name;  //항상 외부에서 못접근하게  					선수명
	private int position;  //항상 외부에서 못접근하게  					역할
	private double grade;										//				성적
	private String positionStr [] = {"지명타자","투수","포수","1루수","2루수","3루수","유격수","좌익수","중견수","우익수"};
	
	
	public PlayerDto(int number, String name, int position, double grade) {//원래는 생성자 안만든다.
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
		return "PlayerDto [등번호=" + number + ", \t선수명=" + name + 
				",\t포지션=" + positionStr[position] + ",\t" +	(position != 1 ? "타율" : "방어률") + "=" + grade +"]";
	}
	
	
	
	
}
//
////메소드관리가어렵다 
//String name = "안효인"
//String id = "jav"
//String pass = "2134"
//String email = "qwes"
//int age = 30;


//xx.register(n , id ,pass, em....);

//public int register(S n S id S) {
	

