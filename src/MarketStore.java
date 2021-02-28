public abstract class MarketStore {

    public abstract double discount_rate();
    public abstract double discount(double discountRate);
    public abstract double total_purchase(double discount);


}
