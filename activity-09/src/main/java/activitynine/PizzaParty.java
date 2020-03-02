package activitynine;

/** Solves the pizza party problem.
 * 
 * @author {Your Name Here}
 */
public class PizzaParty {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create fractions
    Fraction totalPizza = new Fraction(12,12);
    Fraction pizzaEaten = new Fraction(3,12);
    Fraction pizzaGiven = new Fraction(2,3);
    Fraction pizzaLeft = new Fraction(3,4);

    
    /*
     * TODO: Rewrite the problem using methods of Fraction
     */
    
    // Use the getDecimalValue method
    System.out.println("We have " + totalPizza + " (" + totalPizza.getDecimalValue()
                       + ") of a pizza remaining.");
  }
}