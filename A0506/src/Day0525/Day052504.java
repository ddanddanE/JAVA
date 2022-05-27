package Day0525;

class Person{}
class Student extends Person{}
class Worker extends Person{}
class ITWorker extends Worker{}

public class Day052504 {

	public static void main(String[] args) {
		show(new Student());
		show(new Worker());
		show(new ITWorker());

	}

	static void show(Person p) {
		if (p instanceof Person) {
			System.out.println("사람");
		}
		if (p instanceof Student) {
			System.out.println("학생");
		}
		if (p instanceof Worker) {
			System.out.println("직장인");
		}
		if (p instanceof ITWorker) {
			System.out.println("IT직장인");
		}
	}
	}


