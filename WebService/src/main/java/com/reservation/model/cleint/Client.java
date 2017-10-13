package cleint;

import java.util.ArrayList;

import hotel.Hotel;
import room.Room.Occupancy;

public class Client {

	private String mName;

	public Client(String name) {
		super();
		mName = name;
	}

	public void bookRoom(int days, String roomType, Occupancy occupancy, Hotel hotel) {
		hotel.bookRooom(roomType, days, occupancy);
	}
}
