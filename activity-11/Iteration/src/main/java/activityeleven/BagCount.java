package activityeleven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BagCount {

  public static void main(String[] args) {
    
    // Create Scanner to read file
    Scanner input = null;
    File file = null;
    try {
      file = new File("inputs/mm.csv");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    /*
     * TODO Set up required variables
     */
    
    // Print headers
    System.out.println("Blue\tYellow\tRed\tGreen\tOrange\tBlue\tTotal");
    
    /*
     * TODO Iterate over file contents, then iterate on each line
     */
  }
}