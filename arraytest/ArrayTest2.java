package com.kitri.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		Car car[] = new Car[6];
		//System.out.println(car[0].getCarName()); //점 앞에가 null이다. 왜 카의0번째가 널이지? 모든객체는 생성자가호출되야하는거.
		//자동차를 만들수있는 주차장을 만든것일뿐. 
		car[0]= new Car("쏘나타", "검", "현대");
		car[1]= new Car("K5", "흰색", "기아");
		car[2]= new Car("SM5", "은색", "삼성");
		car[3]= new Car("아반떼", "흰색", "현대");
		car[4]= new Car("니어로", "비둘기색", "기아");
		car[5]= new Car("싼타페", "검정색", "현대");
//		System.out.println(car[0].getCarName());
		int len = car.length;
		for(int i=0;i<len;i++) {
			System.out.println(i + 1 + "번째구역 : " + car[i]);
		}
		//주차장에갔더니 니어로 어딧는지 못찾겟어 니어로 몇번째있는지
		//		Q.비둘기색 니어로(기아)는 5번째에 있습니다. 나오게 해봐라.
		//		
//		String name = "니어로";
		String name = "QM5";
//		for(int i=0; i<len; i++) {
			//QM5는 없습니다.
//			if(name.equals(car[i].getCarName())) { //문자열비교는 equals로 
//				System.out.println(car[i].getColor() + " " + car[i].getCarName() +  "(" + car[i].getMaker() + ")은 " + 
//						(i + 1) + "번째 구역에 있습니다.") ;
//				break;
//		
				Car findCar = null;
				int count = 0;
				for(int i=0;i<len;i++) {
					//QM5는 없습니다.를 뽑아보자. 시간많이주심. 자바에서만쓰는게아니다. 이로직을.
					//원하는 데이터를 배열이나 컬레션에서 원하는데이터를 뽑아내는것. 최대한. 뽑아보세요.
					//
					if(name.equals(car[i].getCarName())) { //문자열비교는 equals로 
//						System.out.println(car[i].getColor() + " " + car[i].getCarName() +  "(" + car[i].getMaker() + ")은 " + 
//								(i + 1) + "번째 구역에 있습니다.") ;
						findCar= car[i];
						count = i + 1 ;
						break;
					}	 
				}
				if ( findCar != null ) {
					System.out.println(findCar.getColor() + " " +
							findCar.getCarName() + "(" + findCar.getMaker() + ")은" +
							count + "번째구역에 있습니다.");
				} else {
					System.out.println( name + "은 없습니다.");
				}
						
		//앞으로 엄청만듦. 컬렉션 배열. 원하는 객체를 찾아내라. 엄청나게 많이 할거다. 
	}

}
