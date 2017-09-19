package hotel;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import hotel.SpecialRoom.Occupancy;

public class Hotel {

	private String mName;
	private ArrayList<Room> mRooms;

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
		for (int i = 0; i < mRooms.size(); i++) {
			String[]type = mRooms.get(i).getClass().getName().split(Pattern.quote("."));
			String room = type[1];
			if (room.equals(roomType)) {
				if (!mRooms.get(i).isReserved()) {
					if (occupancy == null && !roomType.equals("SuperDelux")) {
						mRooms.get(i).reserveRoom(days,roomType);
						break;
					} else if (((SpecialRoom) mRooms.get(i)).getOccupancy() == occupancy) {
						mRooms.get(i).reserveRoom(days,roomType);
						break;
					}

				} else {
					Scanner sc = new Scanner(System.in);
					System.out
							.println("All " + roomType + " rooms are full. Do you whant to be placed in other room: ");
					String answer = sc.nextLine().toLowerCase();
					if (answer.equals("yes")) {
						for (int y = 0; y < mRooms.size(); i++) {
							if (!mRooms.get(y).isReserved()) {
								mRooms.get(y).reserveRoom(days,roomType);
							}
						}

					}
				}
			}
		}

	}
}
