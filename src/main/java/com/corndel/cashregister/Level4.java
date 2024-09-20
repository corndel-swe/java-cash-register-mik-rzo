package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;

import java.util.Collections;
import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    System.out.println(target);
    
    // Reverse order of list
    Collections.reverse(drawer);
    
    for (Item item : drawer) {
      target -= item.getQuantity() * item.getValue();
      if (target <= 0) {
        break;
      }
    }
    
    // Reset order of list
    Collections.reverse(drawer);
    
    return target == 0 ? true : false;
  }
}
