public class Main {
    public static void main(String[] args) {
        double itemPrice = 128.39; // this is actually the market price of a card I'm looking at. T-T I love being a card collector.
        double SALES_TAX = .05;
        double itemPriceWithTax = itemPrice + (itemPrice * SALES_TAX);
        System.out.println("If the price of your item is " + itemPrice + ", then the price of your item after sales tax is " + itemPriceWithTax + ".");
    }
}