package activitynine;

/** Implements a Fraction type.
 *
 * @author {Your Name Here}
 */
public class Fraction {
  
  // Instance variables
  private int numer;
  private int denom;
  
  /** Constructor.
   *
   * @param numer Numerator
   * @param denom Denominator
   */
  public Fraction(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;
  }
  
  /** Sets the numerator of the fraction.
   *
   * @param value The value to set
   */
  public void setNumer(int value) {
    this.numer = value;
  }
  
  /** Sets the denominator of the fraction.
   *
   * @param value The value to set
   */
  public void setDenom(int value) {
    this.denom = value;
  }
  
  /** Subtracts a fraction with same denom.
   *
   * @param subtract Fraction to subtract
   */
  /*
   * TODO: Write method to subtract a fraction
   *       from the current fraction.
   */
   
  /** Multiplies a fraction with this instance.
   *
   * @param multiplier Fraction to mulitply
   */
  /*
   * TODO: Write method to multiply a fraction
   *       with the current fraction.
   */
  
  /** Retrieves the numerator as int.
   *
   */
  public int getNumer() {
    return this.numer;
  }
  
  /** Retrieves the denominator as int.
   *
   */
  public int getDenom() {
    return this.denom;
  }
  
  /** Gets the value of the fraction in decimal form.
   *
   */
  public double getDecimalValue() {
    return (double)this.numer / (double)this.denom;
  }
  
  /** Provide String object representation.
   *
   */
  public String toString() {
    return this.numer + "/" + this.denom;
  }
}