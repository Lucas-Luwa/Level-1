
public class olympian {
	int age;
	static int number = 0;
	int olympiannumber;
	String name;
	String country;

	public olympian(int age, String name, String country) {
		this.age = age;
		this.name = name;
		this.country = country;
		number += 1;
		olympiannumber = number;

	}

	void compete() {
		System.out.println(name + " is from " + country + " and is " + age + " years old.");
		System.out.println(name + "'s olympian number is " + olympiannumber);
	}
}
