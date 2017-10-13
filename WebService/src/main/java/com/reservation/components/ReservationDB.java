package com.reservation.components;

import java.util.ArrayList;

import com.reservation.model.Reservation;

public class ReservationDB {

	private static ReservationDB sInstance = new ReservationDB();
	private ArrayList<Reservation> reservations;

	private ReservationDB() {
		if (reservations == null) {
			reservations = new ArrayList<Reservation>();
		}
	}
	public static ReservationDB getInstace() {
		return sInstance;
	}
	public void addReservation(Reservation reservation) {
		if(!reservations.contains(reservation)) {
			reservations.add(reservation);
		}
		//need to be added else	
	}
	
	public Reservation getReservation(int id) throws NullPointerException {
		//not right but for the demo will work
		for (Reservation res : reservations) {
			if(res.getId() == id) {
				return res;
			}
			
		}
		return null;
	}
	
	public void deleteReservation(int id) {
		for (Reservation res : reservations) {
			if(res.getId() == id) {
				reservations.remove(res);
			}
		}
	}
	public Boolean checkReservation(Reservation reservation) {
		return !reservations.contains(reservation);
	}

}
