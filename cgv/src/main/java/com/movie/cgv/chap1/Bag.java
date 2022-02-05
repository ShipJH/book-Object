package com.movie.cgv.chap1;

/**
 * 가방 구현 클래
 * @author shipjh
 *
 */
public class Bag {

	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	

	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}
	
	private boolean hasInvitation() {
		return invitation != null;
	}

	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}
}
