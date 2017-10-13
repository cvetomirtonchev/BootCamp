package com.reservation.services;

import com.reservation.model.Reservation;

public interface ResevationService {
	
	
	public Reservation createBooking(int days, String roomName, String customerName);

}
