package com.reservation.services;

import com.reservation.components.ReservationDB;
import com.reservation.model.Reservation;

public class ReservationServiceImp implements ResevationService {

	public Reservation createBooking(int days, String roomName, String customerName) {
		ReservationDB reserveDB = ReservationDB.getInstace();
		Reservation reservation = new Reservation(days, roomName, customerName);

		if (reserveDB.checkReservation(reservation)) {
			reserveDB.addReservation(reservation);
			return reservation;
		} else {
			return null;
		}
	}

}
