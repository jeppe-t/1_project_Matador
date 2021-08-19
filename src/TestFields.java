public class TestFields {

  public static void main(String[] args) {

    Player player1 = new Player( "Sven", "Pink", 4000);
    Player player2 = new Player( "Jens", "Green", 4000);
    Player player3 = new Player( "Hans", "Red", 4000);
    Player player4 = new Player( "Jørgen", "Blue", 4000);
    Player player5 = new Player( "Gordon", "Yellow", 4000);


    Refuge refuge = new Refuge("Refuge", 21, 4000);
    Taxes taxes = new Taxes("Taxes", 5, 4000);
    Shipping shipping = new Shipping("Rederi", 6, 4000, 500, false);
    Street street = new Street("Rådhuspladsen", 40, 3000, 300, false);
    Brewery brewery = new Brewery("Coca Cola", false, 13, 3000, 0);

    // The players stats in the beginning of the game
    System.out.println(player1);
    System.out.println(player2);

    // If you land on the field refuge you will receive 4000 kr. in you bank account
    System.out.println("\nPlayer 1 lands on refuge: " + refuge.landOnField(player1));

    // Taxes has to be payed, and the amount is 2000 kr.
    System.out.println("\nPlayer 1 rolls and lands on the field taxes, his new bank balance is down to: "
        + taxes.landOnField(player1));

    // Rent on the shipping field will be 500 for only one owned shipping field
    System.out.println("Player 2 rolls and lands on the field shipping and has to pay rent - new balance: "
        + shipping.landOnField(player2));

    System.out.println("Player 1 rolls a 3 and lands on a brewery field - his new balance is: "
        + brewery.landOnField(player1));

    System.out.println("Player 3 rolls and lands on a street, he buys it - new balance: " + street.landOnField(player3));

    System.out.println(player1);
    System.out.println(player2);
    System.out.println(player3);

  }
}
