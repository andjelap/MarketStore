public class BronzeCard extends MarketStore {

    private double  valueOfPurchase;
    private double turnover;

    public BronzeCard(double valueOfPurchase, double turnover){
        this.valueOfPurchase = valueOfPurchase;
        this.turnover = turnover;
    }

    @Override
    public double discount_rate() {
        if(this.turnover < 100)
          return 0;
        else if(this.turnover >= 100 && this.turnover <= 300)
            return 1;
        else
            return 2.5;
    }

    @Override
    public double discount(double discountRate) {
        return (this.valueOfPurchase * discountRate)/100;
    }

    @Override
    public double total_purchase(double discount) {
        return this.valueOfPurchase - discount;
    }

    public double getTurnover() {
        return turnover;
    }

    public double getValueOfPurchase() {
        return valueOfPurchase;
    }
}
