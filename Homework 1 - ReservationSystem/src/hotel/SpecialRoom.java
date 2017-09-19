package hotel;

import components.Wifi;


public abstract class SpecialRoom extends Room{
	public enum Occupancy{SINGLE,DOUBLE}
	
	private Occupancy occupancy;

	public SpecialRoom(float priceForADay, Occupancy occupancy) {
		super(priceForADay);
		this.occupancy = occupancy;
	}

	public Occupancy getOccupancy() {
		return occupancy;
	}

	
	
	
}
