package calendarstate;

//import java.util.Random;

public class HasEventState implements State {
	MicrosoftCalendar microsoftCalendar;
	
	public HasEventState(MicrosoftCalendar microsoftCalendar) {
		this.microsoftCalendar = microsoftCalendar;
	}

	public void addEvent() {
		System.out.println("You can't add multiple Events");
	}
	
	public void cancelEvent() {
		System.out.println("Event Removed");
		microsoftCalendar.setState(microsoftCalendar.getNoEventState());
	}
	
	public void clickPlus() {
		System.out.println("You moved...");
		microsoftCalendar.setState(microsoftCalendar.getAppointmentState());
	}
	
	public void send() {
		System.out.println("No Event deleted");
	}
	
	public void reschedule() {}
	
	public String toString() {
		return "waiting for click of Plus";
	}
}
