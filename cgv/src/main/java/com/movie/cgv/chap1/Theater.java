package com.movie.cgv.chap1;

//소극장 구현 클래스
public class Theater {
	
	//판매원
	private TicketSeller ticketSeller;
	
	//생성자
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	//관람객 맞이 메서드
	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
//		if (audience.getBag().hasInvitation()) {  // 1.관람객이 초대장이 없으면..
//			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//			audience.getBag().setTicket(ticket);
//		} else {   // 2.관람객이 초대장이 있다면.. 
//			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//			audience.getBag().minusAmount(ticket.getFee());
//			ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//			audience.getBag().setTicket(ticket);
//		}
	}
}
