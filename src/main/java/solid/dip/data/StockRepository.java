package solid.dip.data;

public class StockRepository implements Stock {

    @Override
    public int getCurrentStock(String shop, String productName) {
        return DataBase.stocks.get(shop).get(productName);
    }
}
