
public class Smurf_Runner {
public static void main(String[] args) {
	

	 Smurfs Handy = new Smurfs("Handy");
	 Handy.eat();
	 System.out.println(Handy.getName());
	 Smurfs Papa = new Smurfs("Papa ");
	 System.out.println(Papa.getName());
	 System.out.println(Papa.getHatColor());
	 System.out.println(Papa.isGirlOrBoy());
	 Smurfs Smurfette = new Smurfs("Smurfette");
	 System.out.println(Smurfette.getName());
	 System.out.println(Smurfette.getHatColor());
	 System.out.println(Smurfette.isGirlOrBoy());
	
}	
}
