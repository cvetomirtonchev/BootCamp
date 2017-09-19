package hotel;

import components.Wifi;

abstract public class Room {

	private float priceForADay;
	private int daysReserved;
	private boolean isReserved;
	protected Wifi mWifi;



	public Room(float priceForADay) {
		super();
		this.priceForADay = priceForADay;
	}



	public void reserveRoom(int days , String roomType) {
		isReserved = true;
		daysReserved = days;
		System.out.println(roomType +": has been reserved for: "+daysReserved+" days.");
		System.out.println("Price you need to pay: "+ daysReserved*priceForADay);

	}

	public boolean isReserved() {
		return isReserved;
	}
	
}
