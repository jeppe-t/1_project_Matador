public class Refuge extends Field {

  private int bonus = 4000;
  private int fieldNumber = 21;
  private String name = "Refuge Field";

  public Refuge (String name, int fieldNumber, int bonus) {
  }

  @Override
  public int landOnField(Player player) {
    return player.depositMoney(bonus);
  }

  @Override
  public String toString() {
    return "Refuge " +
        "bonus = " + bonus +
        ", fieldNumber = " + fieldNumber +
        ", name = '" + name + '\'';
  }
}
