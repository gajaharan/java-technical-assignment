package kata.supermarket.calculator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class TotalCalculatorTest {

    @Test
    public void calculate_WHEN_NullProducts_THEN_TotalAmountIsZero() {
        TotalCalculator totalCalculator = new TotalCalculator();

        BigDecimal actualTotalAmount = totalCalculator.calculate();
        assertThat(actualTotalAmount).isEqualByComparingTo("0.00");

    }
}
