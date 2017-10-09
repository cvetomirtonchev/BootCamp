package room;

import components.Router;
import components.Wifi;

public class SuperDelux extends Room implements Router {

	public SuperDelux(float priceForADay) {
		super(priceForADay);
		mOccupancy = Occupancy.DOUBLE;
	}

	@Override
	public void wifiConfig() {
		mWifi = new Wifi("Hotel1", "12357687");
	}
}
