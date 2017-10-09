package demo;

import cleint.Client;
import hotel.Hotel;
import room.Room.Occupancy;

public class Demo {
	
	public static void main(String[] args) {
		Client client = new Client("Gosho");
		Hotel balkan = new Hotel("Balkan");
		client.bookRoom(4, "Delux", Occupancy.DOUBLE, balkan);
		client.bookRoom(4, "Delux", Occupancy.DOUBLE, balkan);
		client.bookRoom(4, "Delux", Occupancy.DOUBLE, balkan);
	
	}

}
