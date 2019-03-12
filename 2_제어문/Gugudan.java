public class Gugudan {
	public static void main(String[] args) {
		System.out.println("*** 구구단1 ***");
		for(int i=1;i<10;i++) {
			for(int dan=2;dan<10;dan++) {
				System.out.print(dan + " * " + i + " = " + dan * i + "  ");
			}
			System.out.println();
		}

		System.out.println("*** 구구단2 ***");
		for(int dan=2;dan<10;dan++) {
			for(int i=1;i<10;i++) {
				System.out.print(dan + " * " + i + " = " + dan * i + "  ");
			}
			System.out.println();
		}
	}
}
//횟수와 규칙이 있어야 for문을 쓸수있다. 