package com.kitri.lang;

public class StringVSBuffer { // 결과보고 둘중하나중에 이거쓰는거구나 이해하면댄다.;

	public static void main(String[] args) {
		// 문자열이길어질수록 속도차이가난다.
		long st = System.nanoTime();
//			시간1
		String str = "hello";
		for (int i = 0; i < 5000; i++) { // 500줄 코딩했다고 생각
			str += i;
		}

//			시간2
//			StringBuffer sb = new StringBuffer("hello");
//			for(int i=0;i<5000;i++) { //500줄 코딩했다고 생각
//				sb.append(i);
//			}

		System.out.println(System.nanoTime() - st);
//			시간2  시간2- 시간1 하면 걸린시간 알수있겟다.   
		
		
		//////meth class 이런거는 알아서해요. thread 는 네트워크전에할겁니다. 거의마지막전에 지금못해요
		System.out.println(Math.abs(-5));
		System.out.println(Math.max(3,5));
		System.out.println(Math.sin(30));
		
		
		
		
	}
}

//500 비교
//815318	897427	 890371  994611
//292193	262685	277439

//5000 비교

//40010879
//1165244  

//갭은 점점더 벌어진다. 문자열 더할때는 stringbuffer를 써라.
