package kata.supermarket.promotion;

import kata.supermarket.item.Item;

import java.math.BigDecimal;
import java.util.List;

public class BuyThreeForTwoPromotion implements Promotion{
    @Override
    public BigDecimal applyPromotion(List<Item> items) {
        return BigDecimal.ZERO;
    }
}
