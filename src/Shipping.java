import java.util.ArrayList;

public class Shipping extends Field {

  private int shippingrent;
  private int fieldNumber1 = 6;
  private int fieldNumber2 = 16;
  private int fieldNumber3 = 26;
  private int fieldNumber4 = 36;
  private String name1 = "Lindfinger A/S";
  private String name2 = "Grenaa Hundested";
  private String name3 = "Mold-Linjen";
  private String name4 = "Skandinavisk lindvistik";



  public Shipping(String name, int fieldNumber, int price, int rent, boolean owned) {
    super("Rederiet Lindfinger A/S", false, 4000, 500, 6);

    /*
    Shipping rederi1 = new Shipping("Rederiet Lindfinger A/S", 6, 4000, 500, false);
    Shipping rederi2 = new Shipping("Grenaa Hundested", 16, 4000, 500, false);
    Shipping rederi3 = new Shipping("Mols-Linjen", 26, 4000, 500, false);
    Shipping rederi4 = new Shipping("Skandinavisk lindvistik", 36, 4000, 500, false);

     */

    ArrayList<Shipping> shipping = new ArrayList<>(); //array med owned rederier

    /*
    shipping.add(rederi1);
    shipping.add(rederi2);
    shipping.add(rederi3);
    shipping.add(rederi4);

     */

    for (int i = 0; i < shipping.size(); i++) { //for hvert rederi sat i arrayet, tilføj 500kr i fieldRent
      if (shipping.size() > 1 && shipping.size() <= 2) {
        shippingrent = 1000;
      }
      if (shipping.size() > 2 && shipping.size() <= 3) {
        shippingrent = 1500;
      }
      if (shipping.size() > 3 && shipping.size() <= 4) {
        shippingrent = 2000;
      }
    }
  }

  //public int getShippingrent() {
   // return shippingrent;
 // }

  @Override
  public String toString() {
    return "Shipping " +
        ", fieldNumber1 = " + fieldNumber1 +
        ", name1 = '" + name1 + '\'' +
        ", fieldNumber2 = " + fieldNumber2 +
        ", name2 = '" + name2 + '\'' +
        ", fieldNumber3 = " + fieldNumber3 +
        ", name3 = '" + name3 + '\'' +
        ", fieldNumber4 = " + fieldNumber4 +
        ", name4 = '" + name4 + '\'';
  }

  public int landOnField(Player player1) {
    player1.withdrawMoney(500);
    return player1.getBankBalance();
  }
}