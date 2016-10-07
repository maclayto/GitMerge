import java.util.ArrayList;

public class SomeClass {
	private ArrayList<String> events = new ArrayList<String>();
	
	public void createEvents() {
		events.add("We're going to a movie on Saturday.");
		events.add("Study session on Sunday at Jim's house.");
	}
	
	public void thoughtForTheDay() {
		System.out.println("On the other hand, you have different fingers.");
	}
	
	public void upcomingEvents() {
		System.out.println("Upcoming Events (Please join us!):");
		for(String event : events) {
			System.out.println(event);
		}
	}
	
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}

	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		sc.thoughtForTheDay();
		sc.createEvents();
		sc.upcomingEvents();
		sc.feedback(60);

	}

}
