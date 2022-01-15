package com.movie.cgv.chap1;

public class TicketSeller {

	private TicketOffice ticketOffice;
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	public void sellTo(Audience audience) {
		if (audience.getBag().hasInvitation()) { // 1.관람객이 초대장이 없으면..
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().setTicket(ticket);
		} else { // 2.관람객이 초대장이 있다면..
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().minusAmount(ticket.getFee());
			ticketOffice.plusAmount(ticket.getFee());
			audience.getBag().setTicket(ticket);
		}		
	}
}
