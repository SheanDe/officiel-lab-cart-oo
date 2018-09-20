package ca.ulaval.glo4002.cart.domain.shop;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class FragileShopItem  extends ShopItem {

  private static final float SHIPPING_PRICE_PER_KG = 3;
  private static final float STANDART_SHIPPING_PRICE = 5;

  @XmlElement
  @JsonProperty
  private String itemSku;

  @XmlElement
  @JsonProperty
  private String name;

  @XmlElement
  @JsonProperty
  private boolean available;

  @XmlElement
  @JsonProperty
  private int price;

  @XmlElement
  @JsonProperty
  private int weight;

  @XmlElement
  @JsonProperty
  // Ne pas enlever @JsonProperty, ceci sert pour le panneau d'admin où on saisit les items
  private double profitMarginPercentage;

  private FragileShopItem() {
    // JAXB
  }

  public FragileShopItem(String itemSku, String name, int price, int weight, double profitMarginPercentage,
                          boolean available) {
    this.itemSku = itemSku;
    this.name = name;
    this.price = price;
    this.weight = weight;
    this.profitMarginPercentage = profitMarginPercentage;
    this.available = available;
  }
    @Override
    public String getName() {
      return name;
    }

    @Override
    public boolean isAvailable() {
      return available;
    }

    @Override
    public boolean hasSku(String sku) {
      return this.itemSku.equals(sku);
    }

    @Override
    public int getPrice() {
      return (int) (SHIPPING_PRICE_PER_KG * weight + STANDART_SHIPPING_PRICE + price);
    }

    @Override
    public int getWeight() {
      return weight;
    }

    @Override
    public boolean isPrime() {
      return true;
    }
}
