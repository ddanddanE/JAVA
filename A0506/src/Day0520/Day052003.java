package Day0520;

public class Day052003 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
	public static void main(String[] args) {
		Day052003 studentAhn =new Day052003();
		studentAhn.studentName="¾È¿¬¼ö";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
