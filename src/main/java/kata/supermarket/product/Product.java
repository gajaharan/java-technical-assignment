package kata.supermarket.product;

import kata.supermarket.item.Item;
import kata.supermarket.item.ItemByUnit;

import java.math.BigDecimal;

public class Product {

    private final BigDecimal pricePerUnit;
    private final String barcode;

    public Product(final String barcode, final BigDecimal pricePerUnit) {
        this.barcode = barcode;
        this.pricePerUnit = pricePerUnit;
    }

    public BigDecimal pricePerUnit() {
        return pricePerUnit;
    }

    public Item oneOf() {
        return new ItemByUnit(this);
    }

    public String getBarcode() {
        return barcode;
    }
}
