public class Billing {
    static double TAX = 0.08;
    public int quantities;
    public double coupon_value, price;

    public double computeBill(double price){
        this.price = price;
        quantities = 1;
        coupon_value = 0;
        double total = price * quantities * (1 - coupon_value) * (1 + TAX);
        System.out.println("The price of text book include TAX is $" + total);
        return total;
    }
    public double computeBill(double price, int quantities){
        this.price = price;
        this.quantities = quantities;
        coupon_value = 0;
        double total = price * quantities * (1 - coupon_value) * (1 + TAX);
        System.out.println("The price of " + quantities + " books include TAX is $" + total);
        return total;
    }
    public double computeBill(double price, int quantities, double coupon_value){
        this.price = price;
        this.quantities = quantities;
        this.coupon_value = coupon_value;
        double total = price * quantities * (1 - coupon_value) * (1 + TAX);
        System.out.println("The price of " + quantities + " books include TAX is $" + total);
        return total;
    }

    public static void main(String[] args){
        Billing book1 = new Billing();
        Billing book2 = new Billing();
        book1.computeBill(10.2);
        book1.computeBill(10.2, 4);
        book1.computeBill(10.2, 6, 0.1);
        book2.computeBill(20.31);
        book2.computeBill(20.31, 2);
        book2.computeBill(20.31, 3, 0.35);

    }
}
