package szkolenie;

public class Order {
    public int calcDiscount(int orderTotal, String custType){
        
        int discount = 0;
        
        switch(custType){
            case "Nonprotifts": discount = (orderTotal>900)? 10 : 5; break;
            case "Private": discount = (orderTotal>900)? 7 : 0; break;
            case "Corporate": discount = (orderTotal<500)? 8 : 5; break;
            default: System.out.println("There's no such an option.");
        }
        
        return discount;
        
    }
}
