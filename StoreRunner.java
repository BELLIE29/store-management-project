import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object
    Scanner input = new Scanner(System.in);

    /*
   * Instantiates my makeover object
   */
    Makeover makeover = new Makeover(129.99, "Makeup", "Anna");

    /*
   * Prints a line of "Price, Service, and stylist: ", then attaches
   * the toString to add to the sentence
   */
    System.out.println("Price, Service, and Stylist: " + makeover.toString());
    System.out.println("What Is My Price, Service, and Stylist?");

    double userPrice = input.nextDouble();
    input.nextLine();
    String userService = input.nextLine();
    String userStylist = input.nextLine();

    makeover.setPrice(userPrice);
    makeover.setService(userService);
    makeover.setStylist(userStylist);

    System.out.println("My Price, Service, and Stylist: " + userPrice + ", " + userService + ", " + userStylist);
    System.out.println("\n");   // creates a new line

   /*
   * Instantiates my makeupStylist object
   */
MakeupStylist makeupStylist = new MakeupStylist(149.99, "Makeup", "Kat", "Soft");
    System.out.println("Price, Service, Stylist, and Glam: " + makeupStylist.toString());
    System.out.println("What Is My Price, Service, Stylist, and Glam?");

    userPrice = input.nextDouble();
    input.nextLine();
    userService = input.nextLine();
    userStylist = input.nextLine();
    String userGlam = input.nextLine();

    makeupStylist.setPrice(userPrice);
    makeupStylist.setService(userService);
    makeupStylist.setStylist(userStylist);
    makeupStylist.setGlam(userGlam);

    System.out.println("My Price, Service, Stylist, and Glam Look: " + userPrice + ", " + userService + ", " + userStylist + ", " + userGlam);
    System.out.println("\n");  // creates a new line


    /*
   * Instantiates my hairStylist object
   */
HairStylist hairStylist = new HairStylist(179.99, "Hair", "Dan", "Soft", true);
    System.out.println("Price, Service, Stylist, Glam, and If You Want Your Hair Done: " + hairStylist.toString());
    System.out.println("What Is My Price, Service, and Glam, and Do I Want My Hair Done?: ");

    userPrice = input.nextDouble();
    input.nextLine();
    userService = input.nextLine();
    input.nextLine();
    userStylist = input.nextLine();
    userGlam = input.nextLine();
    boolean userHairStylist = input.nextBoolean();

    hairStylist.setPrice(userPrice);
    hairStylist.setService(userService);
    hairStylist.setStylist(userStylist);
    hairStylist.setGlam(userGlam);
    hairStylist.setWantsHairDone(userHairStylist);

System.out.println("My Price, Service, Stylist, and Glam Look, and Do I Want My Hair Done: " + userPrice + ", " + userService + ", " + userStylist + ", " + userGlam + ", " + userHairStylist);

    
    





    // Closes the Scanner object
   input.close();
    
  }
}