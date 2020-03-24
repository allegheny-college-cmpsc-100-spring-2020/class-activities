package activityten;

import java.util.Scanner;

/** Creates a seasonal calendar.
 *
 * @author Solutions Repository
 */
public class SeasonalCalendar {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a numeric month (1-12): ");
    int monthNum = input.nextInt();
    
    System.out.print("Enter a day (1-31): ");
    int day = input.nextInt();
    
    String monthStr = new String();
    String seasonStr = new String();
   
    /*
     * TODO: Write a switch statement to classify day and month into seasons
     */
    
    System.out.println(day + " " + monthStr + " 2020 is in " + seasonStr);
  }
}