package hotel;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import room.Delux;
import room.Luxury;
import room.Room;
import room.SuperDelux;
import room.Room.Occupancy;

public class Hotel {
	private static final String TAG = Hotel.class.getSimpleName();
	private String mName;
	private ArrayList<Room> mRooms;
	private static boolean isRoomReserved; // check if the the client find room that he wants and reserved it

	public Hotel(String name) {
		super();
		this.mName = name;
		this.mRooms = new ArrayList();
		mRooms.add(new Luxury(75.25f, Occupancy.SINGLE));
		mRooms.add(new Luxury(150.25f, Occupancy.DOUBLE));
		mRooms.add(new Delux(50.96f, Occupancy.SINGLE));
		mRooms.add(new Delux(100.75f, Occupancy.DOUBLE));
		mRooms.add(new SuperDelux(100.75f));
		mRooms.add(new SuperDelux(200.75f));

	}

	public void bookRooom(String roomType, int days, Occupancy occupancy) {
		isRoomReserved = false;
		for (int i = 0; i < mRooms.size(); i++) {
			String[] type = mRooms.get(i).getClass().getName().split(Pattern.quote("."));
			String room = type[1];
			if (room.equals(roomType)) {
				if (!mRooms.get(i).isReserved()) {
					reservedRoom(occupancy, roomType, days, mRooms.get(i));
					if (isRoomReserved) {
						break;
					}
				} else {
					// if there aren't room that you want
					if (!isRoomReserved) {
						offerAnotherRoom(roomType, days, occupancy);
					} else {
						break;
					}
				}

			}
		}
	}

	private void offerAnotherRoom(String roomType, int days, Occupancy occupancy) {
		isRoomReserved = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("All " + roomType + " rooms are full. Do you whant to be placed in other room: ");
		String answer = sc.nextLine().toLowerCase();
		if (answer.equals("yes")) {
			for (int y = 0; y < mRooms.size(); y++) {
				reservedRoom(occupancy, roomType, days, mRooms.get(y));
				if (isRoomReserved) {
					break;
				}
			}
		}

	}

	private void reservedRoom(Occupancy occupancy, String roomType, int days, Room room) {
			room.reserveRoom(days, roomType);
			isRoomReserved = true;
	}
}
