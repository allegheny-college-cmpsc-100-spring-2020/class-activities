package activityfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Creates and plays a word ladder game.
 *
 * @author {GROUP NAMES HERE}
 */
public class WordLadder {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create identifiers for input
    File file = null;
    Scanner input = null;
    // Read input from file
    try {
      file = new File("input/words.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String word = new String();
    String startingWord = input.nextLine();
    
    // TODO: Create identifiers, correct casing
    
    // TODO: Word ladder, step 1
    
    // TODO: Word ladder, step 2
    
    // TODO: Word ladder, step 3
    
    // TODO: Word ladder, step 4
    
    // TODO: Word ladder, step 5
    
    // TODO: Word ladder, step 6
    
    // Final comparison
    //System.out.print(word + " = " + finalWord + ": ");
    //System.out.print(word.equals(finalWord));
  }
}