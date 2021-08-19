public class Player {

  private String name;
  private String color; // The color of the players piece
  private int bankBalance; // The players bank balance
  private final int startMoney = 4000; // The money a player begins with
  private int withdrawAmount;
  private int depositAmount;
  //private Ownable[] owned = new Ownable[5];

  public String toString() {
    return "Current Player info -\n" + name + ": " + color + "\nBank Balance: " + bankBalance;
  }

  //-----------------------Player Constructor-----------------------
  Player(String name, String color, int bankBalance){

    this.name = name;
    this.color = color;
    this.bankBalance = bankBalance;
    //this.owned = owned;
  }

  public String getColor() {
    return color;
  }

  public int getBankBalance() {
    return bankBalance;
  }

  public int getStartMoney() {
    return startMoney;
  }

  //-----------------Withdraw money from the bank-------------------
  public int withdrawMoney(int withdrawAmount) {

    if (withdrawAmount > bankBalance) {

      System.out.println("You poor boi, you ain't got enough money");
      return bankBalance = 0;
    } else {

      return bankBalance -= withdrawAmount;
    }
  }

  public int depositMoney(int depositAmount) {

    return bankBalance += depositAmount;
  }

  public int gameStart() {

    bankBalance += startMoney;
    return bankBalance;
  }
}
