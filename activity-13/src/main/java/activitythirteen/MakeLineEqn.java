package activitythirteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Makes a linear equation.
 *
 * @author {Your Name Here}
 */
public class MakeLineEqn {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/points.list");
      input = new Scanner(file);
    } catch(FileNotFoundException noFile) {
      System.exit(0);
    }
    
    /*
     * TODO Initialize Scanner for line read
     *      Initialize array for holding points
     */ 
    
    /* 
     * TODO Iterate over file
     *        Iterate over line
     *        Save points in data structure
     */ 
    
    /*
     * TODO Subtract "Y" points
     *      Subtract "X" points
     *      Calculate the "Slope"
     */
    
    // TODO Print results
  }
}