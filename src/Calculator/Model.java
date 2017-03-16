package Calculator;

public class Model {
	String FirstNumber = "";
	String SecondNumber = "";
	int Answer;
	String Operator;
	
	boolean OperatorPressed;

	void ADDADIGIT(String number) {

		if (number.equals("x") || number.equals("/") || number.equals("-") || 
				 number.equals("+")) {
			Operator = number;
			OperatorPressed = true;
			
		} 
		
		
		else if (OperatorPressed == false) {

			FirstNumber = FirstNumber + number;
		}
		else if(number.equals("c")){
			Answer = 0;
			FirstNumber = "";
			SecondNumber = "";
			Operator = "";
			OperatorPressed = false;
			
		}
		else if (number.equals("=")) {
			int x = Integer.parseInt(FirstNumber);
			int y = Integer.parseInt(SecondNumber);
			
			if(Operator.equals("x")){
				Answer = x*y;
			}
			if(Operator.equals("+")){
				Answer = x+y;
			}
			if(Operator.equals("/")){
				Answer = x/y;
			}
			if(Operator.equals("-")){
				Answer = x-y;
			}
			
		}
		
		
		else if (OperatorPressed == true) {

			SecondNumber = SecondNumber + number;
		}
	
		
		else {

		}

		System.out.println("FirstNumber " + FirstNumber);
		System.out.println("SecondNumber " + SecondNumber);
		System.out.println("Operator " + Operator);
	}

	public String getFirstNumber() {
		return FirstNumber;
	}

	public String getSecondNumber() {
		return SecondNumber;
	}

	public String getOperator() {
		return Operator;
	}

	public int getAnswer() {
		return Answer;
	}
	/*
	 * void AddDigetTwo(String number2){ SecondNumber = SecondNumber + number2;
	 * System.out.println(" " + SecondNumber); }
	 */

	Model() {
		FirstNumber = "";

	}

}
