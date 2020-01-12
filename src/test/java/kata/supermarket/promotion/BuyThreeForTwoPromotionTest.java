package kata.supermarket.promotion;

import kata.supermarket.item.Item;
import kata.supermarket.product.Product;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BuyThreeForTwoPromotionTest {

    private BuyThreeForTwoPromotion buyThreeForTwoPromotion;

    @Before
    public void setup() {
        buyThreeForTwoPromotion = new BuyThreeForTwoPromotion();
    }

    @Test
    public void applyPromotion_WHEN_NullItems_THEN_ShouldReturnNoSaving() {
        final BigDecimal actualSavings = buyThreeForTwoPromotion.applyPromotion(null);
        assertThat(actualSavings).isEqualByComparingTo("0.00");
    }

    @Test
    public void applyPromotion_WHEN_SingleItem_THEN_ShouldReturnNoSaving() {
        final Item item = aPintOfMilk();
        final BigDecimal actualSavings = buyThreeForTwoPromotion.applyPromotion(Arrays.asList(item));
        Assertions.assertThat(actualSavings).isEqualByComparingTo("0.00");
    }

    @Test
    public void applyPromotion_WHEN_ThreeItems_THEN_OneTimesSavings() {
        final Item item = aPintOfMilk();
        final BigDecimal actualSavings = buyThreeForTwoPromotion.applyPromotion(Arrays.asList(item, item, item));
        Assertions.assertThat(actualSavings).isEqualByComparingTo("0.49");
    }



    private static Item aPintOfMilk() {
        return new Product(new BigDecimal("0.49")).oneOf();
    }
}
