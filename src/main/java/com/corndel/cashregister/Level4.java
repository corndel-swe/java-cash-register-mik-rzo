package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;

import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    for (Item item : drawer) {
      if (target < item.getValue()) {
        continue;
      }
      int quantity = item.getQuantity();
      if (quantity == 0) {
        continue;
      }
      while (quantity != 0) {
        if (target < item.getValue()) {
          break;
        }
        target -= item.getValue();
        quantity--;
      }
    }
    return target == 0 ? true : false;
  }
}
