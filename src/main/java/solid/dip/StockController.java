package solid.dip;

import solid.dip.data.StockRepository;

public class StockController {

    private final StockRepository stockRepository;

    public StockController(StockRepository stockRepository) {
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
