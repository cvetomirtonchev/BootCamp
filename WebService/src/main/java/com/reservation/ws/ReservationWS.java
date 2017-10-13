package com.reservation.ws;

import com.reservation.components.ReservationResponse;
import com.reservation.model.Reservation;

public interface ReservationWS {

	public ReservationResponse create(Reservation reservation);

	public Reservation update(Reservation reservation);

	public Reservation delete(int id);

	public Reservation get(int id);
}
