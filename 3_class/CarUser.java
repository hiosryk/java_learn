public class CarUser {
	public static void main(String[] args) {
		 //null 은 메모리에올리지않았다. 만들지않았다. 주소값이없다.
		Car car1 = new Car(); //전역변수는 초기화안하면 자동으로 null로 초기화된다. 숫자는 0으로 초기화된다.
		
		System.out.println(" 1. 차이름 : " + car1.carName + " " + car1.speed + " 색상 " + car1.color + " 제조사 "+ car1.maker );
		car1.carName = "쏘나타";
		car1.color = "검정색";
		car1.maker = "현대";
		
		System.out.println(" 2. 차이름 : " + car1.carName + " " + car1.speed + " 색상 " + car1.color + " 제조사 "+ car1.maker );
		
		Car car2 = new Car(); //null 인 이유 붕어빵 꺼냈으니까 다시 재료 또 넣어야겠찌?
		System.out.println(" Z. 차이름 : " + car2.carName + " " + car2.speed + " 색상 " + car2.color + " 제조사 "+ car2.maker );
		car2.carName = "K5";
		car2.color = "흰색";
		car2.maker = "기아";
		System.out.println(" ZZ. 차이름 : " + car2.carName + " " + car2.speed + " 색상 " + car2.color + " 제조사 "+ car2.maker );
		
	}
}
