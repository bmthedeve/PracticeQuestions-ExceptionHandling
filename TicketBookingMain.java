package practiceQuestions;

import java.time.LocalDate;

public class TicketBookingMain {
	public static void main(String[] args) {
		
		TicketBooking t1 = new TicketBooking("B",LocalDate.of(2020, 12, 27),4,150.0);
		TicketBooking t2 = new TicketBooking("B",LocalDate.of(2021, 12, 27),-1,150.0);
		TicketBooking t3 = new TicketBooking("B",LocalDate.of(2021, 12, 27),4,150.0);
		
		System.out.println(BookingImpl.computeBillAmount(t1));
		System.out.println(BookingImpl.computeBillAmount(t2));
		System.out.println(BookingImpl.computeBillAmount(t3));
	}
	
}
