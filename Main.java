public class Main {

	public static void main ( String [] args){
		TAXI x = new TAXI ("NAP5112");
		
		
		x.run("quezon CITY");
		x.printCurrentLocation();
		x.book (5,5);
		x.run (" LEGGO");
		
		
		x.reachedDestination();
		System.out.println(x.reachedDestination());
		
	}
}