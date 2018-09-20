package ca.ulaval.glo4002.cart.interfaces.rest;

import ca.ulaval.glo4002.cart.application.cart.CartRepository;
import ca.ulaval.glo4002.cart.application.shop.ShopRepository;

public class PersistenceProvider {
  public static CartRepository getCartRepository() {
    if (System.getProperty("store").equalsIgnoreCase("xml")) {
      // xml
    } else {
      // in memory
    }
  }

  public static ShopRepository getShopRepository() {
    if (System.getProperty("store").equalsIgnoreCase("xml")) {
      // xml
    } else {
      // in memory
    }
}