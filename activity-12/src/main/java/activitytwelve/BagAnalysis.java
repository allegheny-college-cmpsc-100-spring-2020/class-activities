package activitytwelve;

import java.io.File;
import java.io.FileNotFoundException;
/* TODO Don't forget to import ArrayList! */
import java.util.Iterator;
import java.util.Scanner;

/** Performs various analyses on bags of candies.
 *
 * @author {Your Name Here}
 */
public class BagAnalysis {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up Scanner to read from file
    File file = null;
    Scanner input = null;
    try {
        file = new File("inputs/mm.csv");
        input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.out.println(noFile);
    }
    
    // TODO Set up integers for loop
    
    // TODO Set up objects for loop
    
    /*
     * TODO Loop 1
     *      - Iterate over lines from file
     *      - Read columns delimited ("split") by commas
     *      - Create new Bag object(s)
     *      TODO Loop 2
     *           - Sort candies by color, add to Bag count
     *           - Add totals to new Bag objects
     *      - Add Bag to inventory
     *      - Reset column counter
     */
    
    // TODO Set up index for iteration over ArrayList
    
    /* 
    * TODO Loop 3
    *      - Iterate over each back until limit of inventory reached
    *      - Verify that there are no bags under or over count
    */
  }
}