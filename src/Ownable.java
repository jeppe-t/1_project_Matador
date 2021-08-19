public abstract class Ownable extends Field {

  private Player owner;
  private GameBoard gameboard;

  public Ownable(String name, int fieldNumber, int fieldPrice, int fieldRent, boolean owned) {
  }

  public abstract int landOnField(Player player);
  public Player getOwner() {
    return owner;
  }

  public void setOwner(Player owner) {
    this.owner = owner;
  }

  public GameBoard getGameboard() {
    return gameboard;
  }


  public Ownable(String name, int fieldNumber, int fieldPrice, int fieldRent,boolean owned, GameBoard gameboard) {
    this.gameboard = gameboard;
  }

  public Ownable() {

  }
}