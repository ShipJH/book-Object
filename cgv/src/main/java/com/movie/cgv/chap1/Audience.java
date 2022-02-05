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
	
	public Long buy(Ticket ticket) {
		return bag.hold(ticket);
	}
}
