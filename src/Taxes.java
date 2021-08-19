public class Taxes extends Field {

  private int taxes = 2000;
  private int fieldNumber1 = 5;
  private int fieldNumber2 = 39;

  public Taxes (String name, int fieldNumber1, int taxes) {
  }

  @Override
  public int landOnField(Player player) {
    return player.withdrawMoney(taxes);
  }

  @Override
  public String toString() {
    return "Taxes " +
        "taxes = " + taxes +
        ", fieldNumber1 = " + fieldNumber1 +
        ", fieldNumber2 = " + fieldNumber2;
  }
}
