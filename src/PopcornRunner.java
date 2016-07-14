
public class PopcornRunner {
public static void main(String[] args) {
	Microwave x = new Microwave();
	Popcorn p = new Popcorn("carmel");
	x.putInMicrowave(p);
	x.setTime(2);
	x.startMicrowave();
	
}
}
