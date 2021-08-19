import java.util.ArrayList;

public class Brewery extends Ownable {
  private int breweryRent;
  private int sum;
  private int fieldNumber1 = 13;
  private int fieldNumber2 = 29;
  private String name1 = "Coca Cola";
  private String name2 = "Faxe Kondi";


  public Brewery(String name, boolean owned, int fieldNumber, int fieldPrice, int fieldRent) {
    super(name, fieldNumber, fieldPrice, fieldRent, owned);

    //Brewery cocaCola = new Brewery("Coca Cola", false, 13, 3000, 0);
    //Brewery faxeKondi = new Brewery("Faxe Kondi", false, 29, 3000, 0);

    ArrayList<Brewery> brewery = new ArrayList<>();

    //brewery.add(cocaCola);
    //brewery.add(faxeKondi);
    int sum = 3;


    for (int i = 0; i < brewery.size(); i++) {
      if (brewery.size() > 1) {
        breweryRent = sum * 100 * 2;
      } else if (brewery.size() < 2) {
        breweryRent = sum * 100;
      }
    }
  }

  public Brewery() {
  }

  @Override
  public String toString() {
    return "Brewery" +
        ", fieldNumber1 = " + fieldNumber1 +
        ", name1 = '" + name1 + '\'' +
        ", fieldNumber2 = " + fieldNumber2 +
        ", name2 = '" + name2 + '\'' ;
  }

  @Override
  public int landOnField(Player player1) {
    player1.withdrawMoney(300);
    return player1.getBankBalance();
  }
}

