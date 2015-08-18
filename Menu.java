public class Menu {
  public static void main(String[] args) {
    BookYourShow book = new BookYourShow();
    
    String movieName = "Mission Impossible";
    String datetime = "Aug 18, 2015 17:30";
    String[] seats = {"A1","A2","A3","B1","B2","B3","C1","C2"};
    
    Show show = new Show(movieName, datetime, seats);
    book.addAShow(show);
    //System.out.println(show);

    movieName = "Mission Impossible";
    datetime = "Aug 18, 2015 10:30";
    show = new Show(movieName, datetime, seats);
    book.addAShow(show);

    movieName = "Mission Impossible";
    datetime = "Aug 18, 2015 15:30";
    show = new Show(movieName, datetime, seats);
    book.addAShow(show);

    book.printShows();
  }
}