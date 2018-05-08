
public class Rennen {
	
	public static void main(String[] args){
		
		Auto a1 = new Auto(1, 200, 60, 20);
	    Auto a2 = new Auto(2, 240, 70, 30); 
	    Rennstrecke nordschleife = new Rennstrecke("Nordschleife", 20.83, 60);
	    
	    System.out.println(a1);
	    System.out.println(a2);
		
	    System.out.println(a1.fahren(nordschleife.racelenght, nordschleife.round)/3600);
	    System.out.println(a2.fahren(nordschleife.racelenght, nordschleife.round)/3600);
	}

}
