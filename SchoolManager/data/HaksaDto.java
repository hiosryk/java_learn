//�л���� Entity
//if for 
//int len = array.length;
//for (int i = 0; i < len; i++) {
//	
//}
package com.kitri.haksa.data;

public class HaksaDto {
	private int age;// ������� �ܺο��� ���ϰ� ���Ƴ��� ��������� 
	private int key;
	private String value;
	private String name;
	//������ - ���ϸ��� ��������ʴ´�. Ŭ������. �����ε�����
	public HaksaDto(int age, String name, int key, String value) { //���ڰ����� �ʱ�ȭ
		super(); //���ڰ��� �ִ� �����ڸ� ����� ����Ʈ �����ڰ� ������ �ʴ´�.
		this.age = age;
		this.key = key;
		this.value = value;
		this.name = name; 
	}
	
	//getter,setter							private ��� ������ �б����� get �޼ҵ� , ���� �ֱ����� set �޼ҵ带 ���.
	public int getAge() {							//getter���� return ����, setter ������.
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
