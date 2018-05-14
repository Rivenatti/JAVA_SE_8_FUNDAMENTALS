package szkolenie;

public class Order {
    public void calcDiscount(int orderTotal, String custType){
        
        int discount = 0;
        
        if(custType.equals("Nonprofits")){
            if(orderTotal > 900){
                System.out.println("Discount = 10%");
            }else{
                System.out.println("Doscount = 5%");
            }
        } // END NOPROFITS
        
        if(custType.equals("Private")){
            if(orderTotal > 900){
                System.out.println("Discount = 7%");
            }else{
                System.out.println("No discount for this option.");
            }
        } // END PRIVATE
        
        if(custType.equals("Corporate")){
            if(orderTotal > 0 && orderTotal < 500){
                System.out.println("Discount = 8%");
            }else{
                System.out.println("Discount = 5%");
            }
        } // END CORPORATE
        
    }
}
