public class Main {

    public static void main(String[] args) {
        BronzeCard bronze = new BronzeCard(150,0);
        SilverCard silver = new SilverCard(850, 600);
        GoldCard gold = new GoldCard(1300, 1500);

        System.out.println("1. Bronze:");
        System.out.println("  a. Mock data: turnover $"+ bronze.getTurnover() + ", purchase value $"+ bronze.getValueOfPurchase() + ";");
        System.out.println("  b. Output: ");
        System.out.println("  Purchase value: $" + bronze.getValueOfPurchase());
        System.out.println("  Discount rate: " + bronze.discount_rate() + "%");
        System.out.println("  Discount: $" + bronze.discount(bronze.discount_rate()));
        System.out.println("  Total: $" + bronze.total_purchase(bronze.discount(bronze.discount_rate())));
        System.out.println();

        System.out.println("2. Silver:");
        System.out.println("  a. Mock data: turnover $"+ silver.getTurnover() + ", purchase value $"+ silver.getValueOfPurchase() + ";");
        System.out.println("  b. Output: ");
        System.out.println("  Purchase value: $" + silver.getValueOfPurchase());
        System.out.println("  Discount rate: " + silver.discount_rate() + "%");
        System.out.println("  Discount: $" + silver.discount(silver.discount_rate()));
        System.out.println("  Total: $" + silver.total_purchase(silver.discount(silver.discount_rate())));
        System.out.println();


        System.out.println("3. Gold:");
        System.out.println("  a. Mock data: turnover $"+ gold.getTurnover() + ", purchase value $"+ gold.getValueOfPurchase() + ";");
        System.out.println("  b. Output: ");
        System.out.println("  Purchase value: $" + gold.getValueOfPurchase());
        System.out.println("  Discount rate: " + gold.discount_rate() + "%");
        System.out.println("  Discount: $" + gold.discount(gold.discount_rate()));
        System.out.println("  Total: $" + gold.total_purchase(gold.discount(gold.discount_rate())));

    }
}
