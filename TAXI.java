public class TAXI {

	private int x = 0;
	private int y = 0;
	private String Plate = null;
	private int dest_x = 0;
	private int dest_y= 0;
	
    
	public void run(String run){
		int b = run.length();
		for (int a = 0; a<b; a++ ){
			if (run.charAt(a) == 'L' || run.charAt(a) == 'l'){
				x--;
			}
			else if (run.charAt(a) == 'R' || run.charAt(a) == 'r'){
				x++;
			}
			else if (run.charAt(a) == 'U' || run.charAt(a) == 'U'){
				y--;
			}
			else if (run.charAt(a) == 'D' || run.charAt(a) == 'D' ){
				y++;
			}
		}
		
	}
	public void book (int dest_x, int dest_y){
		this.dest_x = dest_x;
		this.dest_y = dest_y;
	}
	public boolean reachedDestination(){
		
		if (x==dest_x && y==dest_y){
		return true;
	}
	
		return false;
	}
	public void printCurrentLocation(){
		
		System.out.println( "My Current locations is: "+  x  + " " + y);
	}
	
	public TAXI (String name){
		this.Plate = Plate;
	}
	
	
	
}

