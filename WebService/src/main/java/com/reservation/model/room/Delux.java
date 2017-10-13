package room;

import components.Router;
import components.Wifi;

public class Delux extends Room implements Router {

	public Delux(float priceForADay, Occupancy occupancy) {
		super(priceForADay);
		mOccupancy = Occupancy.DOUBLE;
	}

	public void wifiConfig() {
		mWifi = new Wifi("Hotel1", "12357687");
	}

}
