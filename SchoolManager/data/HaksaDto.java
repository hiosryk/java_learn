//학사관리 Entity
//if for 
//int len = array.length;
//for (int i = 0; i < len; i++) {
//	
//}
package com.kitri.haksa.data;

public class HaksaDto {
	private int age;// 접근제어를 외부에서 못하게 막아놓은 멤버변수들 
	private int key;
	private String value;
	private String name;
	//생성자 - 리턴명을 명시하지않는다. 클래스명. 오버로딩가능
	public HaksaDto(int age, String name, int key, String value) { //인자값으로 초기화
		super(); //인자값이 있는 생성자를 만들면 디폴트 생성자가 생기지 않는다.
		this.age = age;
		this.key = key;
		this.value = value;
		this.name = name; 
	}
	
	//getter,setter							private 멤버 변수를 읽기위해 get 메소드 , 값을 넣기위해 set 메소드를 사용.
	public int getAge() {							//getter에는 return 값을, setter 넣을값.
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
