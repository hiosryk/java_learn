package com.kitri.pos.sales;

public class PosDto {

	// 필드 선언

	private int point; // 포인트
	private String phone; // 핸드폰번호
	private String membershipId; // 맴버쉽아이디
	private String memberName; // 멤버쉽 회원 이름

	

	//추가*************************************HS
	private String productCode;
	private String inDate;
	private String productName;
	private int price; // 가격
	private String realExp;
	private int volume; // 수량
	//****************************************
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getInDate() {
		return inDate;
	}
	
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getRealExp() {
		return realExp;
	}
	
	public void setRealExp(String realExp) {
		this.realExp = realExp;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}