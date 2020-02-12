package uk.co.supermarket.checkout.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import uk.co.supermarket.Checkout;

public class ScanningFixedPriceProducts {

    private int totalPrice;

    @Test
    void totalPriceShouldBe50AfterScanningItemCodeA() {
        new Checkout().scan('A');

        assertThat(totalPrice).isEqualTo(50);
    }
}
