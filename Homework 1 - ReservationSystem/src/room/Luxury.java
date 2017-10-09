package room;

import room.Room.Occupancy;

public class Luxury extends Room {

	public Luxury(float priceForADay, Occupancy occupancy) {
		super(priceForADay);
		mOccupancy = occupancy;
	}
}
