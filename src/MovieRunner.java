

public class MovieRunner {
public static void main(String[] args) {
	
	Movie x = new Movie("Starwars",5);
	Movie a = new Movie("Frozen",-20);
	Movie b = new Movie("Zootopia",3 );
	Movie c = new Movie("The Incredibles",4);
	Movie d = new Movie("Malificent",1);
	NetfilxQueue f = new NetfilxQueue();
	f.addMovie(x);
	f.addMovie(a);
	f.addMovie(b);
	f.addMovie(c);
	f.addMovie(d);
	f.printMovies();
	f.sortMoviesByRating();
	f.getMovie(1);
	System.out.println("The best movie is " + f.getBestMovie());
	System.out.println("The second best movie is " + f.getMovie(1));
	
	
}
}
