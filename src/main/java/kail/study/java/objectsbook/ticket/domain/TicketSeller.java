package kail.study.java.objectsbook.ticket.domain;

public class TicketSeller {
	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public void toSell(Audience audience) {
		ticketOffice.sellTicketTo(audience);
	}
}
