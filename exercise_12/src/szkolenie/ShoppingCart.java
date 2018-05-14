package szkolenie;

public class ShoppingCart {
    
    public static void main(String[] args) {
       Shirt sh1 = new Shirt(3.45, 'L', 'b');
       sh1.displayItem();
       
       if(sh1 instanceof Shirt){
           String color = sh1.getColor('b');
           System.out.println("Color:" + color);
       } else {
           System.out.println("It's not a shirt!");
       }
       
    }
}
