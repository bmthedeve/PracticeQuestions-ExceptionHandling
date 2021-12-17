package practiceQuestions;

import java.time.LocalDate;

public class BookingImpl {
	
	public static String validate(TicketBooking tbk) throws TravelDateException, NegativeValueException {
		if(tbk.getTravelDate().isBefore(LocalDate.now())) {
			throw new TravelDateException("Date is earlier than current date");
		}
		if(tbk.getNoOfTickets()<0) {
			throw new NegativeValueException("No of tickets cannot be negative");
		}
		else {
			return "Successfully Validated";
		}
	}
	
	public static double computeBillAmount(TicketBooking tbk) {
		double total = 0;
		try {
			System.out.println(validate(tbk));
			total = tbk.getNoOfTickets()*tbk.getEachTicketAmount();
		}
		catch(TravelDateException te){
			total = 0;
			System.out.println(te.getMessage());
		}
		catch(NegativeValueException ne) {
			total = -1;
			System.out.println(ne.getMessage());
		}
		return total;
	}
}
