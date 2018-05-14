package szkolenie;

public class ShoppingCart {
    
    public static void main(String[] args) {
       Item item1 = new Item();
       Item item2 = new Item();
       
       item1.descr = "Apple";
       item2.descr = "Pear";
       
       System.out.println("Product 1: " + item1.descr + "\nProduct 2: "+ item2.descr);
        
       item2 = item1;
       System.out.println(" -------");
       System.out.println("Product 1: " + item1.descr + "\nProduct 2: "+ item2.descr);
       
       char color = ' ';
       
       System.out.println(" -------");
       
       if(item1.setColor(color)) System.out.println("Item color: " + item1.color);
       else System.out.println("Invaild color");
       
       System.out.println(" -------");
       
        item1.setItemFields("Banana", 15, 23);
        item1.displayItem();
        
        System.out.println(" -------");
        
        item1.setItemFields("Apple", 25, 50, 'r');
        item1.displayItem();
       
    }
}
