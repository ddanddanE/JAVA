package EXAM;

import java.util.Scanner;
import java.util.StringTokenizer;

//A.
abstract class Calc {
	double op1;
	double op2;

	abstract void set(double op1, double op2);

	abstract double calculate();
}

//B.
class Add extends Calc {

	@Override
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	double calculate() {
		return op1 + op2;
	}
}

class Sub extends Calc {
	@Override
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	double calculate() {
		return op1 - op2;
	}
}

class Mul extends Calc {
	@Override
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	double calculate() {
		return op1 * op2;
	}
}

class Div extends Calc {
	@Override
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	double calculate() {
		return op1 / op2;
	}
}

public class Day0527a2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			System.out.println("두 피연산자와 연산자 입력: ");

			String a = sc.nextLine();

			int bl1 = a.indexOf(" ");
			String firstNum = a.substring(0, bl1 + 1);
			String firstNumResult = a.replaceAll(firstNum, "");

			int bl2 = firstNumResult.indexOf(" ");
			String secondNum = firstNumResult.substring(0, bl2 + 1);
			String secondNumResult = firstNumResult.replaceAll(secondNum, "");

			if (firstNum.equals("") || secondNum.equals("") || secondNumResult.equals("")) {
				System.out.println("제대로 입력해주세요");
				i--;
				continue;
			} else {
				double firstNum1 = Double.parseDouble(a.substring(0, bl1 + 1));
				double firstNum2 = Double.parseDouble(firstNumResult.substring(0, bl2 + 1));

				switch (secondNumResult) {
				case "+":
					Add add = new Add();
					add.set(firstNum1, firstNum2);
					System.out.println("답: " + add.calculate());
					break;
				case "-":
					Sub sub = new Sub();
					sub.set(firstNum1, firstNum2);
					System.out.println("답: " + sub.calculate());
					break;
				case "*":
					Mul mul = new Mul();
					mul.set(firstNum1, firstNum2);
					System.out.println("답: " + mul.calculate());
					break;
				case "/":
					Div div = new Div();
					div.set(firstNum1, firstNum2);
					System.out.println("답: " + div.calculate());
					break;
				default:
					break;
				}
			}
		}
	}
}

