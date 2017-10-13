package com.reservation.model;

public class Reservation {
	private static int id;
	private int days;
	private String roomName;
	private String clientName;
	
	public Reservation(int days, String roomName, String clientName) {
		super();
		this.days = days;
		this.roomName = roomName;
		this.clientName = clientName;
		id++;
	}

	public static int getId() {
		return id;
	}

	public int getDays() {
		return days;
	}

	public String getRoomName() {
		return roomName;
	}

	public String getClientName() {
		return clientName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + days;
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (days != other.days)
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		return true;
	}
}

