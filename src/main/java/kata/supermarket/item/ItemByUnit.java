package kata.supermarket.item;

import kata.supermarket.product.Product;

import java.math.BigDecimal;

public class ItemByUnit implements Item {

    private final Product product;

    public ItemByUnit(final Product product) {
        this.product = product;
    }

    public BigDecimal price() {
        return product.pricePerUnit();
    }

    public String barCode() {
        return product.getBarcode();
    }
}
