package ex1;
//A student is writing exam using a pen

//Pen
class Pen2{
	private String color;

	public Pen2(String color) {
		this.color = color;
	}
	
	public void mark() {
		System.out.println("writing with pen..."+ color);
	}
}
//Student
class Student{
	public void writeExam(Pen2 pen, String subject) {
		System.out.println("writing "+ subject + " paper i am well prepared... :)");
		pen.mark();
	}
}

public class StudentExamExample {
	public static void main(String[] args) {
		Pen2 pen=new Pen2("blue");
		Student student=new Student();
		
		student.writeExam(pen, "maths");
	}

}
