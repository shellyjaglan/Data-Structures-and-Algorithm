public class bycycle{
	//variables
	public int gear;
	public int speed=0;
	public int cadence;

	//one constructor
	public bycycle(int startGear, int startSpeed, int startCadence ){
		gear=startGear;
		speed=startSpeed;
		cadence=startCadence;
	}
	//4 methods of bycycle class
	public void setGear(int newValue){
		gear= newValue;
		System.out.println("gear value is:"+ gear);
	}
	public void setSpeed(int newValue){
		speed=speed+ newValue;
	}
	public void speedDown(int decrement){
		speed=speed- decrement;
	}
}

public class mountainBikes extends bycycle{
	 // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}