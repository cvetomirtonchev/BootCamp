package room;

import components.Wifi;

abstract public class Room {
	public enum Occupancy{SINGLE,DOUBLE}
	
	private float mPriceForADay;
	private int mDaysReserved;
	private boolean mIsReserved;
	protected Wifi mWifi;
	protected Occupancy mOccupancy;



	public Room(float priceForADay) {
		super();
		mIsReserved = false;
		mPriceForADay = priceForADay;
	}



	public void reserveRoom(int days , String roomType) {
		mIsReserved = true;
		mDaysReserved = days;
		System.out.println(roomType +": has been reserved for: "+mDaysReserved+" days.");
		System.out.println("Price you need to pay: "+ mDaysReserved*mPriceForADay);

	}

	public boolean isReserved() {
		return mIsReserved;
	}
	
}
