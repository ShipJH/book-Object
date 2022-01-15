package com.movie.cgv.chap1;

/**
 * 관람객 구현 클래스 
 * @author shipjh
 *
 */
public class Audience {

	private Bag bag;
	
	public Audience(Bag bag) {
		this.bag = bag;
	}
	
//	public Bag getBag() {
//		return bag;
//	}
	
	public Long buy(Ticket ticket) {
		if (bag.hasInvitation()) {
			bag.setTicket(ticket);
			return 0L;
		} else {
			bag.setTicket(ticket);
			bag.minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}
}
