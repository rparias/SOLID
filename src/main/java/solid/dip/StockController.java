package solid.dip;

import solid.dip.data.Stock;

public class StockController {

    private final Stock stockRepository;

    public StockController(Stock stockRepository) {
        this.stockRepository = stockRepository;
    }

    public boolean areMoreProductsInStockNeeded(String shop, String productName) {
        int currentStock = stockRepository.getCurrentStock(shop, productName);
        return currentStock < getProductNameLength(productName);
    }

    private int getProductNameLength(String productName) {
        return productName.length() * 100;
    }
}
