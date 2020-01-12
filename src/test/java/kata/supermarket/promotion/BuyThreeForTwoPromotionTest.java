package kata.supermarket.promotion;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class BuyThreeForTwoPromotionTest {

    @Test
    public void applyPromotion_WHEN_NullItems_THEN_ShouldReturnNoSaving() {
        BuyThreeForTwoPromotion buyThreeForTwoPromotion = new BuyThreeForTwoPromotion();
        final BigDecimal actualSavings = buyThreeForTwoPromotion.applyPromotion(null);
        assertThat(actualSavings).isEqualByComparingTo("0.00");
    }
}
