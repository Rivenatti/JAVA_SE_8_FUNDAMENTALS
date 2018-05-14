package szkolenie;

public class ShoppingCart {
    
    public static void main(String[] args) {
       Order ord = new Order();
       
        System.out.println("Discount = " + ord.calcDiscount(901, "Corporate"));
    }
}
