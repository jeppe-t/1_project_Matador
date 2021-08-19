public class Street extends Ownable {

  Player player1 = new Player("Jens", "Black", 4000);
  Player player2 = new Player("Karl", "Red", 4000);
  private String name = "Rådhuspladsen";
  private int fieldNumber = 40;
  private boolean owned = false;
  private int price;
  private int rent;

  public Street(String name, int fieldNumber, int price, int rent, boolean owned) {
    super();

    this.name = name;
    this.fieldNumber = fieldNumber;
  }


  public int landOnField(Player player) {

    if (owned == false) {
      player.withdrawMoney(3000);
      return player.getBankBalance();
    } else {
      player.withdrawMoney(500);
      player2.depositMoney(500);
      return player.getBankBalance();
    }
  }


  @Override
  public String toString() {
    return "Street " +
        "field = " + name +
        ", fieldNumber = '" + fieldNumber + '\'';
  }
}


