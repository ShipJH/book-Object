package com.movie.cgv.chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 티켓 판매소 
 * @author shipjh
 *
 */
public class TicketOffice {

	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();
	
	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTicket()));
	}
	
	private Ticket getTicket() {
		return tickets.remove(0);
	}
	
	private void plusAmount(Long amount) {
		this.amount += amount;
	}
}
 