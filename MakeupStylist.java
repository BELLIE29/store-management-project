public class MakeupStylist extends Makeover {

   /*
   * My instance variable
   */
  private String glam;   // the makeup look being done

  // My no-argument constructor
  /*
   * Sets the type of glam to soft
   */
  public MakeupStylist() {
    glam = "soft";
  }


   // My parameterized constructor
  /*
   * Sets the price to te specified price, service to the specified service,
   * stylist to the specified stylist, and glam to the specified glam
   */
  public MakeupStylist(double price, String service, String stylist, String glam) {
    super(price, service, stylist);
    this.glam = glam;
  }

  // My accessor method
  /*
   * Returns the glam
   */
  public String getGlam() {
    return glam;
  }

  /*
   * Sets the glam
   */
  public void setGlam(String glam) {
    this.glam = glam;
  }

  /*
   * My toString method
   */
  public String toString() {
    return super.toString() + "\nGlam: " + glam;
  }


}