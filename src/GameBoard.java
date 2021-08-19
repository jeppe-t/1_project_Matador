public class GameBoard {

  private Field[] field = new Field[5];
  public void opretFelter(){

    Refuge refuge = new Refuge("Refuge", 21, 4000);
    Taxes taxes = new Taxes("Taxes", 6, 4000);
    Shipping shipping = new Shipping("Rederi", 6, 4000, 500, false);
    Street street = new Street("Rådhuspladsen", 40, 3000, 300, false);
    Brewery brewery = new Brewery("Coca Cola", false, 13, 3000, 0);

    field[0] = refuge;
    field[1] = taxes;
    field[2] = shipping;
    field[3] = street;
    field[4] = brewery;
    for (int i = 0; i < field.length; i++) {
      System.out.println(field[i]);
    }

  }

  public Field[] getField() {

    return field;
  }
}