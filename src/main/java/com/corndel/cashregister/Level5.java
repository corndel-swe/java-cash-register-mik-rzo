package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level5 {
  /**
   * Calculates the amount of change the customer is owed based on the cost and
   * the amount paid. Adds the customer's paid amount to the drawer, removes their
   * change from the drawer, and then returns the updated drawer.
   * 
   * <p>
   * The paid items must be added to the drawer before removing the appropriate
   * change.
   * 
   * <p>
   * E.g., if the customer pays for $8.50 worth of goods with a $5 and 4 * $1
   * bills, then `paid` will be given as
   * 
   * List.of(new Item("five", 500, 1), new Item("one", 100, 4))
   * 
   * A "five" and a "one" should be added to the drawer, and two "quarters" should
   * be removed as change.
   * 
   * <p>
   * If you want to re-use some functions from other levels, you can do, e.g.
   * Level1.addItem(...) and so on.
   */
  public static List<Item> transaction(int cost, List<Item> paid, List<Item> drawer) {
    // TODO
    return null;
  }

}
