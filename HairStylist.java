public class HairStylist extends MakeupStylist {

   /*
   * My instance variable
   */  
  private boolean wantsHairDone;   // do they want their hair done?

  // My no-argument constructor
  /*
   * Sets the wantsHairDone as true (if true)
   */
  public HairStylist() {
    wantsHairDone = true;
  }


   // My parameterized constructor
   /*
   * Sets the price to te specified price, service to the specified service,
   * stylist to the specified stylist, glam to the specified glam
   * and wantsHairDone to true
   */ 
  public HairStylist(double price, String service, String stylist, String glam, boolean wantsHairDone) {
    super(price, service, stylist, glam);
    this.wantsHairDone = wantsHairDone;
  }

  
  // My accessor method
  /*
   * Returns Yes if the person wants their hair done (true),
   * and returns No if they do not (false).
   */
  public String getWantsHairDone() {
    if(wantsHairDone == true){
      return "Yes";
    } else
      return "No";
  }

  
  // My mutator method
  /*
   * Sets if they want their hair done
   */
  public void setWantsHairDone(boolean wantsHairDone) {
    this.wantsHairDone = wantsHairDone;
  }

  
  /*
   * My toString method
   */
  public String toString() {
    return super.toString() + "\nWants hair done?: " + wantsHairDone;
  }
  
}