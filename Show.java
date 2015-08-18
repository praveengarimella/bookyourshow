public class Show {
  private String movieName;
  private String datetime;
  private String[] seatNumbers;
  private Patron[] booking;

  public Show(String movieName, String datetime, String[] seatNumbers) {
    this.movieName = movieName;
    this.datetime = datetime;
    this.seatNumbers = seatNumbers;
    this.booking = new Patron[seatNumbers.length];
  }

  public String getMovieName() {
    return movieName;
  }

  public String getDatetime() {
    return datetime;
  }

  public String toString() {
    String s = "";
    s = s + movieName + " ";
    s = s + datetime + " ";
    s = s + "{";
    for (int i = 0; i < seatNumbers.length; i++) {
      s = s + seatNumbers[i];
      if (i != seatNumbers.length - 1)
        s = s + ",";
    }
    s = s + "}";
    return s;
  }

  public void bookAShow(Patron p, String[] seats) {
    for(String s : seats) {
      for(int i = 0; i < seatNumbers.length; i++) {
        if (s.equals(seatNumbers[i])) {
          if (booking[i] == null) {
            booking[i] = p;
          }
        }
      }
    }
  }

  public void printTickets(Patron p) {
    boolean available = false;
    for (int i = 0; i < booking.length; i++) {
      if (booking[i] == p) {
        System.out.print(p);
        System.out.print(movieName);
        System.out.print(" ");
        System.out.print(seatNumbers[i]);
        System.out.println();
        available = true;
      }
    }
    if(!available)
      System.out.println(p + "You don't have any booking!");
  }

}