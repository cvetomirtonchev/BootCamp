package hotel;

import components.Wifi;

public class Delux extends SpecialRoom{

	Wifi mWifi;

	public Delux(float priceForADay, Occupancy occupancy) {
		super(priceForADay, occupancy);
		this.mWifi = new Wifi("Hotel1","12357687") ;
	}
	
	
}
