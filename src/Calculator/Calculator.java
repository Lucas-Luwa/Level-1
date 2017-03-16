package Calculator;

public class Calculator {
public static void main(String[] args) {
	Model m = new Model();
	View v = new View(m);
	Controller c = new Controller(v,m);
	v.Create();

}

}
