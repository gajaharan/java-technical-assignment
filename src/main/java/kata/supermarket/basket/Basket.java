package kata.supermarket.basket;

import kata.supermarket.calculator.TotalCalculator;
import kata.supermarket.item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {
    private final List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void add(final Item item) {
        this.items.add(item);
    }

    List<Item> items() {
        return Collections.unmodifiableList(items);
    }

    public BigDecimal total() {
        TotalCalculator totalCalculator = new TotalCalculator(this.items);
        return totalCalculator.calculate();
    }
}
