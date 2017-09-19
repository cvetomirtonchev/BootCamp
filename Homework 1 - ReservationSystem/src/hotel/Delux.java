package hotel;

import components.Router;
import components.Wifi;

public class Delux extends SpecialRoom implements Router {



	public Delux(float priceForADay, Occupancy occupancy) {
		super(priceForADay, occupancy);
	}

	@Override
	public void wifiConfig() {
		mWifi = new Wifi("Hotel1", "12357687");
	}

}
