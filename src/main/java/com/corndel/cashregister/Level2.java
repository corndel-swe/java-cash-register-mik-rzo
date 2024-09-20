package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level2 {
  /**
   * Goes through the given drawer and counts how many *coins* there are in total
   * 
   * <p>
   * N.b. just the number of coins, not the total value of them
   * 
   * <p>
   * N.b. $1 is a note, not a coin
   */
  public static int countCoins(List<Item> drawer) {
    int count = 0;
    for (Item item : drawer) {
      if (item.getValue() < 100) {
        count += item.getQuantity();
      }
    }
    return count;
  }

  /**
   * Same as count coins but for *notes* instead
   */
  public static int countNotes(List<Item> drawer) {
    int count = 0;
    for (Item item : drawer) {
      if (item.getValue() >= 100) {
        count += item.getQuantity();
      }
    }
    return count;
  }
}
