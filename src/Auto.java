import java.util.Random;

public class Auto {
	
	int nummer;
	double vmax;
	double capacity;
	double consumption;
	double energy_remaining;
	double speed;
	
public Auto(int nummer, double vmax, double capacity, double consumption){
		
	this.nummer = nummer;
	this.vmax = vmax;
	this.capacity = capacity;
	this.consumption = consumption;
	this.energy_remaining = this.capacity;
	this.speed = this.vmax;
}	
	
public double fahren(double racelenght, int round){
	
	Random random = new Random();
	double range = (capacity/consumption)*100;	
	double stops = Math.ceil(racelenght/range);
	double stoptime = 21 + capacity + random.nextInt((int)stops*3);
	double failure = failure();
	speed = failure;
	
	//int failure = random.nextInt(10*round);
	//double avrspeed = vmax - random.nextInt();
	
	
	double time = ((racelenght/speed)*3600)+(stoptime*stops);
			
	return time;	
			
}

public double failure(){
	
	Random random = new Random();
	int failure = random.nextInt(10);
	return vmax - failure;
	
}
	
public void aufladen(){
		
	energy_remaining = capacity;
	speed = speed - 80;
	
}

public String toString(){
	
	/* 
    System.out.println("Startnummer: "+nummer);
	System.out.println("Vmax: "+vmax);
	System.out.println("Derzeitige Durschnittsgeschwindigkeit: "+speed);
	System.out.println("Autokapazitšt: "+capacity);
	System.out.println("Restenergie: "+energy_remaining);
	System.out.println("Verbrauch auf 100km: "+consumption);
	*/
	
	return "Startnummer: "+nummer+ 
			"\n Vmax: "+vmax+
			"\n Derzeitige Durschnittsgeschwindigkeit: "+speed+
			"\n Autokapazitšt: "+capacity+
			"\n Restenergie: "+energy_remaining+
			"\n Verbrauch auf 100km: "+consumption;
	
}
	

}
