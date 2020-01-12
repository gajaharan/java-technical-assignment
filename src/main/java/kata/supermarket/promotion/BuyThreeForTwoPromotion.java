package kata.supermarket.promotion;

import kata.supermarket.item.Item;

import java.math.BigDecimal;
import java.util.List;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;

public class BuyThreeForTwoPromotion implements Promotion{
    @Override
    public BigDecimal applyPromotion(List<Item> items) {
        if (isEmpty(items)) {
            return BigDecimal.ZERO;
        }

        long discountTimes = items.size() / 3;

        BigDecimal savings = items.get(0).price().multiply(new BigDecimal(discountTimes));

        return savings;
    }
}
