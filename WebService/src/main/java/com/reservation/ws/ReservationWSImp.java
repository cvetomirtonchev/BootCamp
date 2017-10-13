package com.reservation.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.reservation.components.ReservationResponse;
import com.reservation.model.Reservation;
import com.reservation.services.ReservationServiceImp;
import com.reservation.services.ResevationService;

@Path("/reservation")
public class ReservationWSImp implements ReservationWS {
	
	private ResevationService service = new ReservationServiceImp();
	

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public ReservationResponse create(Reservation reservation) {
		service.createBooking(reservation.getDays(),reservation.getRoomName(),reservation.getClientName());
		ReservationResponse response = new ReservationResponse();
		response.setSuccesMsg("Successful");
		return response;
	}
	@PUT
	@Path("/update")
	public Reservation update(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}
	@DELETE
	@Path("/delete")
	public Reservation delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@GET
	@Path("/reservation")
	public Reservation get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
