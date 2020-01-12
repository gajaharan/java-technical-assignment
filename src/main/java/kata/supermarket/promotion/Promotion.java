package kata.supermarket.promotion;

import kata.supermarket.item.Item;

import java.math.BigDecimal;
import java.util.List;

public interface Promotion {
    BigDecimal applyPromotion(List<Item> items);
}
