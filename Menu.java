public class Menu {
  public static void main(String[] args) {
    String movieName = "Mission Impossible";
    String datetime = "Aug 18, 2015 17:30";
    String[] seats = {"A1","A2","A3","B1","B2","B3","C1","C2"};
    Show show = new Show(movieName, datetime, seats);
    System.out.println(show);
  }
}