package cch209;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String StudentName){
		this.studentId =studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		
	}

	public void setKoreaSubject( String name, int score) {
		korea.subjectname = name;
		korea.score = score;
	}
	
	public void setMathSubject( String name, int score) {
		
		math.subjectname = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		
		int total = korea.score + math.score;
		System.out.println( studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
