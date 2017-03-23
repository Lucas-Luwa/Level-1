public class Platypus {
	private String name;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus!");
	}
	Platypus(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus p = new Platypus("Joe");
		Platypus p2 = new Platypus("Sam");
		Platypus p3 = new Platypus("Luke");
		Platypus p4 = new Platypus("Ian");
		Platypus p5 = new Platypus("Jay");
		//2. Call the sayHi method
		p.sayHi();
		p2.sayHi();
		p3.sayHi();
		p4.sayHi();
		p5.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
}
