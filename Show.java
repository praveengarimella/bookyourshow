public class Show {
  private String movieName;
  private String datetime;
  private String[] seatNumbers;

  public Show(String movieName, String datetime, String[] seatNumbers) {
    this.movieName = movieName;
    this.datetime = datetime;
    this.seatNumbers = seatNumbers;
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
}