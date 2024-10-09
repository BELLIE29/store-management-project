public class Makeover extends StoreRunner{

  /*
   * My instance variables
   */
  private double price;     // the price of the makeover
  private String service;   // the name of service being done
  private String stylist;   // the name of the stylist performing the service

  // My no-argument constructor
  /*
   * Sets the price to 149.99, title to "Makeover" and
   * the stylist to the Betty
   */
  public Makeover() {
    this(149.99, "Makeover", "Betty");
  }

  // My parameterized constructor
  /*
   * Sets the price to te specified price, service to the specified service
   * and the stylist to the specified stylist
   */
  public Makeover(double price, String service, String stylist) {
    this.price = price;
    this.service = service;
    this.stylist = stylist;
  }

  // My accessor methods
   /*
   * Returns the price of the makeover
   */
  public double getPrice() {
    return price;
  }

  /*
   * Returns the type of service the makeover is
   */
  public String getService() {
    return service;
  }

  /*
   * Returns the name of the stylist for the makeover
   */
  public String getStylist() {
    return stylist;
  }


  // My mutator methods
  /*
   * Sets the price
   */
  public void setPrice(double price) {
    if (price < 0) {
      this.price = 0;
    } else
      this.price = price;
  }

  /*
   * Sets service to service
   */
  public void setService(String service) {
    this.service = service;
  }


  /*
   * Sets stylist to stylist
   */
  public void setStylist(String stylist) {
    this.stylist = stylist;
  }


  /*
   * My toString method
   */
  public String toString() {
    return "\nService: " + service + "\nStylist: " + stylist + "\nPrice: " + price;
  }


  
}