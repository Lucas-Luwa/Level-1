
public class Cat {

	String name;
	int numberoflivesleft;

	Cat(String name, int numberoflivesleft) {

		this.name = name;
		this.numberoflivesleft = numberoflivesleft;
	}

	void meow() {

		System.out.println("Meowing");
	}

	void clawing() {

		System.out.println(this.name + " is clawing someone!!!");
	}

	void devourering() {

		System.out.println(this.name + " is devourering someone's lunch! Quick save the lunch!!!");
	}

	void devoureringS() {

		System.out.println(this.name + " is devourering Chloe's lunch! Don't tell her. Let it eat it:)");
	}
}
