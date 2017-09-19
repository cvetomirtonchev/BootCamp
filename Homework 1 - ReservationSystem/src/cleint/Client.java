package cleint;

import java.util.ArrayList;

import hotel.Hotel;
import hotel.SpecialRoom.Occupancy;

public class Client {
	
	private String mName;

	public Client(String name) {
		super();
		this.mName = name;
	}
	
	public void bookRoom(int days,String roomType,Occupancy occupancy ,Hotel hotel) {
		hotel.bookRooom(roomType, days, occupancy);
	}
	
	
	

}
