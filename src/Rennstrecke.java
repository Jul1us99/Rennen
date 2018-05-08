
public class Rennstrecke {

	double lenght;
	int round;
	double racelenght;
	String name;
	
	public Rennstrecke(String name, double lenght, int round){
		
		this.name = name;
		this.lenght = lenght;
		this.round = round;
		racelenght = lenght * round;
		
	}
	
	
}
