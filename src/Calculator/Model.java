package Calculator;

public class Model {
	String FirstNumber;
	String SecondNumber;
	int Answer;
	String Operator;
	boolean OperatorPressed;

	void ADDADIGIT(String number) {
		FirstNumber = FirstNumber + number;
		System.out.println("FirstNumber " + FirstNumber);
		System.out.println("SecondNumber " + SecondNumber);
		System.out.println("Operator " + Operator);
		if (number.equals("x") || number.equals("/") || number.equals("-") || number.equals("=")
				|| number.equals("+")) {
			Operator = number;
			OperatorPressed = true;
			FirstNumber = SecondNumber + number;
		}
	}
	/*
	 * void AddDigetTwo(String number2){ SecondNumber = SecondNumber + number2;
	 * System.out.println(" " + SecondNumber); }
	 */

	Model() {
		FirstNumber = "";

	}
}
