public class IfElseIfTest3 {
	public static void main(String[] args) {
		
		int score = 59;
		String grade;
		if( score >=90){
		grade = "A";
		}
		else if (score >=80)
		{
			grade = "B";
		}
		else if (score >=70)
		{
			grade = "C";
		}
		else if (score >=60)
		{
			grade = "D";
		}
		else {
		grade = "F";
		}
		if( (score >60 && score % 10 >= 5 )|| score == 100){
		grade += "+";
		}

		System.out.println("점수가 " + score + "점 이므로 학점은" + grade + " 입니다.");
	}
}
