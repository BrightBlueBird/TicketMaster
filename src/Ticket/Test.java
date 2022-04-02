package Ticket;

public class Test {
  EventOrganiser eventWebsite = new EventOrganiser();

  public void goTest() {
    Event rockConcert = new Event("RockConcert", 500, 450.5);
    Event doomsday = new Event("Lecture in the end of the world", 250, 150);

    System.out.println(rockConcert.getDescription());
    System.out.println(rockConcert.getTicketPrice());
    System.out.println(rockConcert.getNumberOfTickets());
    eventWebsite.eventReceiver(rockConcert);
    System.out.println(eventWebsite.printEvents());

  }

  public void ticketStatus() {
    Event tmp;
    tmp = eventWebsite.checkListForEvent("RockConert");
    if (tmp == null) {
      System.out.println("This event does not exist.");
    } else {
      if (tmp.getNumberOfTickets() < 1) {
        System.out.println("This event is sold out.");
      } else {
        if(arbitraryNumberOfTickets() < tmp.getNumberOfTickets()) {
          System.out.println("The event is not sold out however," +
              "there is not enough tickets left to confirm your order.");
        } else {
          System.out.println("There is enough tickets left.");
        }
      }
    }
  }

public int arbitraryNumberOfTickets() {
    return 3;
}

  public static void main(String[] args) {
    new Test().goTest();
  }
}
