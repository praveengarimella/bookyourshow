public class BookYourShow {
  private Show[] shows;
  private final int size = 2;
  private int showCount;

  public BookYourShow() {
    shows = new Show[size];
    showCount = 0;
  }
  
  public void addAShow(Show s) {
    if (showCount < size) {
      shows[showCount++] = s;
    } else {
      System.out.print(s);
      System.out.println(" - Show cannot be added. Array is Full!");
    }
  }

  public void printShows() {
    for (int i = 0; i < showCount; i++) {
      System.out.println(shows[i]);
    }
  }
}