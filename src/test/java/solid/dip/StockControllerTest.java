package solid.dip;

import org.junit.jupiter.api.Test;
import solid.dip.data.StockRepository;

import static org.assertj.core.api.Assertions.assertThat;

public class StockControllerTest {

    @Test
    void returnsTrueIfMoreItemsAreNeededInTheShop() {
        StockController stockController = new StockController(new StockRepository());
        String shop = "north shop";
        String productName = "table";

        boolean areProductsNeeded = stockController.areMoreProductsInStockNeeded(shop, productName);

        assertThat(areProductsNeeded).isTrue();
    }

    @Test
    void returnsFalseIfMoreItemsAreNotNeededInTheShop() {
        StockController stockController = new StockController(new StockRepository());
        String shop = "north shop";
        String productName = "table";

        boolean areProductsNeeded = stockController.areMoreProductsInStockNeeded(shop, productName);

        assertThat(areProductsNeeded).isFalse();
    }
}
