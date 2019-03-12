public class Car {
//전역변수
		String carName;
		String color;
		String maker;
		int speed;

		
			//public Car() {}   default 생성자가 내부적으로 숨어있다. 		
		public void speedUp() {
			speed +=10;
		}
		public void speedDown() {
		 speed -=10;
		}
		
		public void stop() {
		 speed = 0; 
		}
	
}
