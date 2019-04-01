package com.kitri.lang;

public class StringVSBuffer { // ������� �����ϳ��߿� �̰ž��°ű��� �����ϸ���.;

	public static void main(String[] args) {
		// ���ڿ��̱�������� �ӵ����̰�����.
		long st = System.nanoTime();
//			�ð�1
		String str = "hello";
		for (int i = 0; i < 5000; i++) { // 500�� �ڵ��ߴٰ� ����
			str += i;
		}

//			�ð�2
//			StringBuffer sb = new StringBuffer("hello");
//			for(int i=0;i<5000;i++) { //500�� �ڵ��ߴٰ� ����
//				sb.append(i);
//			}

		System.out.println(System.nanoTime() - st);
//			�ð�2  �ð�2- �ð�1 �ϸ� �ɸ��ð� �˼��ְٴ�.   
		
		
		//////meth class �̷��Ŵ� �˾Ƽ��ؿ�. thread �� ��Ʈ��ũ�����Ұ̴ϴ�. ���Ǹ��������� ���ݸ��ؿ�
		System.out.println(Math.abs(-5));
		System.out.println(Math.max(3,5));
		System.out.println(Math.sin(30));
		
		
		
		
	}
}

//500 ��
//815318	897427	 890371  994611
//292193	262685	277439

//5000 ��

//40010879
//1165244  

//���� ������ ��������. ���ڿ� ���Ҷ��� stringbuffer�� ���.
