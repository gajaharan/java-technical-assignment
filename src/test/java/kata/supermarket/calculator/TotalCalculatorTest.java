package kata.supermarket.calculator;

import kata.supermarket.item.Item;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class TotalCalculatorTest {

    @Test
    public void calculate_WHEN_NullItem_THEN_TotalAmountIsZero() {
        TotalCalculator totalCalculator = new TotalCalculator(null);

        BigDecimal actualTotalAmount = totalCalculator.calculate();
        assertThat(actualTotalAmount).isEqualByComparingTo("0.00");

    }

    @Test
    public void calculate_WHEN_OneItem_THEN_TotalAmountIsOne() {
        final Item item1 = Mockito.mock(Item.class);
        when(item1.price()).thenReturn(new BigDecimal("1.00"));
        when(item1.barCode()).thenReturn("Milk");
        TotalCalculator totalCalculator = new TotalCalculator(Arrays.asList(item1));

        BigDecimal actualTotalAmount = totalCalculator.calculate();
        assertThat(actualTotalAmount).isEqualByComparingTo("1.00");
    }

    @Test
    public void calculate_WHEN_ThreeItemsWith3For2Promotion_THEN_TotalAmountIsTwo() {

        final Item item1 = Mockito.mock(Item.class);
        when(item1.price()).thenReturn(new BigDecimal("1.00"));
        when(item1.barCode()).thenReturn("Milk");
        final Item item2 = Mockito.mock(Item.class);
        when(item2.price()).thenReturn(new BigDecimal("1.00"));
        when(item2.barCode()).thenReturn("Milk");
        final Item item3 = Mockito.mock(Item.class);
        when(item3.price()).thenReturn(new BigDecimal("1.00"));
        when(item3.barCode()).thenReturn("Milk");
        TotalCalculator totalCalculator = new TotalCalculator(Arrays.asList(item1, item2, item3));

        BigDecimal actualTotalAmount = totalCalculator.calculate();
        assertThat(actualTotalAmount).isEqualByComparingTo("2.00");
    }
}
