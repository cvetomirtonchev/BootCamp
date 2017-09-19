package hotel;

import components.Wifi;

public class SuperDelux extends Room {

	Wifi wifi;

	public SuperDelux(float priceForADay) {
		super(priceForADay);
		wifi = new Wifi("asdasd", "adasdasd");
	}

}
