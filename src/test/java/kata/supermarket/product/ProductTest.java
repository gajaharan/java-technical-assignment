package kata.supermarket.product;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void singleItemHasExpectedUnitPriceFromProduct() {
        final BigDecimal price = new BigDecimal("2.49");
        assertEquals(price, new Product("1234", price).oneOf().price());
    }
}