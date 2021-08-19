public abstract class Field {

private int number;
private String name;
private int fieldRent;
private boolean owned;

  Player player1 = new Player( "Sven", "Pink", 4000);
  Player player2 = new Player( "Jens", "Green", 4000);
  Player player3 = new Player( "Hans", "Red", 4000);
  Player player4 = new Player( "Jørgen", "Blue", 4000);
  Player player5 = new Player( "Gordon", "Yellow", 4000);


  public Field(String name, boolean owned, int fieldNumber, int fieldPrice, int fieldRent) {
  }

  public Field() {

  }

  public abstract int landOnField(Player player);


}
