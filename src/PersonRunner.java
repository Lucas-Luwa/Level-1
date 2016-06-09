public class PersonRunner {
public static void main(String[] args) {
	Person Joe = new Person();
	Joe.setname("Joe");
	String x = Joe.getname();
	System.out.println("My name is " + x + ".");
	Joe.setsuperpower("flying");
	String y = Joe.getsuperpower();
	System.out.println("My superpower is " + y + ".");
	Person Sam = new Person();
	Sam.setname("Sam");
	String a = Sam.getname();
	System.out.println("My name is " + a + ".");
	Sam.setsuperpower("invisibility");
	String b = Sam.getsuperpower();
	System.out.println("My superpower is " + b + ".");
	
	
}
}
