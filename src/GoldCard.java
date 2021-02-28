public class GoldCard extends MarketStore {

    private double  valueOfPurchase;
    private double turnover;

    public GoldCard(double valueOfPurchase, double turnover){
        this.valueOfPurchase = valueOfPurchase;
        this.turnover = turnover;
    }


    @Override
    public double discount_rate() {
        int inc = (int)(this.turnover / 100);
        if((inc+2) >= 10)
            return 10;
        else
            return 2 + inc;
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
