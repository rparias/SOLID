package solid.dip.data;

public class StockRepository {
    public int getCurrentStock(String shop, String productName) {
        return DataBase.stocks.get(shop).get(productName);
    }
}
