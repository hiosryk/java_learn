public class SelfGugu2 {
	public static void main(String[] args) {
		
		System.out.println("구구단 오른쪽으로 시작!!!!");
		for(int i=1;i<10;i++){
			for(int d=2;d<10;d++){
				System.out.print( i + "x" + d + "=" + i*d + "  " );
			}
			System.out.println();
		}
		
		System.out.println("구구단 밑으로 시작!!!!");
		for(int d=2;d<10;d++){
			for(int i=1;i<10;i++){
				System.out.print( i + "x" + d + "=" + i*d + "  " );
			}
			System.out.println();
		}

				System.out.println("구구단 프로그램 종료!!!!");
	}
}